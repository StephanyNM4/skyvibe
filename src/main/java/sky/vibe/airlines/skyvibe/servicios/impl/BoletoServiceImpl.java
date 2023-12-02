package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Boleto;
import sky.vibe.airlines.skyvibe.modelos.Cliente;
import sky.vibe.airlines.skyvibe.modelos.Escala;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;
import sky.vibe.airlines.skyvibe.modelos.Asientos;
import sky.vibe.airlines.skyvibe.repositorios.AsientosRepository;
import sky.vibe.airlines.skyvibe.repositorios.ClienteRepository;
import sky.vibe.airlines.skyvibe.repositorios.EscalaRepository;
import sky.vibe.airlines.skyvibe.repositorios.VueloRepository;
import sky.vibe.airlines.skyvibe.repositorios.BoletoRepository;
import sky.vibe.airlines.skyvibe.servicios.BoletoService;

@Service
public class BoletoServiceImpl implements BoletoService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EscalaRepository escalaRepository;

    @Autowired
    private AsientosRepository asientosRepository;

    @Autowired
    private BoletoRepository boletoRepository;

    @Autowired
    private VueloRepository vueloRepository;
    
    @Override
    public Boleto crearBoleto(Boleto boleto, String idVuelo) {

    Vuelo vuelo = this.vueloRepository.findById(idVuelo).get();

        if(vuelo != null && vuelo.getTipoVuelo()){
        
            if (boleto.getCliente() != null) {
                Cliente cliente = this.clienteRepository.findById(boleto.getCliente().getIdCliente()).get();
                if (cliente != null) {
                    boleto.setCliente(cliente);
                }
            }

            boleto.setEscala(null);

            if (boleto.getAsiento() != null) {
            
                List<Asientos> asientos = vuelo.getAsientos();
                
                for (Asientos asiento : asientos) {
                    
                    if(asiento.getNombreAsiento().equals(boleto.getAsiento().getNombreAsiento())){
                    
                        if (asiento.getDisponible()) {
                            boleto.setAsiento(asiento);
                            asiento.setDisponible(false);
                            this.asientosRepository.save(asiento);
                        }
                    }
                }
            }
            return this.boletoRepository.save(boleto);
        }
        return null; 
    }
    

    @Override
    public List<Boleto> boletosDeUsuario(int id) {
        return this.clienteRepository.findById(id).get().getBoletos();
    }


    @Override
    public Double precioVueloDirecto(Vuelo vuelo) {
        return ( vuelo.getRuta().getDistancia() ) * 2.29;
    }

    @Override
    public Double precioTipoAsiento(int idAsiento) {
        Asientos asiento = this.asientosRepository.findById(idAsiento).get();

        if(asiento!= null && asiento.getDisponible()){
            return asiento.getTipoAsiento().getPrecioBase();
        }
        return null;
    }


    @Override
    public Double precioAsientoParaBoleto(String idVuelo, String nombreAsiento) {
        Vuelo vuelo = this.vueloRepository.findById(idVuelo).get();
        Double precioVuelo = 0.0;

        if(vuelo!= null && vuelo.getTipoVuelo()){
            
            precioVuelo = precioVueloDirecto(vuelo);

            List<Asientos> asientos = vuelo.getAsientos();
                
                for (Asientos asiento : asientos) {
                    
                    if(asiento.getNombreAsiento().equals(nombreAsiento)){
                    
                    return precioVuelo + precioTipoAsiento(asiento.getIdAsiento());

                    }
                }

        }else{


            if(vuelo!= null){
                List<Escala> escalas = vuelo.getEscalas();

                for (Escala escala : escalas) {
                    Vuelo vueloDirecto = escala.getVuelo();
                    precioVuelo += precioVueloDirecto(vueloDirecto); 
                }

                List<Asientos> asientos = vuelo.getAsientos();
                
                for (Asientos asiento : asientos) {
                    
                    if(asiento.getNombreAsiento().equals(nombreAsiento)){
                    
                    return precioVuelo + precioTipoAsiento(asiento.getIdAsiento());
                    
                    }
                }
            }
        }
        return null;
    }
    
}
package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Boleto;
import sky.vibe.airlines.skyvibe.modelos.Cliente;
import sky.vibe.airlines.skyvibe.modelos.Escala;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;
import sky.vibe.airlines.skyvibe.Dto.BoletoJson;
import sky.vibe.airlines.skyvibe.modelos.Asientos;
import sky.vibe.airlines.skyvibe.repositorios.AsientosRepository;
import sky.vibe.airlines.skyvibe.repositorios.ClienteRepository;
import sky.vibe.airlines.skyvibe.repositorios.VueloRepository;
import sky.vibe.airlines.skyvibe.repositorios.BoletoRepository;
import sky.vibe.airlines.skyvibe.servicios.BoletoService;

@Service
public class BoletoServiceImpl implements BoletoService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private AsientosRepository asientosRepository;

    @Autowired
    private BoletoRepository boletoRepository;

    @Autowired
    private VueloRepository vueloRepository;
    
    @Override
    public String crearBoleto(BoletoJson boletoJson) {

    Vuelo vuelo = this.vueloRepository.findById(boletoJson.getIdVuelo()).get();

    /**
     * Verificamos que el vuelo sea null y que sea indirecto
     * en caso creariamos los boletos para cada escala
     */
    if(vuelo != null && !vuelo.getTipoVuelo()){
        List<Escala> escalas = vuelo.getEscalas();
        
        for (Escala escala : escalas) {

            /**
             * Obtenemos los vuelos de las escalas
             */
            Vuelo vueloEscala = escala.getVuelo();
            boletoJson.setIdVuelo(vueloEscala.getIdVuelo());

            /**
             * Utilizamos de forma recursiva la funcion crear boleto para crear los boletos 
             * de cada escala
             */
            crearBoleto(boletoJson);
        }
    }

    /**
     * Verificamos si el vuelo existe y si es un vuelo directo
     */
        if(vuelo != null && vuelo.getTipoVuelo()){
        Boleto boletoNuevo = new Boleto();
            /**
             * Realizamos la insercion del cliente en el boleto 
             */
            // if (boleto.getIdCliente() != null) {
                Cliente cliente = this.clienteRepository.findById(boletoJson.getIdCliente()).get();
                if (cliente != null) {
                    boletoNuevo.setCliente(cliente);
                }
            

            /**
             * Al momento de crear un boleto la escala siempre será null debido que es un vuelo directo
             */
            boletoNuevo.setEscala(null);

            /**
             * Agregamos el precio del boleto dependiendo del tipo de asiento y de la distancia
             * recorrida en el vuelo
             */
            boletoNuevo.setPrecio(precioAsientoParaBoleto(boletoJson.getIdVuelo(), boletoJson.getNombreAsiento()));

            /**
             * Verificamos que el asiento seleccionado exista
             */
            if (boletoJson.getNombreAsiento() != null) {
            
                List<Asientos> asientos = vuelo.getAsientos();
                
                for (Asientos asiento : asientos) {
                    /**
                     * Encontramos el asiento del vuelo a partir del nombre de asiento
                     */
                    if(asiento.getNombreAsiento().equals(boletoJson.getNombreAsiento())){
                    
                        /**
                         * Verificamos que el asiento este disponible, en caso de serlo
                         * cambiamos su estado a no disponible y lo ingresamos en el boleto,
                         * de esta forma se genera el boleto y se guarda en la base de datos
                         */
                        if (asiento.getDisponible()) {
                            boletoNuevo.setAsiento(asiento);
                            asiento.setDisponible(false);
                            this.asientosRepository.save(asiento);
                            this.boletoRepository.save(boletoNuevo);
                            return "Boleto creado";
                        }
                    }
                }
            }
        }
                return "Boleto"; 
    }
    

    @Override
    public List<Boleto> boletosDeUsuario(int id) {
        return this.clienteRepository.findById(id).get().getBoletos();
    }


    /**
     * Obtiene el precio del vuelo segun la distancia
     */
    @Override
    public Double precioVueloDirecto(Vuelo vuelo) {
        return ( vuelo.getRuta().getDistancia() ) * 2.29;
    }

    /**
     * Obtine el precio del asiento
     */
    @Override
    public Double precioTipoAsiento(int idAsiento) {
        Asientos asiento = this.asientosRepository.findById(idAsiento).get();

        if(asiento!= null && asiento.getDisponible()){
            return asiento.getTipoAsiento().getPrecioBase();
        }
        return null;
    }


    /**
     * Realiza la creacion de precio para un vuelo y un asiento en especifico
     */
    @Override
    public Double precioAsientoParaBoleto(String idVuelo, String nombreAsiento) {
        Vuelo vuelo = this.vueloRepository.findById(idVuelo).get();

        /**
         * Verifica que el vuelo exista y que este sea directo
         */
        if(vuelo != null && vuelo.getTipoVuelo() == true){
            
            List<Asientos> asientos = vuelo.getAsientos();
                
                for (Asientos asiento : asientos) {
                    
                    /**
                     * Encontramos el asiento del vuelo a partir de su nombre
                     */
                    if(asiento.getNombreAsiento().equals(nombreAsiento)){

                    /**
                     * Sumamos el precio del vuelo y el precio del asiento llamando a ambos metodos
                     * para obtener el precio total.
                     */
                    return precioVueloDirecto(vuelo) + precioTipoAsiento(asiento.getIdAsiento());
                }
            }        
        }
        return null;
    }

}
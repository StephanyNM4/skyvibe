package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Boleto;
import sky.vibe.airlines.skyvibe.modelos.Cliente;
import sky.vibe.airlines.skyvibe.modelos.Escala;
import sky.vibe.airlines.skyvibe.modelos.Asientos;
import sky.vibe.airlines.skyvibe.repositorios.AsientosRepository;
import sky.vibe.airlines.skyvibe.repositorios.ClienteRepository;
import sky.vibe.airlines.skyvibe.repositorios.EscalaRepository;
import sky.vibe.airlines.skyvibe.repositorios.BoletoRepository;
import sky.vibe.airlines.skyvibe.servicios.BoletoService;

@Service
public class BoletoServiceImpl implements BoletoService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EscalaRepository escalaRepository;

    @Autowired
    private AsientosRepository AsientosRepository;

    @Autowired
    private BoletoRepository boletoRepository;
    
    @Override
    public Boleto crearBoleto(Boleto boleto) {
        if(boleto.getCliente() != null){
            Cliente cliente = this.clienteRepository.findById(boleto.getCliente().getIdCliente()).get();
            boleto.setCliente(cliente);
        }

        if(boleto.getEscala() != null){
            Escala escala = this.escalaRepository.findById(boleto.getEscala().getIdEscala()).get();
            boleto.setEscala(escala);
        }

        if(boleto.getAsiento() !=null){
            Asientos asiento = this.AsientosRepository.findById(boleto.getAsiento().getIdAsiento()).get();
            boleto.setAsiento(asiento);
        }

        return this.boletoRepository.save(boleto);
        
    }

    @Override
    public List<Boleto> boletosDeUsuario(int id) {
        return this.clienteRepository.findById(id).get().getBoletos();
    }
    
}

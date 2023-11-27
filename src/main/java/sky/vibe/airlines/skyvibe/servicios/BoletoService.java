package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Boleto;


public interface BoletoService {

    public Boleto crearBoleto(Boleto Boleto);
    
    public List<Boleto> boletosDeUsuario(int id);
}

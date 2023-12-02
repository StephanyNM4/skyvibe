package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Boleto;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;


public interface BoletoService {

    public Boleto crearBoleto(Boleto Boleto, String idVuelo);
    
    public List<Boleto> boletosDeUsuario(int id);

    public Double precioVueloDirecto(Vuelo vuelo);

    public Double precioAsientoParaBoleto(String idVuelo, String nombreAsiento);

    public Double precioTipoAsiento(int idAsiento);


}

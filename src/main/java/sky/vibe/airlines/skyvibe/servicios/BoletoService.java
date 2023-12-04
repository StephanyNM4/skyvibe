package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.Dto.BoletoJson;
import sky.vibe.airlines.skyvibe.modelos.Boleto;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;


public interface BoletoService {

    public Boleto crearBoleto(BoletoJson boleto);
    
    public List<Boleto> boletosDeUsuario(int id);

    public Double precioVueloDirecto(Vuelo vuelo);

    public Double precioAsientoParaBoleto(String idVuelo, String nombreAsiento);

    public Double precioTipoAsiento(int idAsiento);


}

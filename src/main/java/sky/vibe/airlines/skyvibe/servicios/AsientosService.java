package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Asientos;

public interface AsientosService {
    
    public Asientos agregarAsientoAVuelo(Asientos asiento);

    public List<Asientos> asientosDeVuelo(String id);

    public Asientos seleccionarAsiento(String nombreAsiento, String idVuelo);

    public Asientos deseleccionarAsiento(String nombreAsiento, String idVuelo); 

    public boolean estadoAsiento(String nombreAsiento, String idVuelo);

    public Asientos obtenerAsientoNombre(String nombreAsiento, String idVuelo);

    public Asientos seleccionarAsientoNombre(String nombreAsiento, String idVuelo);

    public String crearTotalAsientosPorVuelo(String idVuelo, int cantidadAsientos);

    public String eliiminarTotalAsientosPorVuelo(String idVuelo);


}

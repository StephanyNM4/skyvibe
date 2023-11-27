package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Asientos;

public interface AsientosService {
    
    public Asientos agregarAsientoAVuelo(Asientos asiento);

    public List<Asientos> asientosDeVuelo(String id);

    public Asientos seleccionarAsiento(int idAsiento);

    public Asientos deseleccionarrAsiento(int idAsiento); 

    public boolean estadoAsiento(int id);

    public Asientos obtenerAsientoNombre(String nombreAsiento, String idVuelo);

    public Asientos seleccionarAsientoNombre(String nombreAsiento, String idVuelo);
}

package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Asientos;

public interface AsientosService {
    
    public Asientos agregarAsientoAVuelo(Asientos asiento);

    public List<Asientos> AsientosDeVuelo(String id);

    public Asientos seleccionarAsiento(int idAsiento);

    public Asientos deseleccionarrAsiento(int idAsiento); 

    public boolean estadoAsiento(int id);
}

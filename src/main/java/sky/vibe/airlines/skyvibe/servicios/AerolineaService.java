package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Aerolinea;

public interface AerolineaService {
    
    public Aerolinea crearAerolinea(String nombreAerolinea);

    public Aerolinea obtenerAerolinea(int idAerolinea);

    public List<Aerolinea> obtenerAerolineas();

    public String eliminarAerolinea(int idAerolinea);

    public String actualizarAerolinea(int idAerolinea, String aerolinea);

}

package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Ruta;

public interface RutaService {
    public Ruta crearRuta(Ruta ruta);

    public Ruta obtenerRuta(int idRuta);

    public Ruta obtenerRutaXDestino(String destino);

    public List<Ruta> obtenerRutas();

    public String eliminarRuta(int idRuta);

    public String actualizarRuta(int idRuta, Ruta ruta);

    public List<String> obtenerOrigenes();

    public List<String> obtenerDestinos(String origen);
}

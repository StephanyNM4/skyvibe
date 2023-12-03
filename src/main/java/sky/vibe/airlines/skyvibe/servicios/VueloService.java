package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Vuelo;

public interface VueloService {

    public Vuelo crearVuelo(Vuelo vuelo);

    public Vuelo obtenerVuelo(String idVuelo);

    public List<Vuelo> obtenerVuelos();

    public String eliminarVuelo(String idVuelo);

    public String actualizarVuelo(String idVuelo, Vuelo vuelo);

    public List<Vuelo> buscarVuelosPorRuta(String origen, String destino);

    public int numeroAsientosVuelo(String idvuelo);
}

package sky.vibe.airlines.skyvibe.servicios;

import java.util.List;

import sky.vibe.airlines.skyvibe.modelos.Escala;

public interface EscalaService {
    
    public Escala crearEscala(Escala escala);

    public Escala obtenerEscala(int idEscala);

    public List<Escala> obtenerEscalas();

    public String eliminarEscala(int idEscala);

    public String actualizarEscala(int idEscala, Escala escala);
}

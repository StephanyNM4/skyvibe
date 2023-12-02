package sky.vibe.airlines.skyvibe.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sky.vibe.airlines.skyvibe.modelos.Asientos;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;

public interface AsientosRepository extends JpaRepository<Asientos, Integer> {

    List<Asientos> findByVuelo_IdVuelo(String id);

    Asientos findByNombreAsientoAndVuelo(String nombreAsiento, Vuelo vuelo);

    Asientos findByNombreAsientoAndVuelo_IdVuelo(String nombreAsiento, String idVuelo);
    
}

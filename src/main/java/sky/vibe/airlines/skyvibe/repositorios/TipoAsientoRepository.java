package sky.vibe.airlines.skyvibe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import sky.vibe.airlines.skyvibe.modelos.Ruta;
import sky.vibe.airlines.skyvibe.modelos.TipoAsiento;

public interface TipoAsientoRepository extends JpaRepository<TipoAsiento, Integer> {
    
}

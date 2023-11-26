package sky.vibe.airlines.skyvibe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import sky.vibe.airlines.skyvibe.modelos.Asientos;

public interface AsientosRepository extends JpaRepository<Asientos, Integer> {
    
}

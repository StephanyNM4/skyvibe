package sky.vibe.airlines.skyvibe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import sky.vibe.airlines.skyvibe.modelos.Aerolinea;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer>{
    
}

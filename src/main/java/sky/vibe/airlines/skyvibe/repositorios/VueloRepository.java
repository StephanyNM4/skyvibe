package sky.vibe.airlines.skyvibe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import sky.vibe.airlines.skyvibe.modelos.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, String>{
    
}

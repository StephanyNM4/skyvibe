package sky.vibe.airlines.skyvibe.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sky.vibe.airlines.skyvibe.modelos.Boleto;

public interface BoletoRepository extends JpaRepository<Boleto, Integer> {;
    
}

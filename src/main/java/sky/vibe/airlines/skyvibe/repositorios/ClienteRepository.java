package sky.vibe.airlines.skyvibe.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import sky.vibe.airlines.skyvibe.modelos.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    boolean existsByCorreo(String correo);
    Cliente findByCorreoAndContrasena(String correo, String contrasena);
}

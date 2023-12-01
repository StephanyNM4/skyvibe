package sky.vibe.airlines.skyvibe.servicios;

import sky.vibe.airlines.skyvibe.Dto.Login;
import sky.vibe.airlines.skyvibe.modelos.Cliente;


public interface ClienteService {
    
    public Cliente guardarCliente(Cliente cliente);

    public Cliente loginCliente(Login login);
    //Se obiente con los gets el cliente.correo y cliente.contraseña

    public Cliente obtenerCliente(int idCliente);

    public String eliminarCliente(int idCliente);

    public String actualizarCliente(int idCliente, Cliente cliente);

}

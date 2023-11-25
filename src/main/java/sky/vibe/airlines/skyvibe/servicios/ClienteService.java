package sky.vibe.airlines.skyvibe.servicios;

import sky.vibe.airlines.skyvibe.modelos.Cliente;


public interface ClienteService {
    
    public Cliente guardarCliente(Cliente cliente);

    public boolean Login(Cliente cliente);
    //Se obiente con los gets el cliente.correo y cliente.contraseña

    public Cliente obtenerCliente(int idCliente);

    public String eliminarCliente(int idCliente);

    public String actualizarCliente(int idCliente, Cliente cliente);

}

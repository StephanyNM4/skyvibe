package sky.vibe.airlines.skyvibe.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Cliente;
import sky.vibe.airlines.skyvibe.repositorios.ClienteRepository;
import sky.vibe.airlines.skyvibe.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;
    


    @Override
    public Cliente guardarCliente(Cliente cliente) {
        if (correoExistente(cliente.getCorreo())) {
            throw new IllegalArgumentException("Ya existe un cliente con este correo");
        }
        clienteRepository.save(cliente);
        
        return cliente; 
    }
    

    public boolean correoExistente(String correo) {
        return clienteRepository.existsByCorreo(correo);
    }

    @Override
    public boolean Login(Cliente cliente) {
        Cliente clienteEncontrado = clienteRepository.findByCorreoAndContrasena(cliente.getCorreo(), cliente.getContrasena());
        if (clienteEncontrado != null) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Cliente obtenerCliente(int idCliente) {
        return this.clienteRepository.findById(idCliente).get();
    }


    @Override
    public String eliminarCliente(int idCliente) {
        Cliente clienteEliminar = this.clienteRepository.findById(idCliente).get();

        if(clienteEliminar!=null){
            this.clienteRepository.delete(clienteEliminar);
            return "Cliente eliminado";
        }
        return "Cliente no encontrado";

    }


    @Override
    public String actualizarCliente(int idCliente, Cliente cliente) {
        Cliente clienteActualizar = this.clienteRepository.findById(idCliente).get();
        if(clienteActualizar != null) {
            clienteActualizar.setNombre(cliente.getNombre());
            clienteActualizar.setCorreo(cliente.getCorreo());
            clienteActualizar.setTelefono(cliente.getTelefono());
            clienteActualizar.setContrasena(cliente.getContrasena());
            this.clienteRepository.save(clienteActualizar);
            return "Cliente actualizado";
        }
        return "Cliente no encontrado";
}
}

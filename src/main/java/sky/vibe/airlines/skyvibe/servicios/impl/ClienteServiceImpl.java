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
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente Login(Cliente cliente) {
        //Aqui falta definir el objeto del cliente para hacer los gets
        return null;
    }
    
}

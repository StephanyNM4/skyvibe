package sky.vibe.airlines.skyvibe.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sky.vibe.airlines.skyvibe.modelos.Cliente;
import sky.vibe.airlines.skyvibe.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    //Yay! This
    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente nvoCliente){
        return clienteServiceImpl.guardarCliente(nvoCliente);
    }
}

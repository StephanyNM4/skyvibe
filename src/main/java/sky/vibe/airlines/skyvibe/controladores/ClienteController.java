package sky.vibe.airlines.skyvibe.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PostMapping("/login")
    public int login(@RequestBody Cliente cliente) {
        return clienteServiceImpl.Login(cliente);
    }

    @GetMapping("/obtener/{idCliente}")
    public Cliente obtenerCliente(@PathVariable int idCliente) {
        return this.clienteServiceImpl.obtenerCliente(idCliente);
    }

    @DeleteMapping("/eliminar/{idCliente}")
    public String eliminarVuelo(@PathVariable int idCliente) {
        return this.clienteServiceImpl.eliminarCliente(idCliente);
    }

    @PutMapping("/actualizar/{idCliente}")
    public String actualizarVuelo(@PathVariable int idCliente, @RequestBody Cliente cliente) {
        return this.clienteServiceImpl.actualizarCliente(idCliente, cliente);
    }

}

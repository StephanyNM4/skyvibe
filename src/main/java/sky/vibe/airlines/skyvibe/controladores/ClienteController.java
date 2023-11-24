package sky.vibe.airlines.skyvibe.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }
}

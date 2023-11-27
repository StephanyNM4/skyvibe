package sky.vibe.airlines.skyvibe.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import sky.vibe.airlines.skyvibe.modelos.Escala;
import sky.vibe.airlines.skyvibe.servicios.impl.EscalaServiceImpl;

@RestController
@RequestMapping("/api/escala")
public class EscalaController {
    
    @Autowired
    private EscalaServiceImpl escalaServiceImpl;

    @GetMapping("/prueba")
    private String prueba(){
        return "prueba";
    }


    @PostMapping("/crear")
    public Escala crearEscala(@RequestBody Escala escala) {
        return this.escalaServiceImpl.crearEscala(escala);
    }

    @GetMapping("/obtener")
    public Escala obtenerEscala(@RequestParam(name = "idEscala") int idEscala) {
        return this.escalaServiceImpl.obtenerEscala(idEscala);
    }

    @GetMapping("/obtenerTodas")
    public List<Escala> obtenerEscalas() {
        return this.escalaServiceImpl.obtenerEscalas();
    }

    @DeleteMapping("/eliminar")
    public String eliminarEscala(@RequestParam(name = "idEscala") int idEscala) {
        return this.escalaServiceImpl.eliminarEscala(idEscala);
    }

    @PutMapping("/actualizar")
    public String actualizarEscala(@RequestParam(name = "idEscala") int idEscala, @RequestBody Escala escala) {
        return this.escalaServiceImpl.actualizarEscala(idEscala, escala);
    }

    @GetMapping("/obtener/porVuelo")
    public List<Escala> obtenerEscalasPorVuelo(@RequestParam(name = "idVuelo") String idVuelo) {
        return this.escalaServiceImpl.obtenerEscalasPorVuelo(idVuelo);
    }
}

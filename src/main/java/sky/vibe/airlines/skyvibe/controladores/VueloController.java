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

import sky.vibe.airlines.skyvibe.modelos.Vuelo;
import sky.vibe.airlines.skyvibe.servicios.impl.VueloServiceImpl;

@RestController
@RequestMapping("/api/vuelo")
public class VueloController {
    
    @Autowired
    private VueloServiceImpl vueloServiceImpl;

    @GetMapping("/prueba")
    private String prueba(){
        return "prueba";
    }


    @PostMapping("/crear")
    public Vuelo crearVuelo(@RequestBody Vuelo vuelo) {
        return this.vueloServiceImpl.crearVuelo(vuelo);
    }

    @GetMapping("/obtener")
    public Vuelo obtenerVuelo(@RequestParam(name = "idVuelo") String idVuelo) {
        return this.vueloServiceImpl.obtenerVuelo(idVuelo);
    }

    @GetMapping("/obtenerTodos")
    public List<Vuelo> obtenerVuelos() {
        return this.vueloServiceImpl.obtenerVuelos();
    }

    @DeleteMapping("/eliminar")
    public String eliminarVuelo(@RequestParam(name = "idVuelo") String idVuelo) {
        return this.vueloServiceImpl.eliminarVuelo(idVuelo);
    }

    @PutMapping("/actualizar")
    public String actualizarVuelo(@RequestParam(name = "idVuelo") String idVuelo, @RequestBody Vuelo vuelo) {
        return this.vueloServiceImpl.actualizarVuelo(idVuelo, vuelo);
    }

    @GetMapping("/buscarVuelosPorRuta")
    public List<Vuelo> buscarVuelosPorRuta(@RequestParam(name = "origen") String origen, @RequestParam(name = "destino") String destino) {
        return this.vueloServiceImpl.buscarVuelosPorRuta(origen, destino);
    }
}

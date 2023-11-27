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

import sky.vibe.airlines.skyvibe.modelos.Ruta;
import sky.vibe.airlines.skyvibe.servicios.impl.RutaServiceImpl;

@RestController
@RequestMapping("/api/ruta")
public class RutaController {
    
    @Autowired
    private RutaServiceImpl rutaServiceImpl;

    @GetMapping("/prueba")
    private String prueba(){
        return "prueba";
    }

    @PostMapping("/crear")
    public Ruta crearRuta(@RequestBody Ruta ruta) {
        return this.rutaServiceImpl.crearRuta(ruta);
    }

    @GetMapping("/obtener")
    public Ruta obtenerRuta(@RequestParam(name = "idRuta") int idRuta) {
        return this.rutaServiceImpl.obtenerRuta(idRuta);
    }

    @GetMapping("/obtener/porDestino")
    public Ruta obtenerRutaXDestino(@RequestParam(name = "destino") String destino) {
        return this.rutaServiceImpl.obtenerRutaXDestino(destino);
    }

    @GetMapping("/obtenerTodas")
    public List<Ruta> obtenerRutas() {
        return this.rutaServiceImpl.obtenerRutas();
    }

    @DeleteMapping("/eliminar")
    public String eliminarRuta(@RequestParam(name = "idRuta") int idRuta) {
        return this.rutaServiceImpl.eliminarRuta(idRuta);
    }

    @PutMapping("/actualizar")
    public String actualizarRuta(@RequestParam(name = "idRuta") int idRuta, @RequestBody Ruta ruta) {
        return this.rutaServiceImpl.actualizarRuta(idRuta, ruta);
    }
    
    @GetMapping("/obtenerOrigenes")
    public List<String> obtenerOrigenes(){
        return this.rutaServiceImpl.obtenerOrigenes();
    }

    @GetMapping("/obtenerDestinos")
    public List<String> obtenerDestinos(@RequestParam(name = "origen") String origen){
        return this.rutaServiceImpl.obtenerDestinos(origen);
    }
}

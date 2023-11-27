package sky.vibe.airlines.skyvibe.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sky.vibe.airlines.skyvibe.modelos.Asientos;
import sky.vibe.airlines.skyvibe.servicios.impl.AsientosServiceImpl;

@RestController
@RequestMapping("/api/asiento")
public class AsientoController {
    
    @Autowired
    private AsientosServiceImpl asientosServiceImpl;

    @PostMapping("/crear")
    public Asientos crearAsiento(@RequestBody Asientos asiento) {
        return this.asientosServiceImpl.agregarAsientoAVuelo(asiento);
    
}
    @GetMapping("/vueloAsientos/{idVuelo}")
    public List<Asientos> vueloAsientos(@PathVariable(name="idVuelo") String idVuelo) {
        return asientosServiceImpl.asientosDeVuelo(idVuelo);
    }

    @PutMapping("/seleccionarAsiento/{idAsiento}")
    public Asientos seleccionarAsiento(@PathVariable(name="idAsiento") int idAsiento) {
        return this.asientosServiceImpl.seleccionarAsiento(idAsiento);
    }

    @PutMapping("/deseleccionarAsiento/{idAsiento}")
    public Asientos deseleccionarAsiento(@PathVariable(name="idAsiento") int idAsiento) {
        return this.asientosServiceImpl.deseleccionarrAsiento(idAsiento);
    }

    @GetMapping("/asientoEstado/{idAsiento}")
    public boolean estadoAsiento(@PathVariable(name="idAsiento") int id) {
        return asientosServiceImpl.estadoAsiento(id);
    }

    @GetMapping("/obtener/porNombre")
    public Asientos obtenerAsientoNombre(@RequestParam(name = "nombreAsiento") String nombreAsiento, @RequestParam(name = "idVuelo") String idVuelo) {
        return this.asientosServiceImpl.obtenerAsientoNombre(nombreAsiento, idVuelo);
    }

    @PutMapping("/seleccionar/porNombre")
    public Asientos seleccionarAsientoNombre(@RequestParam(name = "nombreAsiento") String nombreAsiento, @RequestParam(name = "idVuelo") String idVuelo) {
        return this.asientosServiceImpl.seleccionarAsientoNombre(nombreAsiento, idVuelo);
    }
}

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
}

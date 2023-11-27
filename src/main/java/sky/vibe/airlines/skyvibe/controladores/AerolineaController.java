package sky.vibe.airlines.skyvibe.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sky.vibe.airlines.skyvibe.modelos.Aerolinea;
import sky.vibe.airlines.skyvibe.servicios.impl.AerolineaServiceImpl;

@RestController
@RequestMapping("/api/aerolinea")
public class AerolineaController {
    
    @Autowired
    private AerolineaServiceImpl aerolineaServiceImpl;

    @GetMapping("/prueba")
    private String prueba(){
        return "prueba";
    }


    @PostMapping("/crear")
    public Aerolinea crearAerolinea(@RequestParam(name = "nombreAerolinea") String nombreAerolinea) {
        return this.aerolineaServiceImpl.crearAerolinea(nombreAerolinea);
    }

    @GetMapping("/obtener")
    public Aerolinea obtenerAerolinea(@RequestParam(name = "idAerolinea") int idAerolinea) {
        return this.aerolineaServiceImpl.obtenerAerolinea(idAerolinea);
    }

    @GetMapping("/obtenerTodas")
    public List<Aerolinea> obtenerAerolineas() {
        return this.aerolineaServiceImpl.obtenerAerolineas();
    }

    @DeleteMapping("/eliminar")
    public String eliminarAerolinea(@RequestParam(name = "idAerolinea") int idAerolinea) {
        return this.aerolineaServiceImpl.eliminarAerolinea(idAerolinea);
    }

    @PutMapping("/actualizar")
    public String actualizarAerolinea(@RequestParam(name = "idAerolinea") int idAerolinea, @RequestParam(name = "nombreAerolinea") String nombreAerolinea) {
        return this.aerolineaServiceImpl.actualizarAerolinea(idAerolinea, nombreAerolinea);
    }
}

package sky.vibe.airlines.skyvibe.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import sky.vibe.airlines.skyvibe.modelos.Boleto;
import sky.vibe.airlines.skyvibe.servicios.impl.BoletoServiceImpl;

@RestController
@RequestMapping("/api/boleto")
public class BoletoController {
    
    @Autowired
    private BoletoServiceImpl boletoServiceImpl;

    @PostMapping("/crear")
    public Boleto crearBoleto(@RequestBody Boleto boleto, @RequestParam(name = "idVuelo") String idVuelo) {
        return this.boletoServiceImpl.crearBoleto(boleto, idVuelo);
    }

    @GetMapping("/boletosUsuario/{idUsuario}")
    public List<Boleto> boletosDeUsuario(@PathVariable(name="idUsuario") int id) {
        return boletoServiceImpl.boletosDeUsuario(id);
    }

    @GetMapping("/precioAsiento/paraBoleto")
    public Double precioAsientoParaBoleto(@RequestParam(name = "idVuelo") String idVuelo, @RequestParam(name = "nombreAsiento") String nombreAsiento) {
        return this.boletoServiceImpl.precioAsientoParaBoleto(idVuelo, nombreAsiento);
    }
}

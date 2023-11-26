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

import sky.vibe.airlines.skyvibe.modelos.Aerolinea;
import sky.vibe.airlines.skyvibe.modelos.Boleto;
import sky.vibe.airlines.skyvibe.servicios.impl.AerolineaServiceImpl;
import sky.vibe.airlines.skyvibe.servicios.impl.BoletoServiceImpl;

@RestController
@RequestMapping("/api/boleto")
public class BoletoController {
    
    @Autowired
    private BoletoServiceImpl boletoServiceImpl;

    @PostMapping("/crear")
    public Boleto crearBoleto(@RequestBody Boleto boleto) {
        return this.boletoServiceImpl.crearBoleto(boleto);
    }
}

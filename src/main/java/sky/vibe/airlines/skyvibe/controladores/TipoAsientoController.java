package sky.vibe.airlines.skyvibe.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import sky.vibe.airlines.skyvibe.modelos.TipoAsiento;
import sky.vibe.airlines.skyvibe.servicios.impl.TipoAsientoServiceImpl;

@RestController
@RequestMapping("/api/tipoasiento")
public class TipoAsientoController {
    
    @Autowired
    private TipoAsientoServiceImpl tipoAsientoServiceImpl;

    @PostMapping("/guardar")
    public TipoAsiento guardarCliente(@RequestBody TipoAsiento TipoAsiento){
        return tipoAsientoServiceImpl.crearTipoAsiento(TipoAsiento);
    }
}

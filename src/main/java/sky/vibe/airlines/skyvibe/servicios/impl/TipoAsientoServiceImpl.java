package sky.vibe.airlines.skyvibe.servicios.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.TipoAsiento;
import sky.vibe.airlines.skyvibe.repositorios.TipoAsientoRepository;
import sky.vibe.airlines.skyvibe.servicios.TipoAsientoService;


@Service
public class TipoAsientoServiceImpl implements TipoAsientoService {

    @Autowired
    private TipoAsientoRepository tipoAsientoRepository;

    @Override
    public TipoAsiento crearTipoAsiento(TipoAsiento tipoasiento) {
        return tipoAsientoRepository.save(tipoasiento);
    }
    
}

package sky.vibe.airlines.skyvibe.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Asientos;
import sky.vibe.airlines.skyvibe.modelos.TipoAsiento;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;
import sky.vibe.airlines.skyvibe.repositorios.AsientosRepository;
import sky.vibe.airlines.skyvibe.repositorios.TipoAsientoRepository;
import sky.vibe.airlines.skyvibe.repositorios.VueloRepository;
import sky.vibe.airlines.skyvibe.servicios.AsientosService;

@Service
public class AsientosServiceImpl  implements AsientosService{

    @Autowired
    private TipoAsientoRepository tipoAsientoRepository;

    @Autowired
    private VueloRepository vueloRepository;

    @Autowired
    private AsientosRepository AsientosRepository;


    @Override
    public Asientos agregarAsientoAVuelo(Asientos asiento) {
        if(asiento.getTipoAsiento() !=null){
            TipoAsiento tipoasiento = this.tipoAsientoRepository.findById(asiento.getTipoAsiento().getIdTipoAsiento()).get();
            asiento.setTipoAsiento(tipoasiento);
        }

        if(asiento.getVuelo() !=null){
            Vuelo vuelo = this.vueloRepository.findById(asiento.getVuelo().getIdVuelo()).get();
            asiento.setVuelo(vuelo);
        }
        return this.AsientosRepository.save(asiento);
    }
    
}

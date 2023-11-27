package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.LinkedList;
import java.util.List;

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


    @Override
    public List<Asientos> AsientosDeVuelo(String id) {

        List<Asientos> lstAsientos = this.AsientosRepository.findByVuelo_IdVuelo(id);

        List<Asientos> nvolista = new LinkedList<Asientos>();
        for (Asientos asiento : lstAsientos) {
            asiento.setVuelo(null);
            nvolista.add(asiento);
            
        }
        return nvolista;
    }


    @Override
    public Asientos seleccionarAsiento(int idAsiento) {
        Asientos asientoSeleccionado = this.AsientosRepository.findById(idAsiento).get();
        if(asientoSeleccionado !=null){
            asientoSeleccionado.setDisponible(false);
            this.AsientosRepository.save(asientoSeleccionado);
            return  asientoSeleccionado;
        }

        return null;
    }


    @Override
    public Asientos deseleccionarrAsiento(int idAsiento) {
        Asientos asientoSeleccionado = this.AsientosRepository.findById(idAsiento).get();
        if(asientoSeleccionado !=null){
            asientoSeleccionado.setDisponible(true);
            this.AsientosRepository.save(asientoSeleccionado);
            return  asientoSeleccionado;
        }

        return null;
    }


    @Override
    public boolean estadoAsiento(int id) {
        Asientos asientoEncontrado = this.AsientosRepository.findById(id).get();
        return asientoEncontrado.isDisponible();
    }
}

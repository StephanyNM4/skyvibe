package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Aerolinea;
import sky.vibe.airlines.skyvibe.modelos.Ruta;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;
import sky.vibe.airlines.skyvibe.repositorios.AerolineaRepository;
import sky.vibe.airlines.skyvibe.repositorios.RutaRepository;
import sky.vibe.airlines.skyvibe.repositorios.VueloRepository;
import sky.vibe.airlines.skyvibe.servicios.VueloService;

@Service
public class VueloServiceImpl implements VueloService{

    @Autowired
    private VueloRepository vueloRepository;

    @Autowired
    private AerolineaRepository aerolineaRepository;

    @Autowired
    private RutaRepository rutaRepository;

    @Override
    public Vuelo crearVuelo(Vuelo vuelo) {
        if(vuelo.getAerolinea() != null){
            Aerolinea aerolinea = this.aerolineaRepository.findById(vuelo.getAerolinea().getIdAerolinea()).get();
            vuelo.setAerolinea(aerolinea);
        }

        if (vuelo.getRuta() != null){ 
            Ruta ruta = this.rutaRepository.findById(vuelo.getRuta().getIdRuta()).get();
            vuelo.setRuta(ruta);
        }
        return this.vueloRepository.save(vuelo);
    }

    @Override
    public Vuelo obtenerVuelo(String idVuelo) {
        return this.vueloRepository.findById(idVuelo).get();
    }

    @Override
    public List<Vuelo> obtenerVuelos() {
        return this.vueloRepository.findAll();
    }

    @Override
    public String eliminarVuelo(String idVuelo) {
    Vuelo vuelo = this.vueloRepository.findById(idVuelo).get();

        if(vuelo != null) {
            this.vueloRepository.delete(vuelo);
            return "Vuelo eliminado";
        }

        return "Vuelo no encontrado";
    }

    @Override
    public String actualizarVuelo(String idVuelo, Vuelo vuelo) {
        Vuelo vueloActualizar = this.vueloRepository.findById(idVuelo).get();

        if(vueloActualizar != null) {
            vueloActualizar.setFechaPartida(vuelo.getFechaPartida());
            this.vueloRepository.save(vueloActualizar);
            return "Fecha actualizada";
        }
    return "Vuelo no encontrado";
    }
    
}

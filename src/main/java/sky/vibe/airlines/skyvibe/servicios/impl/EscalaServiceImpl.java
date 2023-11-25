package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Escala;
import sky.vibe.airlines.skyvibe.modelos.Vuelo;
import sky.vibe.airlines.skyvibe.repositorios.EscalaRepository;
import sky.vibe.airlines.skyvibe.repositorios.VueloRepository;
import sky.vibe.airlines.skyvibe.servicios.EscalaService;

@Service
public class EscalaServiceImpl implements EscalaService{

    @Autowired
    private EscalaRepository escalaRepository;

    @Autowired
    private VueloRepository vueloRepository;

    @Override
    public Escala crearEscala(Escala escala) {
        if(escala.getVuelo() != null) {
            Vuelo vuelo = this.vueloRepository.findById(escala.getVuelo().getIdVuelo()).get();
            escala.setVuelo(vuelo);
        }
        return this.escalaRepository.save(escala);
    }

    @Override
    public Escala obtenerEscala(int idEscala) {
        return this.escalaRepository.findById(idEscala).get();
    }

    @Override
    public List<Escala> obtenerEscalas() {
        return this.escalaRepository.findAll();
    }

    @Override
    public String eliminarEscala(int idEscala) {
        Escala escala = this.escalaRepository.findById(idEscala).get();

        if(escala != null) {
            this.escalaRepository.delete(escala);
            return "Escala eliminada";
        }

        return "Escala no encontrada";
    }
    

    @Override
    public String actualizarEscala(int idEscala, Escala escala) {
    Escala escalaActualizar = this.escalaRepository.findById(idEscala).get();

    if(escalaActualizar != null) {
        if(escala.getVuelo() != null){
            Vuelo vuelo = this.vueloRepository.findById(escala.getVuelo().getIdVuelo()).get();
            escalaActualizar.setVuelo(vuelo);
            this.escalaRepository.save(escalaActualizar);
        }
        
        escalaActualizar.setNombreAeropuerto(escala.getNombreAeropuerto());
        return "Escala Actualizada";
    }

    return "Escala no encontrada";
    }
    
}

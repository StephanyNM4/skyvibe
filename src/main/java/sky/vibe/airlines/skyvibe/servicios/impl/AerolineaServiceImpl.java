package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sky.vibe.airlines.skyvibe.modelos.Aerolinea;
import sky.vibe.airlines.skyvibe.repositorios.AerolineaRepository;
import sky.vibe.airlines.skyvibe.servicios.AerolineaService;

@Service
public class AerolineaServiceImpl implements AerolineaService{

    @Autowired
    private AerolineaRepository aerolineaRepository;

    @Override
    public Aerolinea crearAerolinea(String nombreAerolinea) {
        Aerolinea aerolinea = new Aerolinea();
        aerolinea.setNombreAerolinea(nombreAerolinea);
        return this.aerolineaRepository.save(aerolinea);
    }

    @Override
    public Aerolinea obtenerAerolinea(int idAerolinea) {
        return this.aerolineaRepository.findById(idAerolinea).get();
    }

    @Override
    public List<Aerolinea> obtenerAerolineas() {
        return this.aerolineaRepository.findAll();
    }

    @Override
    public String eliminarAerolinea(int idAerolinea) {
        Aerolinea aerolinea = this.aerolineaRepository.findById(idAerolinea).get();

        if(aerolinea != null) {
            this.aerolineaRepository.delete(aerolinea);
            return "Aerolina eliminada";
        }

        return "Aerolina no encontrada";
    }

    @Override
    public String actualizarAerolinea(int idAerolinea, String nombreAerolinea) {
        Aerolinea aerolineaActualizar = this.aerolineaRepository.findById(idAerolinea).get();

        if(aerolineaActualizar != null) {
            aerolineaActualizar.setNombreAerolinea(nombreAerolinea);
            this.aerolineaRepository.save(aerolineaActualizar);
            return "Aerolinea Actualizada";
        }
        return "Aerolina no encontrada";
    }
    
}

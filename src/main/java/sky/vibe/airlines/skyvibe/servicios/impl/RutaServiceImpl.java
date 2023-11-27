package sky.vibe.airlines.skyvibe.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.vibe.airlines.skyvibe.modelos.Ruta;
import sky.vibe.airlines.skyvibe.repositorios.RutaRepository;
import sky.vibe.airlines.skyvibe.servicios.RutaService;

@Service
public class RutaServiceImpl implements RutaService{

    @Autowired
    private RutaRepository rutaRepository;

    @Override
    public Ruta crearRuta(Ruta ruta) {
        return this.rutaRepository.save(ruta);
    }

    @Override
    public Ruta obtenerRuta(int idRuta) {
        return this.rutaRepository.findById(idRuta).get();
    }

    @Override
    public Ruta obtenerRutaXDestino(String destino) {
        List<Ruta> rutas = this.rutaRepository.findAll();

        for (Ruta ruta : rutas) {
            if(ruta.getDestino().equals(destino)){
                return ruta;
            }
        }

        return null;
    }

    @Override
    public List<Ruta> obtenerRutas() {
        return this.rutaRepository.findAll();
    }

    @Override
    public String eliminarRuta(int idRuta) {
    Ruta ruta = this.rutaRepository.findById(idRuta).get();

        if(ruta != null) {
            this.rutaRepository.delete(ruta);
            return "Ruta eliminada";
        }

        return "Ruta no encontrada";
    }

    @Override
    public String actualizarRuta(int idRuta, Ruta ruta) {
    Ruta rutaActualizar = this.rutaRepository.findById(idRuta).get();

    if(rutaActualizar != null) {
        rutaActualizar.setTipoRuta(ruta.getTipoRuta());
        rutaActualizar.setDestino(ruta.getDestino());
        rutaActualizar.setOrigen(ruta.getOrigen());
        rutaActualizar.setDistancia(ruta.getDistancia());
        this.rutaRepository.save(rutaActualizar);
        return "Ruta Actualizada";
    }
    return "Ruta no encontrada";
    }

    @Override
    public List<String> obtenerOrigenes() {
        List<Ruta> lstrutas = this.rutaRepository.findAll();

        List<String> origenes = new ArrayList<>();

        for (Ruta ruta : lstrutas) {
            String origen = ruta.getOrigen();
            if (!origenes.contains(origen)) {
                origenes.add(origen);
            }
        }
        return origenes;
    }

    @Override
    public List<String> obtenerDestinos(String origen) {
        List<Ruta> rutas = this.rutaRepository.findAll();
        List<String> destinos = new ArrayList<>();
        for (Ruta ruta : rutas) {
            if(ruta.getOrigen().equals(origen)){
                destinos.add(ruta.getDestino());
            }
        }

        return destinos;
    }
    

    
    
}

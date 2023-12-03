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
    private AsientosRepository asientosRepository;


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
        return this.asientosRepository.save(asiento);
    }


    @Override
    public List<Asientos> asientosDeVuelo(String id) {

        List<Asientos> lstAsientos = this.asientosRepository.findByVuelo_IdVuelo(id);

        List<Asientos> nvolista = new LinkedList<Asientos>();
        for (Asientos asiento : lstAsientos) {
            asiento.setVuelo(null);
            nvolista.add(asiento);
            
        }
        return nvolista;
    }
    
    @Override
    public Asientos seleccionarAsiento(String nombreAsiento, String idVuelo) {
        Asientos asiento = asientosRepository.findByNombreAsientoAndVuelo_IdVuelo(nombreAsiento, idVuelo);
    
        if (asiento != null && asiento.getDisponible()) {
            asiento.setDisponible(false);
            asientosRepository.save(asiento);
            return asiento;
        }
    
        return null;
    }
    
    
    
    @Override
    public Asientos deseleccionarAsiento(String nombreAsiento, String idVuelo) {
        Asientos asiento = asientosRepository.findByNombreAsientoAndVuelo_IdVuelo(nombreAsiento, idVuelo);

        if (asiento != null && !asiento.getDisponible()) {
            asiento.setDisponible(true);
            asientosRepository.save(asiento);
            return asiento;
        }
    
        return null;
    }



    @Override
    public boolean estadoAsiento(String nombreAsiento, String idVuelo) {
        Asientos asientoEncontrado = asientosRepository.findByNombreAsientoAndVuelo_IdVuelo(nombreAsiento, idVuelo);
    
        return asientoEncontrado != null && asientoEncontrado.getDisponible();
    }
    

    @Override
    public Asientos obtenerAsientoNombre(String nombreAsiento, String idVuelo) {
        List<Asientos> asientos = this.asientosRepository.findAll();

        for (Asientos asiento : asientos) {
            if(asiento.getVuelo().getIdVuelo().equals(idVuelo)){
                if(asiento.getNombreAsiento().equals(nombreAsiento)){
                    return asiento;
                }
            }
        }

        return null;
    }


    @Override
    public Asientos seleccionarAsientoNombre(String nombreAsiento, String idVuelo) {
        List<Asientos> asientos = this.asientosRepository.findAll();

        for (Asientos asiento : asientos) {
            if(asiento.getVuelo().getIdVuelo().equals(idVuelo)){
                if(asiento.getNombreAsiento().equals(nombreAsiento)){
                    asiento.setDisponible(false);
                    this.asientosRepository.save(asiento);
                    return asiento;
                }
            }
        }

        return null;
    }


    @Override
    public String crearTotalAsientosPorVuelo(String idVuelo, int cantidadAsientos) {
        Vuelo vuelo = this.vueloRepository.findById(idVuelo).get();

        if (vuelo != null) {
            TipoAsiento primeraClase = this.tipoAsientoRepository.findById(1).get();
        TipoAsiento ejecutivo = this.tipoAsientoRepository.findById(2).get();
        TipoAsiento normal = this.tipoAsientoRepository.findById(3).get();
        String[] columnasPrimeraClase = {"A", "B", "E", "F"};
        String[] columnas = {"A", "B", "C", "D", "E", "F"};
        int filas = 0;

        /**
         * Creamos asientos de primera clase
         */
        for (int i = 0; i < columnasPrimeraClase.length; i++) {
            for (int j = 0; j < 3; j++) {
                filas = j + 1;
                Asientos asientoPrimeraClase = new Asientos();
                asientoPrimeraClase.setNombreAsiento(columnasPrimeraClase[i]+filas);
                asientoPrimeraClase.setTipoAsiento(primeraClase);
                asientoPrimeraClase.setVuelo(vuelo);
                asientoPrimeraClase.setDisponible(true);
                this.asientosRepository.save(asientoPrimeraClase);
            }
        }

        /**
         * Creamos asientos ejecutivos
         */
        for (int i = 0; i < columnas.length; i++) {
            for (int j = 0; j < 6; j++) {
                filas = j + 5;
                Asientos asientoEjecutivo = new Asientos();
                asientoEjecutivo.setNombreAsiento(columnas[i]+filas);
                asientoEjecutivo.setTipoAsiento(ejecutivo);
                asientoEjecutivo.setVuelo(vuelo);
                asientoEjecutivo.setDisponible(true);
                this.asientosRepository.save(asientoEjecutivo);
            }
        }

        /**
         * Creamos asientos normales
         */
        for (int i = 0; i < columnas.length; i++) {
            for (int j = 0; j < (cantidadAsientos - 48); j++) {
                filas = j + 18;
                Asientos asientosNormales = new Asientos();
                asientosNormales.setNombreAsiento(columnas[i]+filas);
                asientosNormales.setTipoAsiento(normal);
                asientosNormales.setVuelo(vuelo);
                asientosNormales.setDisponible(true);
                this.asientosRepository.save(asientosNormales);
            }
        }
        
        return "Creacion de asientos exitosa";
        }
        
        return "Vuelo no encontrado";
    }


    /**
     * No realiza la eliminacion :/
     */
    @Override
    public String eliiminarTotalAsientosPorVuelo(String idVuelo) {
    Vuelo vuelo = this.vueloRepository.findById(idVuelo).get();

        if (vuelo != null) {
            for (Asientos asiento : vuelo.getAsientos()) {
                this.asientosRepository.delete(asiento);
            }
            vuelo.setAsientos(null);
            this.vueloRepository.save(vuelo);

            return "Eliminacion de asientos exitosa";
        }
    
        return "Vuelo no encontrado";
    }


}

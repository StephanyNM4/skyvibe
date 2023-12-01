package sky.vibe.airlines.skyvibe.modelos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vuelos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vuelo {
    
    @Id
    @Column(name = "idvuelo")
    private String idVuelo;

    @ManyToOne
    @JoinColumn(name = "idaerolinea", referencedColumnName = "idaerolinea")
    private Aerolinea aerolinea;

    @ManyToOne
    @JoinColumn(name = "idruta", referencedColumnName = "idruta")
    private Ruta ruta;

    @Column(name = "fechapartida")
    private Date fechaPartida; 

    @Column(name = "numerovuelo")
    private int numeroVuelo; 

    @Column(name = "horapartida")
    private String horaPartida;

    @Column(name = "horallegada")
    private String horaLlegada;

    private int gate; 

    /*
     * TRUE -> Si el tipo vuelo es true entonces es un vuelo directo (existe)
     * FALSE -> Si el tipo vuelo es false entonces es un vuelo indirecto (Se trabaja con escalas)
     */
    @Column(name = "tipovuelo")
    private Boolean tipoVuelo;


    @JsonIgnore
    @OneToMany(mappedBy = "vueloPadre")
    private List<Escala> escalas;

    @JsonIgnore
    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL)
    private List<Asientos> asientos;

}

package sky.vibe.airlines.skyvibe.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rutas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idruta")
    private int idRuta;

    private String origen; 

    private String destino; 

    /**
     * Distancia implicitamente equivale a kilometros.
     */
    private double distancia; 

    @JsonIgnore
    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL)
    private List<Vuelo> vuelos;
}

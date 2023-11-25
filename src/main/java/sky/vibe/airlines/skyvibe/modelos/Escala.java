package sky.vibe.airlines.skyvibe.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "escalas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Escala {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idescala")
    private int idEscala;

    @ManyToOne
    @JoinColumn(name = "idvuelo", referencedColumnName = "idvuelo")
    private Vuelo vuelo;

    @Column(name = "nombreaeropuerto")
    private String nombreAeropuerto; 

}

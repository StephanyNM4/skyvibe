package sky.vibe.airlines.skyvibe.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "asientos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Asientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idasiento")
    private int idAsiento;

    @ManyToOne
    @JoinColumn(name = "idtipoasiento", referencedColumnName = "idtipoasiento")
    private TipoAsiento tipoAsiento;

    
    @ManyToOne
    @JoinColumn(name = "idvuelo", referencedColumnName = "idvuelo")
    private Vuelo vuelo;

    @Column(name = "nombreasiento")
    private String  nombreAsiento; 

    @Column(name = "disponible")
    private boolean  disponible; 

    @JsonIgnore
    @OneToOne(mappedBy = "asiento")
    private Boleto boleto;
}

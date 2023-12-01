package sky.vibe.airlines.skyvibe.modelos;
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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tipoasiento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoAsiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipoasiento")
    private int idTipoAsiento;

    @Column(name = "tipoasiento")
    private String tipoAsiento;

    @Column(name = "preciobase")
    private double precioBase;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoAsiento", cascade = CascadeType.ALL)
    private List<Asientos> asientos;
}

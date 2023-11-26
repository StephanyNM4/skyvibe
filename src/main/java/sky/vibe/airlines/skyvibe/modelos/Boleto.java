package sky.vibe.airlines.skyvibe.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

@Entity
@Table(name = "boletos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idboleto")
    private int idBoleto;

    
    @ManyToOne
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    private Cliente cliente;

    @ManyToOne(optional = true)
    @JoinColumn(name = "idescala", referencedColumnName = "idescala")
    private Escala escala;

    @OneToOne
    @JoinColumn(name = "idasiento", referencedColumnName = "idasiento")
    private Asientos asiento;

    @Column(name = "precio")
    private double  precio; 
}

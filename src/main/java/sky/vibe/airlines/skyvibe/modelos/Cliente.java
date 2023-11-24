package sky.vibe.airlines.skyvibe.modelos;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sky.vibe.airlines.skyvibe.servicios.impl.ClienteServiceImpl;

@Entity
@Table(name = "clientes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private int idCliente;
}

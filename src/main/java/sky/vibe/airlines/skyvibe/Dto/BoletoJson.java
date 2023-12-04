package sky.vibe.airlines.skyvibe.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoletoJson {

    private int idCliente;

    private String nombreAsiento;

    private String idVuelo;

}

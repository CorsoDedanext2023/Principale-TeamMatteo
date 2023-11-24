package it.dedagroup.venditabiglietti.principal.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatiEventiDTOResponse {
    private String descrizione;
    private List<SettoriPerSingoloLuogo> settoriPerLuogo;
    private String viaLuogo;
}

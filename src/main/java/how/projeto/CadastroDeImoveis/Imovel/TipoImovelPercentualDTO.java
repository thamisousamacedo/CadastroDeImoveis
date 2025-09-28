package how.projeto.CadastroDeImoveis.Imovel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
// Para o requisito c.
// Exemplo: { "tipoImovel": "Apartamento", "percentual": "50%" }
public class TipoImovelPercentualDTO {
    private String tipoImovel;
    private String percentual;

}

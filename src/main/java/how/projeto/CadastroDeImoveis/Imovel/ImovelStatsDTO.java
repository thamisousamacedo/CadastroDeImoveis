package how.projeto.CadastroDeImoveis.Imovel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

// Para o requisito a.
// Exemplo: { "imovelId": 18, "totalPagamentos": 7000.0 }
@AllArgsConstructor
@NoArgsConstructor
public class ImovelStatsDTO {
    private Long imovelId;
    private Double totalPagamentos;

}

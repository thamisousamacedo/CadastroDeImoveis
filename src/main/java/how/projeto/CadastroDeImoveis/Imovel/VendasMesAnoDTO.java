package how.projeto.CadastroDeImoveis.Imovel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
// Para o requisito b.
// Exemplo: { "mesAno": "11/2022", "totalVendas": 23000.0 }
public class VendasMesAnoDTO {
    private String mesAno;
    private Double totalVendas;

}

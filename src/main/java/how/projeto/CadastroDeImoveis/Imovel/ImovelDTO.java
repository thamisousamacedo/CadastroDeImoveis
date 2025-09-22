package how.projeto.CadastroDeImoveis.Imovel;

import how.projeto.CadastroDeImoveis.Pagamentos.PagamentoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImovelDTO {

    private Long id;
    private String descricao;
    private String tipo;
    private PagamentoModel pagamento;
}


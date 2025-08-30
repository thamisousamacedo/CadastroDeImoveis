package how.projeto.CadastroDeImoveis.Imovel;

import how.projeto.CadastroDeImoveis.Pagamentos.PagamentoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadstro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImovelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    private String descricao;

    @OneToMany(mappedBy = "imovel")
    private PagamentoModel pagamento;
}

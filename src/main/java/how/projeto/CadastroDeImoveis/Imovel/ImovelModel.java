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
    @Column (name = "id")
    private Long id;

    @Column (name = "tipo")
    private String tipo;

    @Column (name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "imovel")
    private PagamentoModel pagamento;
}

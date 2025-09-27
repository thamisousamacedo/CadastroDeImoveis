package how.projeto.CadastroDeImoveis.Imovel;
import how.projeto.CadastroDeImoveis.Pagamentos.PagamentoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_cadstro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "pagamento")
public class ImovelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "descricao")
    private String descricao;

    @Column (name = "tipo")
    private String tipo;


    @ManyToOne
    @JoinColumn(name = "pagamento_id")
    private PagamentoModel pagamento;
}

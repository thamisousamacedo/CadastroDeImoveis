package how.projeto.CadastroDeImoveis;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadstro")
public class ImovelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String tipo;
    String descricao;
}

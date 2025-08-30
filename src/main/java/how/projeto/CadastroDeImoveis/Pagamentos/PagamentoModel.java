package how.projeto.CadastroDeImoveis.Pagamentos;


import how.projeto.CadastroDeImoveis.Imovel.ImovelModel;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_pagamento")
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataPagamento;

    private double valor;

    @ManyToOne
    @JoinColumn(name = "imovel_id")
    private List<ImovelModel> imovel;

}

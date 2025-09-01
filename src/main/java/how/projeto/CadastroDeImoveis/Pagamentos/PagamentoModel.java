package how.projeto.CadastroDeImoveis.Pagamentos;


import com.fasterxml.jackson.annotation.JsonIgnore;
import how.projeto.CadastroDeImoveis.Imovel.ImovelModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_pagamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataPagamento;

    private double valor;

   @OneToMany(mappedBy = "pagamento")
   @JsonIgnore
    private List<ImovelModel> imovel;

}

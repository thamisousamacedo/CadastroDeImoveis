package how.projeto.CadastroDeImoveis.Pagamentos;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pagamentos")
public class PagamentoController {

    // Get -- mandar uma requisição para listar os pagamentos
    @GetMapping("/listar")
    public String listarPagamento() {
        return "Pagamentos listados com sucesso";
    }

    // Post -- mandar uma requisição para criar os pagamentos
    @PostMapping("/criar")
    public String criarPagamento() {
        return "Pagamento criado com sucesso";
    }

    // Put -- mandar uma requisição para alterar os pagamentos
    @PutMapping("/alterar")
    public String alterarPagamento() {
        return "Pagamento alterado com sucesso";
    }

    // Deletar -- mandar uma requisição para deletar os pagamentos
    @DeleteMapping("/deletar")
    public String deletarPagamento() {
        return "Pagamento deletado com sucesso";
    }


}

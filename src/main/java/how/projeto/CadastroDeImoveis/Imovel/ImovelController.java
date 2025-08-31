package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

        // adicionar imovel (CREATE)
        @PostMapping("/criar")
         public String criarImovel() {
            return "Imovel criado";
        }


        // mostrar todos os imoveis (READ)
        @GetMapping("/listar")
        public String mostrarTodosOsImoveis() {
        return "Mostrar Imovel";
        }


        // mostrar imovel por id (READ)
        @GetMapping("/listarID")
        public String mostrarTodosOsImoveisPorId() {
            return "Mostrar imovel por id";
        }

        // alterar dados dos imoveis (UPDATE)
        @PutMapping("/alterarID")
        public String AlterarImovelPorId() {
            return "Alterar imovel por id";
        }

        // deletar imovel (DELETE)
        @DeleteMapping("/deletarID")
        public String deletarImovelPorId() {
            return "Imovel deletado por id";
        }



}

package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    public ImovelService ninjaService;

    public ImovelController(ImovelService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
        public List<ImovelModel> listarImoveis() {
        return ninjaService.listarImoveis();
        }


        // mostrar imovel por id (READ)
        @GetMapping("/listar/{id}")
        public ImovelModel listarImovelPorId(@PathVariable long id) {
            return ninjaService.ListarImoveisPorId(id);
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

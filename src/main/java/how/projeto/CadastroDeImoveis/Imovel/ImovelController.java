package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    public ImovelService imovelService;

    public ImovelController(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

        // adicionar imovel (CREATE). @RequestBody manda no corpo da requisição o JSON que está no ImovelModel com os dados de id, tipo, descrição... toda vez que ele mandar o JSON, ele vai pegar o JSON serelializar e empurrar para salvar no BD
        @PostMapping("/criar")
         public ImovelModel criarImovel(@RequestBody ImovelModel imovel) {
            return imovelService.criarImovel(imovel);
        }


        // mostrar todos os imoveis (READ). O Get está puxando do BD, serelializando em forma de JSON e mostrando para o usuário
        @GetMapping("/listar")
        public List<ImovelModel> listarImoveis() {
            return imovelService.listarImoveis();
        }


        // mostrar imovel por id (READ). Puxando do BD, serealizando em forma de JSON. PathVariable pegar por id
        @GetMapping("/listar/{id}")
        public ImovelModel listarImovelPorId(@PathVariable long id) {return imovelService.ListarImoveisPorId(id);
        }

        // alterar dados dos imoveis (UPDATE)
        @PutMapping("/alterarID")
        public String AlterarImovelPorId() {return "Alterar imovel por id";
        }

        // deletar imovel (DELETE)
        @DeleteMapping("/deletar/{id}")
        public void deletarImovelPorId(@PathVariable Long id) {
            imovelService.deletarImovelPorId(id);
        }



}

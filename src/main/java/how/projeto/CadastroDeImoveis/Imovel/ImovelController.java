package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    public final ImovelService imovelService;

    public ImovelController(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

        // adicionar imovel (CREATE). @RequestBody manda no corpo da requisição o JSON que está no ImovelModel com os dados de id, tipo, descrição... toda vez que ele mandar o JSON, ele vai pegar o JSON serelializar e empurrar para salvar no BD
        @PostMapping("/criar")
         public ResponseEntity<String> criarImovel(@RequestBody ImovelDTO imovel) {
            ImovelDTO newImovel = imovelService.criarImovel(imovel);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(("Imóvel criado com sucesso " + newImovel.getTipo() + " (ID) " + newImovel.getId()));
        }


        // mostrar todos os imoveis (READ). O Get está puxando do BD, serelializando em forma de JSON e mostrando para o usuário
        @GetMapping("/listar")
        public ResponseEntity<List<ImovelDTO>> ListarImoveis() {
            List<ImovelDTO> imoveis = imovelService.listarImoveis();
            return ResponseEntity.ok(imoveis);
        }


        // mostrar imovel por id (READ). Puxando do BD, serealizando em forma de JSON. PathVariable pegar por id
        @GetMapping("/listar/{id}")
        public ResponseEntity<?> listarImovelPorId(@PathVariable long id) {

            ImovelDTO imovel = imovelService.ListarImoveisPorId(id);

            if (imovel != null) {
                return ResponseEntity.ok(imovel);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Imóvel com o id: " + id + " não existe nos nossos registros!");
            }
        }

        // alterar dados dos imoveis (UPDATE)
        @PutMapping("/alterar/{id}")
        public ResponseEntity<?> AlterarImovelPorId(@PathVariable Long id, @RequestBody ImovelDTO imovelAtualizado) {
            ImovelDTO imovel = imovelService.alterarImovel(id, imovelAtualizado);

            if (imovel != null) {
                return ResponseEntity.ok(imovel);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Imóvel com o id: " + id + " não existe nos nossos registros!");
            }
        }




        // deletar imovel (DELETE)
        @DeleteMapping("/deletar/{id}")
        public ResponseEntity<String> deletarImovelPorId(@PathVariable Long id) {
            if (imovelService.ListarImoveisPorId(id) != null) {
                imovelService.deletarImovelPorId(id);
                return ResponseEntity.ok("Imóvel com o ID " + id + " deletado com sucesso!");

            } else  {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("O imóvel com o id " + id + " não encontrado!");
            }
        }

}

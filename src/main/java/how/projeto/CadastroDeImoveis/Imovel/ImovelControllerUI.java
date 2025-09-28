package how.projeto.CadastroDeImoveis.Imovel;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/imoveis/ui")
public class ImovelControllerUI {

    private final ImovelService imovelService;

    public ImovelControllerUI(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    @GetMapping("/listar")
    public String ListarImoveis(Model model) {
        List<ImovelDTO> imoveis = imovelService.listarImoveis();
        model.addAttribute("imoveis", imoveis);
        return "ListarImoveis";
    }

    @GetMapping("/deletar/{id}")
    public String deletarImovelPorId(@PathVariable Long id) {
        imovelService.deletarImovelPorId(id);
        return "redirect:/imoveis/ui/listar";
    }

}

package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    private ImovelRepository imovelRepository;

    public ImovelService(ImovelRepository imovelRepository) {
        this.imovelRepository = imovelRepository;
    }

    // listar todos os imóveis
    public List<ImovelModel> listarImoveis() {
        return imovelRepository.findAll();

    }

}

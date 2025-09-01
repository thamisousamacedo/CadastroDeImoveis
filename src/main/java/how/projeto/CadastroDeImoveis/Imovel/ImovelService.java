package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // listar todos os meus imóveis por ID
    public ImovelModel ListarImoveisPorId(Long id) {
        Optional<ImovelModel> imovelPorId = imovelRepository.findById(id);
        return imovelPorId.orElse(null);
    }


}

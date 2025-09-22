package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    private ImovelRepository imovelRepository;
    private ImovelMapper imovelMapper;

    public ImovelService(ImovelRepository imovelRepository, ImovelMapper imovelMapper) {
        this.imovelRepository = imovelRepository;
        this.imovelMapper = imovelMapper;
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

    // Criar um novo imóvel
    public ImovelDTO criarImovel(ImovelDTO imovelDTO) {
        ImovelModel imovel = imovelMapper.map(imovelDTO);
        imovel = imovelRepository.save(imovel);
        return imovelMapper.map(imovel);
    }

    // Deletar imóvel por id - Tem que ser um metodo void (não precisa retornar)
    public void deletarImovelPorId(Long id) {
        imovelRepository.deleteById(id);
    }

    public ImovelModel alterarImovel(Long id, ImovelModel imovelAtualizado) {
        if (imovelRepository.existsById(id)) {
            imovelAtualizado.setId(id);
            return imovelRepository.save(imovelAtualizado);
        }
        return null;
    }

}

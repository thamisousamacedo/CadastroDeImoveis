package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImovelService {

    private ImovelRepository imovelRepository;
    private ImovelMapper imovelMapper;

    public ImovelService(ImovelRepository imovelRepository, ImovelMapper imovelMapper) {
        this.imovelRepository = imovelRepository;
        this.imovelMapper = imovelMapper;
    }

    // listar todos os imóveis. Stream para percorrer a List
    public List<ImovelDTO> listarImoveis() {
        List<ImovelModel> imoveis = imovelRepository.findAll();
        return imoveis.stream()
                .map(imovelMapper::map)
                .collect(Collectors.toList());

    }

    // listar todos os meus imóveis por ID. Optional tem a mesma função do if e else(pode existir ou não), o usuário pode passar um id que existe ou não
    public ImovelDTO ListarImoveisPorId(Long id) {
        Optional<ImovelModel> imovelPorId = imovelRepository.findById(id);
        return imovelPorId.map(imovelMapper::map).orElse(null);
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

    public ImovelDTO alterarImovel(Long id, ImovelDTO imovelDTO) {
        Optional<ImovelModel> imovelExistente = imovelRepository.findById(id); //o optional vai fazer essa query de procurar pelo id que o usuário passar
        if (imovelExistente.isPresent()) { //se o id existir
            ImovelModel imovelAtualizado = imovelMapper.map(imovelDTO); //vai fazer o mapper do dto
            imovelAtualizado.setId(id); //vai sobreescrever esse id
            ImovelModel imovelSalvo = imovelRepository.save(imovelAtualizado); //vai salvar os dados do imovel
            return imovelMapper.map(imovelSalvo); //vai retornar o imovel salvo
        }
        return null;
    }

}

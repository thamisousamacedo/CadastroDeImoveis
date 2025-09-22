package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.stereotype.Component;

@Component
public class ImovelMapper {

    public ImovelModel map(ImovelDTO imovelDTO) {
        ImovelModel imovelModel = new ImovelModel();
        imovelModel.setId(imovelDTO.getId());
        imovelModel.setDescricao(imovelDTO.getDescricao());
        imovelModel.setTipo(imovelDTO.getTipo());
        imovelModel.setPagamento(imovelDTO.getPagamento());

        return imovelModel;
    }

    public ImovelDTO map(ImovelModel imovelModel) {
        ImovelDTO imovelDTO = new ImovelDTO();
        imovelDTO.setId(imovelModel.getId());
        imovelDTO.setDescricao(imovelModel.getDescricao());
        imovelDTO.setTipo(imovelModel.getTipo());
        imovelDTO.setPagamento(imovelModel.getPagamento());

        return imovelDTO;
    }
}

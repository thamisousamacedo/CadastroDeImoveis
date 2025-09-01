package how.projeto.CadastroDeImoveis.Imovel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository <ImovelModel, Long> {
}

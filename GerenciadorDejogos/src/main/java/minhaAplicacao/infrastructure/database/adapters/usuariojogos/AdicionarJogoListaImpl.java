package minhaAplicacao.infrastructure.database.adapters.usuariojogos;

import minhaAplicacao.domain.entities.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdicionarJogoListaImpl extends JpaRepository<Jogo, Long> {
}

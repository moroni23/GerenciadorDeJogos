package minhaAplicacao.infrastructure.database.adapters.usuariojogos;

import minhaAplicacao.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcluirJogoUsuarioImpl extends JpaRepository<Usuario, Long> {
}

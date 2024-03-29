package minhaAplicacao.infrastructure.database.adapters.usuario;

import minhaAplicacao.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcluirUsuarioImpl extends JpaRepository<Usuario, Long> {
}

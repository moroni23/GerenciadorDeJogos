package minhaAplicacao.infrastructure.database.adapters.repository;

import minhaAplicacao.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryImpl extends JpaRepository<Usuario, Long> {

}

package minhaAplicacao.infrastructure.database.adapters.repository;

import minhaAplicacao.domain.entities.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJogoRepositoryImpl extends JpaRepository<Jogo,Long > {
}

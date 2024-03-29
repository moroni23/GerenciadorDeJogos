package minhaAplicacao.application.services.usuario;


import minhaAplicacao.domain.entities.Usuario;
import minhaAplicacao.infrastructure.database.adapters.repository.UsuarioRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdicionarUsuarioService {

    @Autowired
    private UsuarioRepositoryImpl usuarioRepositoryImp;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepositoryImp.save(usuario);

    }


}

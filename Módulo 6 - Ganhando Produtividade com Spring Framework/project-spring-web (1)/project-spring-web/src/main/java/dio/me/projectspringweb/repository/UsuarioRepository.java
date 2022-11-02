package dio.me.projectspringweb.repository;

import dio.me.projectspringweb.databank.UsuarioData;
import dio.me.projectspringweb.model.Usuario;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository{

    UsuarioData usuarioData = new UsuarioData(List.of(new Usuario(1,"felipeb", "felipe123"),
            new Usuario(2,"bruninhob", "bruninho123"),
            new Usuario(3,"cleusinhaf", "cleusinha123")));
    public void save (Usuario usuario){
        if (usuario.getId() == null){
            System.out.println("SAVE - Salvando os dados");

            List<Usuario> usuarios = new ArrayList<>(usuarioData.getUsuarios());
            usuarios.add(new Usuario(usuarios.size() + 1 , usuario.getLogin(), usuario.getPassword()));
            usuarioData.setUsuarios(usuarios);

        }
        else {
            System.out.println("UPDATE - Atualizando os dados");
            List<Usuario> usuarios =  new ArrayList<>(usuarioData.getUsuarios());

            for (Usuario user : usuarios){
                if (user.getId().equals(usuario.getId())){
                    user.setLogin(usuario.getLogin());
                    user.setPassword(usuario.getPassword());
                    break;
                }
            }

            usuarioData.setUsuarios(usuarios);
        }

    }

    public void deleteById (Integer id){
        System.out.printf("Deletando usuário pelo id: %d", id);
        List<Usuario> usuarios = new ArrayList<>(usuarioData.getUsuarios());
        List<Usuario> usuariosAtualizados = new ArrayList<>();

        for (Usuario usuario : usuarios){
            if (!usuario.getId().equals(id))
                usuariosAtualizados.add(usuario);
        }

        usuarioData.setUsuarios(usuariosAtualizados);
    }

    public List<Usuario> findAll(){
        return usuarioData.getUsuarios();
    }

    public Usuario findByID(Integer id){
        List<Usuario> usuarios = usuarioData.getUsuarios();
        return usuarios.get(id);
    }

    public Usuario findByLogin(String login){
        List<Usuario> usuarios = usuarioData.getUsuarios();
        Usuario user = new Usuario(usuarios.size() + 1, "", "" );

        for (Usuario usuario : usuarios){
            if (usuario.getLogin().equals(login))
                user = usuario;
        }

        return user;
    }
}

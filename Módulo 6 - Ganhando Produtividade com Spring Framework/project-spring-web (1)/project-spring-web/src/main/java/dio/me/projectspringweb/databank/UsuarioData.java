package dio.me.projectspringweb.databank;

import dio.me.projectspringweb.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioData {

    List<Usuario> usuarios;

    public UsuarioData(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

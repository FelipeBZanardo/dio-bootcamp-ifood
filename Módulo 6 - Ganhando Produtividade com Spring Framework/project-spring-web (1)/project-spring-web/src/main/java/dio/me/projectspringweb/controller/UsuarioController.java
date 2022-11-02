package dio.me.projectspringweb.controller;

import dio.me.projectspringweb.model.Usuario;
import dio.me.projectspringweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    private List<Usuario> getUsers(){
        return usuarioRepository.findAll();
    }

    /*@GetMapping("/{id}")
    private Usuario getOnebyId(@PathVariable("id") Integer id){
        return usuarioRepository.findByID(id);
    }*/

    @GetMapping("/{login}")
    private Usuario getOneByLogin(@PathVariable("login") String login){
        return  usuarioRepository.findByLogin(login);
    }

    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable("id") Integer id){
        usuarioRepository.deleteById(id);
    }

    @PostMapping
    private void postUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @PutMapping
    private void putUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}

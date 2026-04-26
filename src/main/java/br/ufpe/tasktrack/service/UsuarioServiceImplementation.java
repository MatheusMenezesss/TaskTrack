package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.DTO.UsuarioDTO;
import br.ufpe.tasktrack.domain.Usuario;
import br.ufpe.tasktrack.repository.UsuarioRepository;
import jakarta.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioServiceImplementation implements UsuarioService {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioServiceImplementation.class);
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImplementation(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDTO createUser(String nome, String cpf, String endereco, String email, String login, String contato, String privilegio){
        UsuarioDTO user = new UsuarioDTO(nome, endereco, email, cpf);
        return user;
    }

    public List<String> getALLusers(){
        List<String> users = new ArrayList<>();
        users.add("Usuario 1");
        users.add("Usuario 2");
        users.add("Usuario 3");
        return users;
    }

    @Override
    public UsuarioDTO updateUser(Integer id_usuario, String nome, String cpf, String endereco, String email, String login, String contato, String privilegio){
            Usuario user = new Usuario(nome, cpf, endereco, email, login, contato, privilegio);
            Usuario salvo = usuarioRepository.save(user);
            return new UsuarioDTO(salvo.getNome(), salvo.getEndereco(), salvo.getEmail(), salvo.getCpf());
    }

    @Override
    public void deleteUser(Integer id_usuario){
        logger.info("Deletando usuário com ID: " + id_usuario);
        // Aqui você pode adicionar a lógica para deletar o usuário do banco de dados
    }

    @Override
    public Optional<Usuario> getUserById(Integer id_usuario){
        // Aqui você pode adicionar a lógica para buscar o usuário no banco de dados
        Usuario user = usuarioRepository.findById(id_usuario).orElseThrow(() -> new RuntimeException("Usuário não encontrado com ID: " + id_usuario));
        if(user != null){
            return Optional.of(user);
        }
        return Optional.empty(); // Retorna um Optional vazio por padrão, substitua pela lógica real

    }
 

}

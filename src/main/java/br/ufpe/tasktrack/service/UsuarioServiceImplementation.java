package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.DTO.UsuarioDTO;
import br.ufpe.tasktrack.domain.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioServiceImplementation {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioServiceImplementation.class);


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

    public Usuario updateUser(Integer id_usuario, String nome, String cpf, String endereco, String email, String login, String contato, String privilegio){
            Usuario user = new Usuario();
            user.setNome(nome);
            user.setEndereco(endereco);
            user.setEmail(email);
            user.setCPF(cpf);
            
            return user;
    }

    public void deleteUser(Integer id_usuario){
        logger.info("Deletando usuário com ID: " + id_usuario);
        // Aqui você pode adicionar a lógica para deletar o usuário do banco de dados
    }

    public Optional<Usuario> getUserById(Integer id_usuario){
        // Aqui você pode adicionar a lógica para buscar o usuário no banco de dados
        return Optional.empty(); // Retorna um Optional vazio por padrão, substitua pela lógica real

    }

    public boolean userExists(Integer id_usuario){
        // Aqui você pode adicionar a lógica para verificar se o usuário existe no banco de dados
        return false; // Retorna false por padrão, substitua pela lógica real
    }
 

}

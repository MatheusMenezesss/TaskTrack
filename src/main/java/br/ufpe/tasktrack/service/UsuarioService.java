package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Usuario;
import br.ufpe.tasktrack.DTO.UsuarioDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public UsuarioDTO createUser(String nome, String cpf, String endereco, String email, String login, String contato, String privilegio);

    public List<String> getALLusers();

    public UsuarioDTO updateUser(Integer id_usuario, String nome, String cpf, String endereco, String email, String login, String contato, String privilegio);
 
}

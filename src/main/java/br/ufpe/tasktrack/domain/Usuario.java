package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer id_usuario;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String endereco;

    @Column
    private String email;

    @Column
    private String login;

    @Column
    private String contato;

    @Column
    private String privilegio;
}

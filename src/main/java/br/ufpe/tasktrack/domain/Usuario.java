package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer id_usuario;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String login;
    private String contato;
    private String privilegio;

    // Getters e Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }


}

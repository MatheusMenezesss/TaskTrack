package br.ufpe.tasktrack.DTO;

import jakarta.persistence.Column;

public class UsuarioDTO {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String login;
    private String contato;
    private String privilegio;

    // Getters and Setters
    public String getNome() {
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }  

    public String getEmail(){
        return this.email;
    }

    public String getLogin(){
        return this.login;
    }

    public String getContato(){
        return this.contato;
    }

    public String getPrivilegio(){
        return this.privilegio;
    }
    //Constyructor:

    public UsuarioDTO(){}

    public UsuarioDTO(String nome, String cpf, String endereco, String email, String login, String contato, String privilegio){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.login = login;
        this.contato = contato;
        this.privilegio = privilegio;
    }

    public UsuarioDTO(String nome, String endereco, String email, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
    }


}

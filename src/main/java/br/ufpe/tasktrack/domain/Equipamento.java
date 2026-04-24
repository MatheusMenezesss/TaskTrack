package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

@Data
@Entity
@Table(name = "equipamento")
public class Equipamento {
    
    @Id
    @GeneratedValue
    private Integer id_equipamento;

    @Column(length = 100)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    // Getters e Setters

    public Integer getID_equipamento(){
        return this.id_equipamento;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    // Construtor
    public Equipamento() {} //o contrutor vazio deve exitir para o JPA funcionar

    public Equipamento(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
}

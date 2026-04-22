package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "instituicao")
public class Instituicao {
    
    @Id
    @GeneratedValue
    private Integer id_instituicao;

    @Column(length = 100)
    private String nome;

    @Column(length = 10)
    private String sigla;

        // Getters e Setters
    
        public String getNome(){
            return this.nome;
        }
    
        public String getSigla(){
            return this.sigla;
        }
    
        public void setNome(String nome){
            this.nome = nome;
        }
    
        public void setSigla(String sigla){
            this.sigla = sigla;
        }
    
        // Construtor
        public Instituicao() {} //o contrutor vazio deve exitir para o JPA funcionar
    
        public Instituicao(String nome, String sigla){
            this.nome = nome;
            this.sigla = sigla;
        }
}

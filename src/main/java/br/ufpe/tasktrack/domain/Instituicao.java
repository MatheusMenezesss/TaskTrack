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
}

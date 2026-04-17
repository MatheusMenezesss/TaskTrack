package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "estoque")
public class Estoque {
    
    @Id
    @GeneratedValue
    private Integer id_estoque;

    @Column(nullable = false)
    private Integer id_instituicao;

    @Column
    private Integer registro;

    @Column(length = 50)
    private String nome;
}

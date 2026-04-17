package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

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
}

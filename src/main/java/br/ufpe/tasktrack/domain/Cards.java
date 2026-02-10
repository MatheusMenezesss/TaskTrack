package br.ufpe.tasktrack.domain;

import org.hibernate.annotations.IdGeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cards")
public class Cards {
    //id, column_id, title, description, created_at, position (posição do card na coluna), assigned_to (usuário atribuído ao card)
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) //diz ao jpa/hibernate: o valor é gerado pelo róprio banco de dados
    private Long id;

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long column_id;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description; 

    @Column(nullable = false)
    private String created_at;

    @Column(nullable = false)
    private int position;

    @Column(nullable = false)
    private String assigned_to;
}

package br.ufpe.tasktrack.domain;

import java.time.LocalDateTime;

//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "boards")
public class Boards {
    //id , name, createdAT
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDateTime created_at;

    public Boards(String name){
        this.name = name;
        this.created_at = LocalDateTime.now();
    }
}

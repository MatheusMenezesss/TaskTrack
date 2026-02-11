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

    public Cards(String title, String description, String assigned_to){
        this.title = title;
        this.description = description;
        this.created_at = java.time.LocalDateTime.now().toString();
        this.assigned_to = assigned_to;
    }

    public Long getId() {
        return id;
    }

    public long getColumn_id() {
        return column_id;
    }

    public void setColumn_id(long column_id) {
        this.column_id = column_id;
    }

    public String getTitle() {
        return title;
    }   

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }
}

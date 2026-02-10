package br.ufpe.tasktrack.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity //define a classe como uma entidade JPA
@Table(name = "tasks") //a classe "Task" será mapeada para uma tabela chamada "tasks" no banco de dados
public class Task {

    @Id //chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera automaticamente o valor da chave
    private Long id;

    @Column(nullable = false) // nullable é um binário que indica se a coluna pode ser nula ou não. com nullable = false, não pode!
    private String title;

    @Column(length = 1000) //dfine que a descrição deve ter no máximo 1000 caracteres!
    private String description;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime dueDate;

    @Column(nullable = false)
    private boolean completed;

    // Constructors, getters, and setters

    public Task() {
        this.createdAt = LocalDateTime.now();
        this.completed = false;
    }

    public Long getId() {
        return id;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}

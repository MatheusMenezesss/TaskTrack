package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "columns")
public class Columns {
    //id, boeard_id, name, wip_limit (limite de tarefas na coluna), order_index (posição da coluna no quadro)
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Id
    private Long boardId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int wip_limit;

    @Column(nullable = false)
    private int order_index;
}

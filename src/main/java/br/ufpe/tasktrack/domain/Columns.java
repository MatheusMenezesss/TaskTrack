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

    public Columns(String name, int wip_limit, int order_index){
        this.name = name;
        this.wip_limit = wip_limit;
        this.order_index = order_index;
    }

    public Long getId() {
        return id;
    }   

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWip_limit() {
        return wip_limit;
    }

    public void setWip_limit(int wip_limit) {
        this.wip_limit = wip_limit;
    }

    public int getOrder_index() {
        return order_index;
    }

    public void setOrder_index(int order_index) {
        this.order_index = order_index;
    }
}

package br.ufpe.tasktrack.domain;

import java.io.Serializable;
import java.util.Objects;

public class ColumnsId implements Serializable {

    private Long id;
    private Long boardId;

    public ColumnsId() {}

    public ColumnsId(Long id, Long boardId) {
        this.id = id;
        this.boardId = boardId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnsId that = (ColumnsId) o;
        return Objects.equals(id, that.id) && Objects.equals(boardId, that.boardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, boardId);
    }
}
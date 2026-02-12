package br.ufpe.tasktrack.service;
import br.ufpe.tasktrack.domain.Columns;

public interface ColumnService {
    Columns create(Columns column);

    Columns update(Long id, Columns column);

    void delete(Long id);

}

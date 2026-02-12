package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Columns;
import br.ufpe.tasktrack.repository.ColumnsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public class ColumnServiceImplementation {

    private static final Logger logger = LoggerFactory.getLogger(ColumnServiceImplementation.class);

    private final ColumnsRepository repository;

    public ColumnServiceImplementation(ColumnsRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Columns create(Columns column) {
        Optional<Columns> aux = repository.findById(column.getId());
        if(aux.isPresent()){
            logger.error("Column with id {} already exists", column.getId());
            return null;
        }
        logger.info("Column with id {} added successfully", column.getId());
        return repository.save(column);
    }

    @Override
    @Transactional
    public Columns update(Long id, Columns column) {
        Optional<Columns> existing = repository.findById(column.getId());
        if(existing.isEmpty()){
            logger.error("Column with id {} not found for update", column.getId());
            return null;
        }
        Columns updatedColumn = existing.get();
        updatedColumn.setTitle(column.getTitle());
        updatedColumn.setDescription(column.getDescription());

        logger.info("Column with id {} updated successfully", column.getId());
        return repository.save(updatedColumn);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Columns> existing = repository.findById(id);
        if(existing.isEmpty()){
            logger.error("Column with id {} not found for deletion", id);
            return;
        }
        logger.info("Column with id {} deleted successfully", id);
        repository.delete(existing.get());
    }
}

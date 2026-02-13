package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Columns;
import br.ufpe.tasktrack.repository.ColumnsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ColumnServiceImplementation implements ColumnService {

    private static final Logger logger = LoggerFactory.getLogger(ColumnServiceImplementation.class);

    private final ColumnsRepository repository;

    public ColumnServiceImplementation(ColumnsRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Columns create(Columns column) {
        if (repository.existsById(column.getId())) {
            logger.error("Column with id {} already exists", column.getId());
            throw new IllegalArgumentException("Column already exists");
        }
        logger.info("Column with id {} added successfully", column.getId());
        return repository.save(column);
    }

    @Override
    @Transactional
    public Columns update(Long id, Columns column) {
        Columns existing = repository.findById(id).orElseThrow(() -> {
            logger.error("Column with id {} not found for update", id);
            return new IllegalArgumentException("Column not found");
        });
        existing.setName(column.getName());

        logger.info("Column with id {} updated successfully", id);
        return repository.save(existing);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Columns existing = repository.findById(id).orElseThrow(() -> {
            logger.error("Column with id {} not found for deletion", id);
            return new IllegalArgumentException("Column not found");
        });
        logger.info("Column with id {} deleted successfully", id);
        repository.delete(existing);
    }
}

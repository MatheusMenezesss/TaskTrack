package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Boards;
import br.ufpe.tasktrack.repository.BoardsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class BoardServiceImplementation implements BoardService {

    private static final Logger logger = LoggerFactory.getLogger(BoardServiceImplementation.class);

    private final BoardsRepository repository;

    public BoardServiceImplementation(BoardsRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Boards create(Boards board) {
        if (repository.existsById(board.getId())) {
            logger.error("Board with id {} already exists", board.getId());
            throw new IllegalArgumentException("Board already exists");
        }
        logger.info("Board with id {} added successfully", board.getId());
        return repository.save(board);
    }

    @Override
    @Transactional
    public Boards update(Long id, Boards board) {
        Boards existing = repository.findById(id).orElseThrow(() -> {
            logger.error("Board with id {} not found for update", id);
            return new IllegalArgumentException("Board not found");
        });
        existing.setName(board.getName());

        logger.info("Board with id {} updated successfully", id);
        return repository.save(existing);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Boards existing = repository.findById(id).orElseThrow(() -> {
            logger.error("Board with id {} not found for deletion", id);
            return new IllegalArgumentException("Board not found");
        });
        logger.info("Board with id {} deleted successfully", id);
        repository.delete(existing);
    }
}

package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Boards;
import br.ufpe.tasktrack.repository.BoardsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public class BoardServiceImplementation implements BoardService {

    private static final Logger logger = LoggerFactory.getLogger(BoardServiceImplementation.class);

    private final BoardsRepository repository;

    public BoardServiceImplementation(BoardsRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Boards create(Boards board) {
        Optional<Boards> aux = repository.findById(board.getId());
        if(aux.isPresent()){
            logger.error("Board with id {} already exists", board.getId());
            return null;
        }
        logger.info("Board with id {} added successfully", board.getId());
        return repository.save(board);
    }

    @Override
    @Transactional
    public Boards update(Long id, Boards board) {
        Optional<Boards> existing = repository.findById(board.getId());
        if(existing.isEmpty()){
            logger.error("Board with id {} not found for update", board.getId());
            return null;
        }
        Boards updatedBoard = existing.get();
        updatedBoard.setTitle(board.getTitle());
        updatedBoard.setDescription(board.getDescription());

        logger.info("Board with id {} updated successfully", board.getId());
        return repository.save(updatedBoard);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Boards> existing = repository.findById(id);
        if(existing.isEmpty()){
            logger.error("Board with id {} not found for deletion", id);
            return;
        }
        logger.info("Board with id {} deleted successfully", id);
        repository.delete(existing.get());
    }
}

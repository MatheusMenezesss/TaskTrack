package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Boards;
import br.ufpe.tasktrack.DTO.BoardDTO;
import br.ufpe.tasktrack.repository.BoardsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
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
    public BoardDTO create(BoardDTO boardDTO) {
        Boards board = new Boards(boardDTO.name());
        Boards savedBoard = repository.save(board);
        return new BoardDTO(savedBoard.getName());
    }

    @Override
    @Transactional
    public BoardDTO update(Long id, BoardDTO boardDTO) {
        Optional<Boards> optionalBoard = repository.findById(id);
        if (optionalBoard.isPresent()) {
            Boards board = optionalBoard.get();
            board.setName(boardDTO.name());
            Boards updatedBoard = repository.save(board);
            return new BoardDTO(updatedBoard.getName());
        }
        throw new IllegalArgumentException("Board not found");
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public BoardDTO getBoardById(Long id) {
        Optional<Boards> optionalBoard = repository.findById(id);
        if (optionalBoard.isPresent()) {
            Boards board = optionalBoard.get();
            return new BoardDTO(board.getName());
        }
        throw new IllegalArgumentException("Board not found");
    }

    @Override
    @Transactional(readOnly = true)
    public List<BoardDTO> getAllBoards() {
        logger.info("buscando todos os boards");
        List<Boards> boards = repository.findAll();
        logger.info("boards encontrados: {}", boards);
        List<BoardDTO> boardDTOs = new ArrayList<>();
        for (Boards board : boards) {
            boardDTOs.add(new BoardDTO(board.getName()));
        }
        logger.info("boardDTOs criados: {}", boardDTOs);
        return boardDTOs;
    }
}

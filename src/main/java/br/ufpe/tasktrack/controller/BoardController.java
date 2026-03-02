package br.ufpe.tasktrack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.ufpe.tasktrack.domain.Boards;
import br.ufpe.tasktrack.DTO.BoardDTO;
import br.ufpe.tasktrack.service.BoardService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/boards")
public class BoardController {

    private final List<BoardService> boardServices;
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    public BoardController(List<BoardService> boardServices) {
        this.boardServices = boardServices;
        
    }

    @GetMapping("/all")
    public List<BoardDTO> getAllBoards() {
        logger.info("Iniciando busca por todos os boards");
        List<BoardDTO> boardDTOs = new ArrayList<>();
        for (BoardService boardService : boardServices) {
            List<BoardDTO> boards = boardService.getAllBoards(); // Método correto
            boardDTOs.addAll(boards);
        }
        logger.info("Boards encontrados: {}", boardDTOs);
        return boardDTOs;
    }
}

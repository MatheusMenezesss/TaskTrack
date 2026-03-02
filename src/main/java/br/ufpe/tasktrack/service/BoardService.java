package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Boards;
import br.ufpe.tasktrack.DTO.BoardDTO;

import java.util.List;

public interface BoardService {
    BoardDTO create(BoardDTO boardDTO);

    BoardDTO update(Long id, BoardDTO boardDTO);

    void delete(Long id);

    BoardDTO getBoardById(Long id);

    List<BoardDTO> getAllBoards(); // Renamed to reflect returning all boards
}
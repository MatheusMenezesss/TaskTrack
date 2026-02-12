package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Boards;

public interface BoardService {
    Boards create(Boards board);

    Boards update(Long id, Boards board);

    void delete(Long id);
} 
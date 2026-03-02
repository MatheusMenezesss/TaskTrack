package br.ufpe.tasktrack.repository;

import br.ufpe.tasktrack.domain.Boards;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardsRepository extends JpaRepository<Boards, Long>{

    @Query("SELECT b FROM Boards b")
    public List<Boards> findAllBoards();

}

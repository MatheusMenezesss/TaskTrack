package br.ufpe.tasktrack.repository;

import br.ufpe.tasktrack.domain.Boards;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardsRepository extends JpaRepository<Boards, Long>{

}

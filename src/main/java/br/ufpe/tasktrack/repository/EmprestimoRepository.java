package br.ufpe.tasktrack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.ufpe.tasktrack.domain.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}

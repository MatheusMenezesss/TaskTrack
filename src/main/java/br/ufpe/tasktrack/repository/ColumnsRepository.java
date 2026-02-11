package br.ufpe.tasktrack.repository;

import br.ufpe.tasktrack.domain.Columns;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColumnsRepository extends JpaRepository<Columns, Long> {

}

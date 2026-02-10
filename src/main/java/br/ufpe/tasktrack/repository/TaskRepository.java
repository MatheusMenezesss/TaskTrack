package br.ufpe.tasktrack.repository;

import br.ufpe.tasktrack.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task create(Task task);

    Task update(Long id, Task task);

    void delete(Long id);

    Optional<Task> findById(Long id);

    List<Task> findAll();
}

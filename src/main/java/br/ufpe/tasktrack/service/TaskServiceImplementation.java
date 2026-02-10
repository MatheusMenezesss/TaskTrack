package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Task;
import br.ufpe.tasktrack.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImplementation implements TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskServiceImplementation.class);

    private final TaskRepository repository;

    public TaskServiceImplementation(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Task create(Task task) {
        validateTask(task);
        logger.info("Creating task: {}", task);
        return repository.save(task);
    }

    @Override
    @Transactional
    public Task update(Long id, Task task) {
        Task existing = repository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Task not found with id: {}", id);
                    return new IllegalArgumentException("Task not found");
                });

        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription());
        existing.setCompleted(task.isCompleted());

        logger.info("Updating task with id: {}", id);
        return repository.save(existing);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Task task = repository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Task not found with id: {}", id);
                    return new IllegalArgumentException("Task not found");
                });

        logger.info("Deleting task with id: {}", id);
        repository.delete(task);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Task> findById(Long id) {
        logger.info("Finding task with id: {}", id);
        return repository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Task> findAll() {
        logger.info("Finding all tasks");
        return repository.findAll();
    }

    private void validateTask(Task task) {
        if (task.getTitle() == null || task.getTitle().isBlank()) {
            logger.error("Task validation failed: title is required");
            throw new IllegalArgumentException("Task title is required");
        }
    }
}

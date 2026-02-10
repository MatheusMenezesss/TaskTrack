package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Task;
import br.ufpe.tasktrack.repository.TaskRepository;

import org.hibernate.annotations.TimeZoneStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TaskServiceImplementationTest {
    @Mock
    private TaskRepository repository;

    @InjectMocks
    private TaskServiceImplementation service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateTask() {
        Task task = new Task();
        task.setTitle("Test task");

        when(repository.save(task)).thenReturn(task);

        Task createdTask = service.create(task);

        assertNotNull(createdTask);
        assertEquals("Test task", createdTask.getTitle());
        verify(repository, times(1)).save(task);
    }

    

}

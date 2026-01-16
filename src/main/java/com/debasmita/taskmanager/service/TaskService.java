package com.debasmita.taskmanager.service;

import com.debasmita.taskmanager.model.Task;
import com.debasmita.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Business logic for Task operations
@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    public Task addTask(Task task) {
        return repo.save(task);
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}

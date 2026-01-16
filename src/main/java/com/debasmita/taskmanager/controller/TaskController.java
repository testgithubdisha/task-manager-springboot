package com.debasmita.taskmanager.controller;

import com.debasmita.taskmanager.model.Task;
import com.debasmita.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// REST Controller for managing tasks
@RestController
@CrossOrigin
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.getAllTasks();
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return service.addTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}


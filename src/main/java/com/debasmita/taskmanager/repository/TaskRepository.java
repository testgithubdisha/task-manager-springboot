package com.debasmita.taskmanager.repository;

import com.debasmita.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA Repository for Task entity
public interface TaskRepository extends JpaRepository<Task, Long> {
}


package com.example.taskmanager.service;


import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public Task addTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        return repo.save(task); // 🔥 saves to DB
    }

    public List<Task> getAllTasks() {
        return repo.findAll(); // 🔥 fetch from DB
    }

    public void markComplete(int id) {
        Task task = repo.findById(id).orElseThrow();
        task.setCompleted(true);
        repo.save(task);
    }

    public void deleteTask(int id) {
        repo.deleteById(id);
    }
}
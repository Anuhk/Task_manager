package com.example.taskmanager.controller;


import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task addTask(@RequestParam String title) {
        return service.addTask(title);
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.getAllTasks();
    }

    @PutMapping("/{id}")
    public void completeTask(@PathVariable int id) {
        service.markComplete(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        service.deleteTask(id);
    }
}
package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @GetMapping(path = "/tasks")
    public List<Task> getTasks(){
        return repository.findAll();
    }

    @GetMapping(path = "/tasks/{id}")
    public Optional<Task> getTask(@PathVariable Long id){
        return repository.findById(id);
    }

    @DeleteMapping(path = "/tasks/{id}")
    public void deleteTask(@PathVariable Long id){
        repository.deleteById(id);
    }


}

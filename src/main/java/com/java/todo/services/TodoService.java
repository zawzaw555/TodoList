package com.java.todo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.todo.models.Todo;
import com.java.todo.repositories.TodoRepo;

@Service
public class TodoService {

    private final TodoRepo todoRepo;
    
    public TodoService(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    public List<Todo> all(){
        List<Todo> todos = todoRepo.findAll();
        return todos;
    }
}

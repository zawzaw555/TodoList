package com.todolist.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todos")
public class TodoController {
    // Show todo list
    @GetMapping("/list")
    public String todoList(){
        return"todos/list";
    }

    // Show add todo list
    @GetMapping("/add")
    public String addList(){
        return "todos/add";
    }

}

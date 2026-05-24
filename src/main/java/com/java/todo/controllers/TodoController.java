package com.java.todo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.todo.models.Todo;
import com.java.todo.services.TodoService;



@Controller
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    // Home All Page
    @GetMapping
    public String all(Model model){
        List<Todo> todos = todoService.all();
        model.addAttribute("todos",todos);
        return "todos/all";
    }

    // Add Lists Page
    @GetMapping("/add")
    public String  add(){
        return "todos/add";
    }

    // Add New Page
    @PostMapping("add")
    public String create(){
        return "redirect:/todos";
    }

    // Edit Page
    @GetMapping("edit/{id}")
    public String edit(@PathVariable Long id) {
        return "todos/edit";
    }

    // Edit Page Confirm
    @PostMapping("edit/{id}")
    public String update(@PathVariable Long id) {
        return "redirect:/todos";
    }

    // Delete Page
    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        System.out.println("Delete Todo List" + id);
        return "redirect:/todos";
    }
}

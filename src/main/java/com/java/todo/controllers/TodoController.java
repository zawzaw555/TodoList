package com.java.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.todo.models.Todo;
import com.java.todo.services.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {
	
	private final TodoService todoService;

    // Home All Page
    @GetMapping
    public String all(Model model){
    	
    	model.addAttribute("todoList",todoService.selectService());
    	
        return "todos/all";
    }

    @GetMapping("/add")
    public String  getAdd(Model model){
    	
    	model.addAttribute("todo",new Todo());
    	
        return "todos/add";
    }

    @PostMapping("/add")
    public String postAdd(@ModelAttribute Todo todo){
    	
    	todoService.addService(todo);
    	
        return "redirect:/todos";
    }
    
    @PostMapping("/complete/{id}")
    public String completeTodo(@PathVariable Long id) {
    	
    	todoService.completeTodo(id);
    	
    	return "redirect:/todos";
    }
    
    // Delete Page
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
    	
        todoService.deleteTodo(id);
        
        return "redirect:/todos";
    }
/*
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
	*/
    
}

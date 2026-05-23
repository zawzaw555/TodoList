package com.java.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/todos")
public class TodoController {
    // Home All Page
    @GetMapping
    public String all(){
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

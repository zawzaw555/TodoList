package com.todolist.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    // home page
    @GetMapping()
    public String home(){
        return "home";
    }
}

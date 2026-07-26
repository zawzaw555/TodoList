package com.java.todo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.todo.models.Todo;
import com.java.todo.services.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TodoRestController {
	
	private final TodoService todoService;
	
	@GetMapping("/todo/list")
	public List<Todo> getApiList() {
		return todoService.selectService();
	}
}

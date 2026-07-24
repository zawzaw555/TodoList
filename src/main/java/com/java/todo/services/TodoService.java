package com.java.todo.services;

import org.springframework.stereotype.Service;

import com.java.todo.models.Todo;
import com.java.todo.repositories.TodoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
	
	private final TodoMapper todoMapper;
	
	public void addService(Todo todo) {
		todoMapper.insertTodo(todo);
	}
}

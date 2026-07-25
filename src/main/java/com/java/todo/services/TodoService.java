package com.java.todo.services;

import java.util.List;

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
	
	public List<Todo> selectService() {
		return todoMapper.selectTodo();
	}
}

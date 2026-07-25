package com.java.todo.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.java.todo.models.Todo;

@Mapper
public interface TodoMapper{
	
	int insertTodo(Todo todo);
	
	List<Todo> selectTodo();
}

package com.java.todo.repositories;

import org.apache.ibatis.annotations.Mapper;

import com.java.todo.models.Todo;

@Mapper
public interface TodoMapper{
	int insertTodo(Todo todo);
}

package com.java.todo.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.java.todo.models.Todo;

@Mapper
public interface TodoMapper{
	
	int insertTodo(Todo todo);
	
	List<Todo> selectTodo();
	
	int updateCompleted(@Param("id") Long id);
	
	int deleteTodo(@Param("id") Long id);
}

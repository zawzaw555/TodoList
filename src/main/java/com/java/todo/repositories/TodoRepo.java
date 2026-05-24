package com.java.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.todo.models.Todo;

public interface TodoRepo extends JpaRepository<Todo,Long> {

}

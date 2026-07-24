package com.java.todo.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Todo {
	
	private Long id;
    private String title;
    private String comment;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
}

package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUser(String user);
}

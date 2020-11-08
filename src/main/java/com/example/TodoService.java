package com.example;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Greeting;
import com.example.model.Todo;
import com.example.model.User;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	public Greeting sayHello(User user) {
		Optional<Todo> todoItem = todoRepository.findById(1);
		System.out.println("todoItem : " + todoItem);
		
        return new Greeting("Hello " + user.getName() + " dbItem : " + todoItem.get().toString());
    }
	
}

package com.example;

import com.example.model.Greeting;
import com.example.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

//このクラスはこれ以上いじらない
//サービスクラス内で詳細の実装を行う
@SpringBootApplication
public class HelloFunction {
	
	@Autowired
    private TodoService todoService;
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloFunction.class, args);
    }

    @Bean
    public Function<User, Greeting> hello() {
    	return user -> todoService.sayHello(user);
    }

}

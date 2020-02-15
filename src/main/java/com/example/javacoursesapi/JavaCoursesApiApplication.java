package com.example.javacoursesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JavaCoursesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCoursesApiApplication.class, args);
	}

	@RestController
	class Controller {

		@RequestMapping("/test")
		public String hello(){
			return "Hello world!";
		}
	}


	// mistake on purpose
	public int added(int a, int b){
		return a * b;
	}
}

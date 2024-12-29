package com.example.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@GetMapping(path = "/")
	public List<String> getNames(){
		return List.of(
				"Chris",
				"Josh",
				"Jeff",
				"Jane",
				"Jenny"
		);
	}

}

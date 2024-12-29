package com.example.crud;

import com.example.crud.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@GetMapping(path = "/")
	public List<Product> getNames(){
			return  List.of(
			 new Product(
					2541L,
					"Laptop",
                     500F,
					LocalDate.of(2025, Month.MARCH,5),
					2
			)
		);
	}
}

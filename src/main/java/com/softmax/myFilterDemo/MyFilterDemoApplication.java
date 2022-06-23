package com.softmax.myFilterDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class MyFilterDemoApplication {

	@GetMapping("/")
	public String home() {
            return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyFilterDemoApplication.class, args);
	}

}




package com.example.yokospringbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; /// yoko nambahin
import org.springframework.web.bind.annotation.RestController; /// yoko nambahin

@SpringBootApplication
@RestController /// yoko nambahin
public class YokoSpringBootDockerApplication {

	@RequestMapping("/") /// yoko nambahin
  public String home() { /// yoko nambahin
    return "Hello Yoko!!"; /// yoko nambahin
  } /// yoko nambahin

	public static void main(String[] args) {
		SpringApplication.run(YokoSpringBootDockerApplication.class, args);
	}

}

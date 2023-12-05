package com.example.JFigueroaAeromexico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JFigueroaAeromexicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JFigueroaAeromexicoApplication.class, args);
	}

}

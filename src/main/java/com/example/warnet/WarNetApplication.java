package com.example.warnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@ComponentScan("com.example.warnet")
@SpringBootApplication
@EnableJpaAuditing
public class WarNetApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarNetApplication.class, args);
	}
}

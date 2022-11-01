package com.orquestrador.containerDois;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainerDoisApplication {

	@RequestMapping("/")
	public String home() {
		return "Conectado ao ContainerDois";
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainerDoisApplication.class, args);
	}

}

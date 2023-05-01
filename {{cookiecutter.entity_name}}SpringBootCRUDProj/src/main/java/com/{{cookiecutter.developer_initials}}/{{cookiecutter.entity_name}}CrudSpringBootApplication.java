package com.{{cookiecutter.developer_initials}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.entity_name}}CrudSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.entity_name}}CrudSpringBootApplication.class, args);
	}

}

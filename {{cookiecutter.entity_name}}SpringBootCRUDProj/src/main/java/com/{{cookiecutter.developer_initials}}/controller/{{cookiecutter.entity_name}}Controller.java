package com.{{cookiecutter.developer_initials}}.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.{{cookiecutter.developer_initials}}.service.{{cookiecutter.entity_name}}Service;

@Controller
public class {{cookiecutter.entity_name}}Controller {

	@Autowired
	private {{cookiecutter.entity_name}}Service service;

	
}

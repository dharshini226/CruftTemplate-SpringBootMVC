package com.{{cookiecutter.developer_initials}}.service;

import java.util.List;

import com.{{cookiecutter.developer_initials}}.entity.{{cookiecutter.entity_name}};

public interface {{cookiecutter.entity_name}}Service {

	public String save{{cookiecutter.entity_name}}({{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}});
	public {{cookiecutter.entity_name}} update{{cookiecutter.entity_name}}({{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}});
	public void delete{{cookiecutter.entity_name}}(int id);
	public {{cookiecutter.entity_name}} getOne{{cookiecutter.entity_name}}(int id);
	public List<{{cookiecutter.entity_name}}> getAll{{cookiecutter.entity_name}}s();
	
}

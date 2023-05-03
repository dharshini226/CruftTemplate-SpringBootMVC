package com.{{cookiecutter.developer_initials}}.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.{{cookiecutter.developer_initials}}.entity.{{cookiecutter.entity_name}};
import com.{{cookiecutter.developer_initials}}.repository.{{cookiecutter.entity_name}}Repository;

@Service
public class {{cookiecutter.entity_name}}ServiceImpl implements {{cookiecutter.entity_name}}Service{
	
	@Autowired
	private {{cookiecutter.entity_name}}Repository repo;

	public String save{{cookiecutter.entity_name}}({{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}) {
		return repo.save(objectOf{{cookiecutter.entity_name}})+" successfully Saved!!!";
	}

	public {{cookiecutter.entity_name}} update{{cookiecutter.entity_name}}({{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}) {
		return repo.save(objectOf{{cookiecutter.entity_name}});
	}

	public void delete{{cookiecutter.entity_name}}(int id) {
			repo.deleteById(id);
	}

	public {{cookiecutter.entity_name}} getOne{{cookiecutter.entity_name}}(int id) {
		Optional<{{cookiecutter.entity_name}}> objectOf{{cookiecutter.entity_name}}gt = repo.findById(id);
		if(objectOf{{cookiecutter.entity_name}}gt.isPresent())
		{
			return objectOf{{cookiecutter.entity_name}}gt.get();
		}
		else return null;
	} 

	public List<{{cookiecutter.entity_name}}> getAll{{cookiecutter.entity_name}}s() {
		return repo.findAll();
	}

}

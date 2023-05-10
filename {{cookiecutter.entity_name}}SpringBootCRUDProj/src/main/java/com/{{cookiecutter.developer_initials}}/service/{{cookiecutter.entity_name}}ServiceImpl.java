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

	public Integer save{{cookiecutter.entity_name}}({{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}) {
		if (!objectOfStudent.equals(null))
			if (objectOfStudent.getname() != null || objectOfStudent.getemail() != null
					|| objectOfStudent.getmarks() != null)
				return repo.save(objectOf{{cookiecutter.entity_name}}).getid();
			else
				return 0;
		else
			return 0;
	
	}

	public {{cookiecutter.entity_name}} update{{cookiecutter.entity_name}}({{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}) {
		if (!objectOfStudent.equals(null))
			if (objectOfStudent.getname() != null || objectOfStudent.getemail() != null
					|| objectOfStudent.getmarks() != null)
				return repo.save(objectOf{{cookiecutter.entity_name}});
			else
				return null;
		else
			return null;
	
	}

	public String delete{{cookiecutter.entity_name}}(int id) {
		if (repo.findById(id).isPresent()) {	
			repo.deleteById(id);
			return "Deleted";
		} else
			return "Not found";
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

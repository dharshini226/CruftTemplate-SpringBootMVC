package com.{{cookiecutter.developer_initials}}.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.{{cookiecutter.developer_initials}}.entity.{{cookiecutter.entity_name}};

public interface {{cookiecutter.entity_name}}Repository extends JpaRepository<{{cookiecutter.entity_name}},Integer> {

}

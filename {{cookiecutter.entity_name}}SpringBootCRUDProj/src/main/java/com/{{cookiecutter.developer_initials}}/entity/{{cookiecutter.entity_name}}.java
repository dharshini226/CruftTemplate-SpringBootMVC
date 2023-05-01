package com.{{cookiecutter.developer_initials}}.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "{{cookiecutter.entity_name}}_table")
public class {{cookiecutter.entity_name}} {

	@Id
	@GeneratedValue
	@Column(name = "{{cookiecutter.entity_name}}_id")
	private Integer id;
	
}

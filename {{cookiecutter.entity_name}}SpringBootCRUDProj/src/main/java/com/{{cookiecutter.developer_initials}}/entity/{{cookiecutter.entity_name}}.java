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

	@Column
	private {{cookiecutter.data_type_attribute1}} {{cookiecutter.attribute1}};

	@Column
	private {{cookiecutter.data_type_attribute2}} {{cookiecutter.attribute2}};

	@Column
	private {{cookiecutter.data_type_attribute3}} {{cookiecutter.attribute3}};

	public {{cookiecutter.entity_name}}() {

	}

	public {{cookiecutter.entity_name}}(Integer id, {{cookiecutter.data_type_attribute1}} {{cookiecutter.attribute1}}, {{cookiecutter.data_type_attribute2}} {{cookiecutter.attribute2}}, {{cookiecutter.data_type_attribute3}} {{cookiecutter.attribute3}}) {
		this.id = id;
		this.{{cookiecutter.attribute1}} = {{cookiecutter.attribute1}};
		this.{{cookiecutter.attribute2}} = {{cookiecutter.attribute2}};
		this.{{cookiecutter.attribute3}} = {{cookiecutter.attribute3}};
	}

	public Integer getid() {
		return id;
	}

	public void setEmpId(Integer id) {
		this.id = id;
	}

	public {{cookiecutter.data_type_attribute1}} get{{cookiecutter.attribute1}}() {
		return {{cookiecutter.attribute1}};
	}

	public void set{{cookiecutter.attribute1}}({{cookiecutter.data_type_attribute1}} {{cookiecutter.attribute1}}) {
		this.{{cookiecutter.attribute1}} = {{cookiecutter.attribute1}};
	}

	public {{cookiecutter.data_type_attribute2}} get{{cookiecutter.attribute2}}() {
		return {{cookiecutter.attribute2}};
	}

	public void set{{cookiecutter.attribute2}}({{cookiecutter.data_type_attribute2}} {{cookiecutter.attribute2}}) {
		this.{{cookiecutter.attribute2}} = {{cookiecutter.attribute2}};
	}

	public {{cookiecutter.data_type_attribute3}} get{{cookiecutter.attribute3}}() {
		return {{cookiecutter.attribute3}};
	}

	public void set{{cookiecutter.attribute3}}({{cookiecutter.data_type_attribute3}} {{cookiecutter.attribute3}}) {
		this.{{cookiecutter.attribute3}} = {{cookiecutter.attribute3}};
	}

}

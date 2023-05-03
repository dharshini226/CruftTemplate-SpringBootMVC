package com.{{cookiecutter.developer_initials}}.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.{{cookiecutter.developer_initials}}.entity.{{cookiecutter.entity_name}};
import com.{{cookiecutter.developer_initials}}.service.{{cookiecutter.entity_name}}Service;

@Controller
public class {{cookiecutter.entity_name}}Controller {

	@Autowired
	private {{cookiecutter.entity_name}}Service service;

	// show welcome page
		@GetMapping("/")
		public String showWelcome() {
			return "welcome";
		}
	
	// show register page
	@GetMapping("/reg")
	public String showReg(Model map) {
		// form baking object
		map.addAttribute("employee", new {{cookiecutter.entity_name}}());
		return "register";
	}

	// save objectOf{{cookiecutter.entity_name}}
	@PostMapping("/save")
	public String save{{cookiecutter.entity_name}}({{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}, Model map) {
		Integer id = service.save{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}});
		map.addAttribute("msg", "objectOf{{cookiecutter.entity_name}}" + id + "added successfully");

		// clear form baking object
		map.addAttribute("employee", new {{cookiecutter.entity_name}}());

		return "register";
	}

	// get all objectOf{{cookiecutter.entity_name}}
	@GetMapping("/all")
	public String showEmployee(Model map) {
		List<{{cookiecutter.entity_name}}> list = service.getAll{{cookiecutter.entity_name}}s();
		map.addAttribute("list", list);
		return "data";
	}

	// getOne objectOf{{cookiecutter.entity_name}} for view page
	@GetMapping("/view")
	public String getOne{{cookiecutter.entity_name}}(@RequestParam int id, Model map) {
		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}gt = service.getOne{{cookiecutter.entity_name}}(id);
		if (objectOf{{cookiecutter.entity_name}}gt != null) {
			map.addAttribute("emp", objectOf{{cookiecutter.entity_name}}gt);
		} else {
			map.addAttribute("msg", "No {{cookiecutter.entity_name}} Found");
		}

		return "view";
	}

	// delete objectOf{{cookiecutter.entity_name}}
	@GetMapping("/delete")
	public String delete{{cookiecutter.entity_name}}(@RequestParam Integer id, Model map) {
		service.delete{{cookiecutter.entity_name}}(id);
		map.addAttribute("msg", "{{cookiecutter.entity_name}} deleted Successfully");
		return "redirect:all";
	}

	// get Update objectOf{{cookiecutter.entity_name}}
	@GetMapping("/getUpdate")
	public String getUpdate{{cookiecutter.entity_name}}Page(@RequestParam Integer id, Model map) {
		map.addAttribute("employee", service.getOne{{cookiecutter.entity_name}}(int id));
		map.addAttribute("mode", "edit");
		return "register";
	}

	// update objectOf{{cookiecutter.entity_name}}
	@PutMapping("/update")
	public String update{{cookiecutter.entity_name}}(@ModelAttribute {{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}upP, Model map) {
		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}upA = service.update{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}}upP);
		map.addAttribute("msg", "{{cookiecutter.entity_name}} updated successfully");

		// clear form baking object 
		map.addAttribute("employee",new {{cookiecutter.entity_name}}());
		return "redirect:view?id=" + objectOf{{cookiecutter.entity_name}}upA.getid();
	}
	
}

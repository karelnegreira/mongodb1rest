package com.karelcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karelcode.model.Persona;
import com.karelcode.repository.PersonaRepository;
import com.karelcode.service.PersonaService;

@RestController
public class PersonController {
@Autowired
PersonaRepository personaRepository;
@Autowired
PersonaService personaService;
@RequestMapping("/create")
public String create(@RequestParam String id, @RequestParam String name, @RequestParam String location) {
Persona p = personaService.create(id, name, location);
return p.toString();
}
@RequestMapping("/get")
public Persona getPersona(@RequestParam String name) {
	return personaService.getByName(name);
}
@RequestMapping("/getAll")
public List<Persona>getAll(){
	return personaService.getAll();
}
@RequestMapping("/update")
public String update(@RequestParam String id, @RequestParam String name, @RequestParam String location) {
	Persona p = personaService.update(id, name, location);
	return p.toString();
}
@RequestMapping("/delete")
public String delete(@RequestParam String name) {
	personaService.delete(name);
	return "deleted" + name;
}

@RequestMapping("/deleteAll")
public String delete() {
	personaService.deleteAll();
	return "All deleted";
}


}

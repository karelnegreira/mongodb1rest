package com.karelcode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karelcode.model.Persona;
import com.karelcode.repository.PersonaRepository;

@Service
public class PersonaService {
@Autowired
private PersonaRepository personaRepository;

public Persona create(String id, String name, String location) {
return personaRepository.save(new Persona(id, name, location));
}
public List<Persona>getAll(){
	return personaRepository.findAll();
}
public Persona getByName(String name){
	return (Persona) personaRepository.findByName(name);
}
//update methods
public Persona update(String id, String name, String location) {
	Persona p = (Persona) personaRepository.findByName(name);
	p.setName(name);
	p.setLocation(location);
	return personaRepository.save(p);
	
}
//delete
public void deleteAll() {
	personaRepository.deleteAll();
}
//delete by name 
public void delete(String name) {
	Persona p =  (Persona) personaRepository.findByName(name);
	personaRepository.delete(p);
}
}

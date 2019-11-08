package com.karelcode.repository;

import java.awt.List;

//import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.karelcode.model.Persona;
@Repository
public interface PersonaRepository extends MongoRepository<Persona, Integer>{
public Persona findByName(String name);
public java.util.List<Persona> findByLocation(String location);

}

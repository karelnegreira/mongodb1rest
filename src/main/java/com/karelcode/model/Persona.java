package com.karelcode.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Persona {
@Id
private String id;
private String name;
private String location;

public Persona(String id, String name, String location) {
	this.id = id;
	this.name = name;
	this.location = location;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Persona [id=" + id + ", name=" + name + ", location=" + location + "]";
}



}

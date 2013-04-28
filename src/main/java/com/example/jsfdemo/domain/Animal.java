package com.example.jsfdemo.domain;

//import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Animal {
	
	private int id;
	private String name = "unknown";
	private String species = "";
	private Person owner;
	
	@Size(min = 2, max = 20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
			
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

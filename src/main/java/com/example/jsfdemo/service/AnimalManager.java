package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Animal;

@ApplicationScoped
public class AnimalManager {
	private List<Animal> dba = new ArrayList<Animal>();
	
	private static int size=0;
	
	public void addAnimal(Animal animal) {
		
		Animal a = get(animal.getId());
		if(a==null){
			Animal newAnimal = new Animal();
			AnimalManager.size++;
			setAnimal(newAnimal,animal);
			newAnimal.setId(AnimalManager.size);
			
			dba.add(newAnimal);
		}else
		{
			setAnimal(a, animal);
		}
	}
	
	
	public Animal get(int id)
	{
		for(Animal a: dba)
		{
			if(a.getId()==id)
				return a;
		}
		return null;
	}
	
	// Removes the animal with given PIN
	public void deleteAnimal(Animal animal) {
		Animal animalToRemove = null;
		for (Animal a : dba) {
			if (animal.getId()==a.getId()) {
				animalToRemove = a;
				break;
			}
		}
		if (animalToRemove != null)
			dba.remove(animalToRemove);
	}

	public List<Animal> getAllAnimals() {
		return dba;
	}
	

	private void setAnimal(Animal a, Animal animal)
	{
		a.setName(animal.getName());
		a.setSpecies(animal.getSpecies());
		a.setOwner(animal.getOwner());
	}
}

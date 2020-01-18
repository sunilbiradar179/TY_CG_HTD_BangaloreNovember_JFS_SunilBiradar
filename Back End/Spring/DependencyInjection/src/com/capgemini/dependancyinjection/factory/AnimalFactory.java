package com.capgemini.dependancyinjection.factory;

import com.capgemini.dependancyinjection.dao.Animal;
import com.capgemini.dependancyinjection.dao.Dog;

public class AnimalFactory {
	
	private AnimalFactory()
	{
		
	}
	
	
	public static Animal getAnimal()
	{
		return new Dog();
	}
}

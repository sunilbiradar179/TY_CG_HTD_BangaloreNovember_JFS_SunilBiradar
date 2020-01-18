package com.capgemini.dependencyinjection;

import com.capgemini.dependancyinjection.dao.Animal;
import com.capgemini.dependancyinjection.factory.AnimalFactory;

public class App {
	public static void main(String[] args) {
		Animal animal=AnimalFactory.getAnimal();
		animal.makeSound();
	}
}

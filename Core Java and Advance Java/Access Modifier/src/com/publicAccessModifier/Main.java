package com.publicAccessModifier;

public class Main {
	public static void main(String[] args) {
		// accessing the public class
		Animal animal = new Animal();
		// accessing the public variable
		animal.legCount = 4;
		// accessing the public method
		animal.display();
	}
}
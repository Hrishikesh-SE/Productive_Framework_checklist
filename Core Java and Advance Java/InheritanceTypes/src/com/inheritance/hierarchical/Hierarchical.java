package com.inheritance.hierarchical;

class Animal {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking...");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("Meowing...");
	}
}

public class Hierarchical {
	public static void main(String args[]) {
		System.out.println("Cat:");
		Cat c = new Cat();
		c.meow();
		c.eat();
		// c.bark(); // Error
		System.out.println("\nDog:");
		Dog d = new Dog();
		d.bark();
		d.eat();
		// d.meow(); // Error
	}
}

package com.protectedAccessModifier;

class Animal {
	// protected method
	protected void display() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		// access protected method
		dog.display();
	}
}
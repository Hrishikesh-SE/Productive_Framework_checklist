package com.java;

public class ConstructorTypes {
	private int a, b;

	// Default Constructor
	public ConstructorTypes() {
		super();
		a = 3;
		b = 5;
		System.out.println("Default Constructor\n" + a + " + " + b + "i");
	}

	// Parameterized Constructor
	public ConstructorTypes(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Parameterized Constructor\n" + a + " + " + b + "i");
	}

	public ConstructorTypes(ConstructorTypes c) {
		int a = c.a;
		int b = c.b;
		System.out.println("Copy Constructor\n" + a + " + " + b + "i");
	}

	public static void main(String[] args) {
		ConstructorTypes c1 = new ConstructorTypes();
		ConstructorTypes c2 = new ConstructorTypes(9, 6);
		ConstructorTypes c3 = new ConstructorTypes(c1);
	}
}

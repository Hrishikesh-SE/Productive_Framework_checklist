package com.java;

public class Main {
	static int a = 7;

	static void func(int b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) {
		func(9);
	}
}

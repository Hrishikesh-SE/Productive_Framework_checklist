package com.java;

public class Addition {
	public static int add(int a, int b) {
		return (a + b);
	}

	public static int add(int a, int b, int c) {
		return (a + b + c);
	}

	public static void main(String[] args) {
		System.out.println("4 + 7 = " + add(4, 7));
		System.out.println("7 + 2 + 8 = " + add(7, 2, 8));
	}
}

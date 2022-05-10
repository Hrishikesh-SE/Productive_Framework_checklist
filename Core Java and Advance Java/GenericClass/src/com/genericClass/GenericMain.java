package com.genericClass;

public class GenericMain {
	public static void main(String args[]) {
		MyGen<Integer> m = new MyGen<Integer>();
		m.add(2);
		// m.add("Hrishikesh");//Compile time error
		System.out.println(m.get());
	}
}

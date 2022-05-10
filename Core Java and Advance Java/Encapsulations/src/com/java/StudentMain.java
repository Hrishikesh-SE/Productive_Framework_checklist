package com.java;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Hrishikesh");
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Vinay");
		System.out.println("Student 1 details:\nId: " + s1.getId() + "\nName: " + s1.getName());
		System.out.println("Student 2 details:\nId: " + s2.getId() + "\nName: " + s2.getName());
	}
}

package operations;

import java.util.Scanner;

public class Operations {
	Scanner sc = new Scanner(System.in);
	double a, b, c;

	public void input() {
		System.out.print("Enter First number: ");
		a = sc.nextDouble();
		System.out.print("Enter Second number: ");
		b = sc.nextDouble();
	}

	public void add() {
		c = a + b;
		System.out.println("Addition = " + c);
	}

	public void sub() {
		c = a - b;
		System.out.println("Substraction = " + c);
	}

	public void div() {
		try {
			c = a / b;
			System.out.println("Division = " + c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void mul() {
		c = a * b;
		System.out.println("Multiplication = " + c);
	}
}

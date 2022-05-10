package calculator;

import java.util.Scanner;

import operations.Operations;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations o = new Operations();
		while (true) {
			System.out.print("1. Addition\n2. Substraction\n3. Division\n4. Multiplication\n5. Exit\nEnter Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				o.input();
				o.add();
				break;
			case 2:
				o.input();
				o.sub();
				break;
			case 3:
				o.input();
				o.div();
				break;
			case 4:
				o.input();
				o.mul();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Please enter correct value.");
				break;
			}
			sc.close();
		}
	}
}

package com.nsCorps.calculater;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long a, b, c, select;
		while (true) {
			System.out.println("Enter Two Numbers");
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiply");
			System.out.println("Press 4 for Divide");
			select = scanner.nextInt();
			while (select > 4) {
				System.out.println("Option is not Valid");
				select = scanner.nextInt();
			}
			Calculator calculator = new Calculator();
			if (select == 1) {
				c = calculator.add(a, b);
				System.out.println("Ans is :" + c);
			} else if (select == 2) {
				c = calculator.sub(a, b);
				System.out.println("Ans is :" + c);
			} else if (select == 3) {
				calculator.multi(a, b);
			} else if (select == 4) {
				calculator.div(a, b);
			}
		}

	}

}

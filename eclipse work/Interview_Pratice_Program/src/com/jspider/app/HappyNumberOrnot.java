package com.jspider.app;

import java.util.Scanner;

public class HappyNumberOrnot {

	public static boolean happy(int n) {
		if (n == 1) {
			return true;
		}

		if (n == 7) {
			return true;
		}

		int d1 = n / 10;
		int d2 = n % 10;
		int sum = 0;
		sum = (d1 * d1) + (d2 * d2);
		return happy(sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Plz");
		int n = sc.nextInt();
		boolean result = happy(n);
		if (result) {
			System.out.println("this is happy number");
		} else {
			System.out.println("this is not happy number");
		}
		sc.close();

	}

}

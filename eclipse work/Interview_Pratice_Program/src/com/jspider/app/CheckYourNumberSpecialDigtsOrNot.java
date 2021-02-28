package com.jspider.app;

import java.util.Scanner;

public class CheckYourNumberSpecialDigtsOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int d1 = n / 10;
		int d2 = n % 10;
		int sum = (d1 + d2) + (d1 * d2);

		if (sum == n) {
			System.out.println("its is the Special Digts");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}

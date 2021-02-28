package com.jspider.app;

import java.util.Scanner;

public class CountHowManyDightsinnumber {

	public static int howmanydights(int n) {
		int count = 0;
		do {
			count++;
			n = n / 10;
			System.out.println(n);
		} while (n != 0);
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int result = howmanydights(n);
		System.out.println(result);
		sc.close();

	}

}

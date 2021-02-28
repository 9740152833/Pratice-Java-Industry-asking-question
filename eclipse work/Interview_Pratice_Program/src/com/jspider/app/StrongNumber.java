package com.jspider.app;

import java.util.Scanner;

public class StrongNumber {

	public static int factorial(int n) {
		int f = 1;
		while (n >= 1) {
			f = f * n;
			n--;
		}
		return f;
	}

	public static int StrongNumber1(int n) {
		int sum = 0;
		while (n != 0) {
			int d1 = n % 10;
			sum = sum + factorial(d1);
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int result = StrongNumber1(n);
		if (result == n) {
			System.out.println("Your Number is Strong Number");
		} else {
			System.out.println("Your Number is not Strong Number");
		}

		sc.close();

	}

}

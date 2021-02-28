package com.jspider.app;

import java.util.Scanner;

public class Pailndrome {

	public static boolean pailndrome(int n) {
		return n == reverse(n);
	}

	public static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}

		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean result = pailndrome(n);
		if (result) {
			System.out.println("Is paildrome");
		} else {
			System.out.println("Is not Paildrome");
		}
		sc.close();

	}

}

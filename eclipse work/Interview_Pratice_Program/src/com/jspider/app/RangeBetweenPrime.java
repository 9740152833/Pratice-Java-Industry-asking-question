package com.jspider.app;

import java.util.Scanner;

public class RangeBetweenPrime {

	public static int count = 0;

	public static boolean isprime(int n) {
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0) {
				return false;
			}
			i++;

		}
		return true;

	}

	public static void primerane(int n) {
		for (int i = 1; i <= n; i++) {
			boolean result = isprime(i);

			if (result) {
				System.out.println(i);
				count++;
			}

		}

		System.out.println("Count  between  prime range " + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		primerane(n);
		sc.close();

	}

}

package com.jspider.app;

import java.util.Scanner;

public class PrimeNumber {

	

	public static boolean CheckPrime(int numbertoCheck) {
		int remainder;

		for (int i = 2; i <= numbertoCheck / 2; i++) {
			remainder = numbertoCheck % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean isprime = true;

		String primeNumbersFound = "";

		for (int i = 1; i <= n; i++) {
			isprime = CheckPrime(i);
			if (isprime) {
				primeNumbersFound = primeNumbersFound + i + "  ";
			}

		}

		System.out.println(primeNumbersFound);

		

		sc.close();

	}

}

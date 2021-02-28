package com.jspider.app;

import java.util.Scanner;

public class NewPrimeOrNot {
	static int arr[] = new int[100];
	static int arr1[] = new int[100];

	public static boolean isprime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void OneToHundred(int n) {
		arr[0] = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				arr1[i] = i;
			} else {
				arr[i] = i;
			}
		}

	}

	public static void displayPrime(int[] n) {
		for (int i : n) {
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number");
		int n = sc.nextInt();
		boolean result = isprime(n);
		System.out.println(result);
		if (result) {
			System.out.println("Is prime ");
		} else {
			System.out.println("Not prime");
		}

		OneToHundred(n);
		displayPrime(arr);

		sc.close();

	}

}

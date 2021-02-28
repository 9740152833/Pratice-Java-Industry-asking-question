package com.jspider.app;

import java.util.Scanner;

public class CheckYourNumberPerfectOrNot {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 1; i < num; i++) {

			int temp = 0;
			temp = num % i;

			if (temp == 0) {
				arr[i] = i;
			}
		}
		int sum = 0;

		for (int i : arr) {

			sum = sum + i;

		}
		if (sum == num) {
			System.out.println("Your number is Perfect number");
		} else {
			System.out.println("Your number is not Perfect number");
		}

		sc.close();
	}

}

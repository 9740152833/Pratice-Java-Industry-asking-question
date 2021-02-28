package com.jspider.app;

import java.util.Scanner;

public class SumofNnumber {
	public static int sumofnumber(int n) {
		int sum = 0;
		if (n != 0) {
			sum = n * (n + 1) / 2;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();

		int result = sumofnumber(num);
		System.out.println(result);
		sc.close();

	}

}

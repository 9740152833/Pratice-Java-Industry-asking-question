package com.jspider.app;

import java.util.Scanner;

public class DesriNumberOrNot {

	public static int DesriNumberOrNot1(String nu) {

		double sum = 0;
		int len = nu.length();
		int j = len;
		int n = Integer.parseInt(nu);
		int result = 0;

		while (n != 0) {
			int d1 = n % 10;
			sum = sum + (Math.pow(d1, j));
			n = n / 10;
			j--;

		}
		result = (int) sum;
		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number" );
		String number = sc.next();
		int result = DesriNumberOrNot1(number);
		int r = Integer.parseInt(number);
		if (result == r) {
			System.out.println("Your number is DesriNumber");
		} else {
			System.out.println("Not DesriNumber");
		}

		sc.close();

	}

}

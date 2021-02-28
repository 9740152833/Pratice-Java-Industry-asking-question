package com.jspider.app;

import java.util.Scanner;

public class AramStrongNumerOrNot {

	public static int AramStrongOrNOt(String nu) {
		double sum = 0;
		int result = 0;
		int len = nu.length();
		int n = Integer.parseInt(nu);
		while (n != 0) {
			int d1 = n % 10;
			sum = sum + (Math.pow(d1, len));
			n = n / 10;

		}
		result = (int) sum;
		return result;

	}

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Checking");
		String number = sc.next();

		int result = AramStrongOrNOt(number);
		int cmp = Integer.parseInt(number);
		if (result == cmp) {
			System.out.println("Your Number is Aram Strong Number");

		} else {
			System.out.println("Sorry Your Number is not Aram Strong Number");
		}
		sc.close();

	}

}

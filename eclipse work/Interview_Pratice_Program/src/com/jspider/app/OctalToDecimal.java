package com.jspider.app;

import java.util.Scanner;

public class OctalToDecimal {

	public static int OctalToDecimalConvert(int n) {
		int j = 0;
		double sum = 0;
		int result = 0;

		while (n != 0) {
			int d1 = n % 10;
			sum = sum + (d1 * Math.pow(8, j));
			n = n / 10;
			j++;

		}
		result = (int) sum;
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal Number ");
		int n = sc.nextInt();
		int result = OctalToDecimalConvert(n);
		System.out.println("Octal TO Decimal Convertion is " + result);

		sc.close();

	}

}

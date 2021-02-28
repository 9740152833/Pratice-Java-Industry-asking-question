package com.jspider.app;

public class GenerateAramStrongNumber {

	public static int generateAramStrongnumberUptoN(String nu) {
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

		for (int i = 1; i <= 100; i++) {
			String number = Integer.toString(i);
			int result = generateAramStrongnumberUptoN(number);
			if (result == i) {
				System.out.println(i);
			} 
		}

	}

}

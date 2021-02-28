package com.jspider.app;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 1, 1, 1, 1 };
		int j = 0;
		double sum = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			sum = sum + (arr[i] * Math.pow(2, j));
			j++;

		}

		System.out.println("Binary To decimal Number is" + Math.round(sum));

	}

}

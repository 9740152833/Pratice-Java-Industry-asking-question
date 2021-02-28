package com.jspider.app;

public class DecimalToBinary {

	public static String DecimalToBinary1(int dec) {
		String bin = "";
		while (dec != 0) {
			int r = dec % 2;
			bin = bin + r;
			System.out.println(bin);
			dec = dec / 2;
		}
		return bin;
	}

	public static void main(String[] args) {

		int n = 25;
		String result = DecimalToBinary1(n);
		System.out.println(result);

	}

}

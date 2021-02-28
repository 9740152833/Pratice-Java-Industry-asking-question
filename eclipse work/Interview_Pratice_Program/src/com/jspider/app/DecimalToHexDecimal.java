package com.jspider.app;

public class DecimalToHexDecimal {

	public static String DecimalToHexDecimal1(int dec) {
		String hex = "";
		while (dec != 0) {
			int r = dec % 16;
			if (r <= 10) {
				hex = hex + r;
				System.out.println(hex);
			} else {
				hex = ((char) (r + 55) + hex);
				System.out.println(hex);
			}

			dec = dec / 16;
		}
		return hex;
	}

	public static void main(String[] args) {
		int n = 59;
		String result = DecimalToHexDecimal1(n);
		System.out.println(result);

	}

}

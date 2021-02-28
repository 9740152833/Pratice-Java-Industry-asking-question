package com.jspider.app;

public class DecimalToOctal {

	public static String DecimalToOctal1(int dec) {
		String oct = "";
		while (dec != 0) {
			int r = dec % 8;
			oct = oct + r;
			System.out.println(oct);
			dec = dec / 8;
		}
		return oct;
	}

	public static void main(String[] args) {

		int n = 78;
		String result = DecimalToOctal1(n);
		System.out.println(result);

	}

}

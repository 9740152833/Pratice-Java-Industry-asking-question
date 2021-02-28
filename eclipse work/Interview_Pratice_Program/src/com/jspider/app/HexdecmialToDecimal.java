package com.jspider.app;

public class HexdecmialToDecimal {

	public static int HexDecimalToDecimal(String n) {
		double sum = 0;
		int c = 0;

		for (int i = n.length() - 1; i >= 0; i--) {
			char ch = n.charAt(i);
			int no = 0;
			if (ch > 'A' && ch < 'F') {
				no = ch - 55;
			} else if (ch > 'a' && ch < 'f') {
				no = ch - 87;
			} else {
				no = ch - 48;
			}

			sum = sum + (no * Math.pow(16, c));
			c++;

		}

		int result = (int) sum;
		return result;
	}

	public static void main(String[] args) {
		int result = HexDecimalToDecimal("7DE");
		System.out.println(result);

	}

}

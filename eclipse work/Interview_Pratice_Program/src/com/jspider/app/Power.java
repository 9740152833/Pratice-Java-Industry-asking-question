package com.jspider.app;

public class Power {

	public static int pow(int x, int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * x;
		}

		return res;
	}

	public static void main(String[] args) {
		int res = 5;

		if (res < 0) {
			System.out.println("hi");
		}

	}

}

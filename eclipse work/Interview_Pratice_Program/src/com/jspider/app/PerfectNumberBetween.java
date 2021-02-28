package com.jspider.app;

public class PerfectNumberBetween {

	public static boolean isprefct(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;

		}
		return sum == n;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			boolean rs = isprefct(i);
			if (rs) {
				System.out.println(i);
			}
		}

	}

}

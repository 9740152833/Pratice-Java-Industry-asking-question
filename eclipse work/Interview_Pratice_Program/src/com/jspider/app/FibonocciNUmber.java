package com.jspider.app;

import java.util.Scanner;

public class FibonocciNUmber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Series To genearate Fibonic number");
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				arr[i] = i;

			} else if (i == 1) {
				arr[i] = i;
			} else {
				sum = arr[i - 1] + arr[i - 2];
				arr[i] = sum;

			}
		}

		for (int i : arr) {
			System.out.println(i);

		}
		sc.close();

	}

}

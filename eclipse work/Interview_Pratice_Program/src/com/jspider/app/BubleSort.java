package com.jspider.app;

import java.util.Scanner;

public class BubleSort {

	public static void swap(int arr[], int i, int j) {
		if (i == j) {
			return;

		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arry");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int lastunortedindex = arr.length - 1; lastunortedindex > 0; lastunortedindex--) {
			for (int i = 0; i < lastunortedindex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}

		}

		System.out.println("---------------------------------------------------------");

		for (int i : arr) {
			System.out.println(i);
		}

		sc.close();

	}

}

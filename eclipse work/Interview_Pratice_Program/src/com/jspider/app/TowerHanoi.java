package com.jspider.app;

import java.util.Scanner;

public class TowerHanoi {

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
		System.out.println("Enter the elements ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		for (int lastunortedindex = arr.length - 1; lastunortedindex > 0; lastunortedindex--) {
			for (int i = 0; i < lastunortedindex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}

		int temp[] = new int[n];
		int denstion[] = new int[n];

		for (int i : arr) {
			System.out.println(i);

		}
		System.out.println("--------------------------------------------------");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);
			temp[i] = arr[i];
			System.out.println("Transfer the disc source to demp " + arr[i]);

			denstion[i] = arr[i];
			System.out.println("Transfer the disc temp to destion " + denstion[i]);
			temp[i] = 0;

		}

		System.out.println("-----------------------------------------------------------------");
		System.out.println("after the transfter the disk a source to denstion the desntion disk elements");

		for (int i : denstion) {
			System.out.println(i);
		}

		sc.close();

	}

}

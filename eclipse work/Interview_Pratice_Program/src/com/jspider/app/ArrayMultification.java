package com.jspider.app;

import java.util.Scanner;

public class ArrayMultification {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the rows");
		int r = sc.nextInt();
		System.out.println("Enter the number of the columns");
		int c = sc.nextInt();
		int arr[][]= new int[r][c];
		
		int arr1[][ ] = new int[r][c];
		
		arr1[0][0]=2;
		arr1[0][1]=4;
		arr1[1][0]=3;
		arr1[1][1]=4;
		
		System.out.println("Enter the elements ");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				System.out.print(arr[i][j]*arr1[i][j]+ " ");
				
				
			}
			System.out.print("\n");
			
			
		}
		sc.close();
		
	}

}

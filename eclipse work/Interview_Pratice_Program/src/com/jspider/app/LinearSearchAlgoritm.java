package com.jspider.app;

import java.util.Scanner;

public class LinearSearchAlgoritm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter key for serching element");
		int key = sc.nextInt();
		boolean istrue=false;
		int index = 0;
		int value = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				istrue=true;
				index=i;
				value = arr[i];
				break;
				
			}
		}
		
		if(istrue) {
		System.out.println("key is present index of "+ index +"-> "+ value);
		}else {
			System.out.println("Key is not presnt in this array continer");
		}
		
		
		sc.close();
	}

}

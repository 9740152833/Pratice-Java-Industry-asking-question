package com.jspider.app;

import java.util.Scanner;

public class PrimeorNot {
	
	public static boolean isprome(int n) {
		int i =2;
		while(i<=n/2) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean result = isprome(n);
		if(result) {
			System.out.println("Is prime ");
		}else {
			System.out.println("is not prime");
		}
		
		sc.close();
		
		

		

}
}

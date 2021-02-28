package com.jspider.app;

import java.util.Scanner;

public class FactorialNumber {
	
	public static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Computing Factorial Number");
		int n = sc.nextInt();
		int result=factorial(n);
		System.out.println(result);
		sc.close();
		
	}
	


}

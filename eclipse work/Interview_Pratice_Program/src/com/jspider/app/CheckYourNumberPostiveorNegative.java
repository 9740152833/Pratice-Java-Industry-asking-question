package com.jspider.app;

import java.util.Scanner;

public class CheckYourNumberPostiveorNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("its postive number");
		}else {
			System.out.println("its negative number");
		}
		
		sc.close();

	}

}

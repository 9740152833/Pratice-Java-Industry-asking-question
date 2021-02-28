package com.jspider.app;

import java.util.Scanner;

public class BasedOnAgeGiveDiffrentMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age ");
		int age = sc.nextInt();

		if (age < 16) {
			System.out.println("You cant drive");
		} else if (age >= 16 && age <= 17) {
			System.out.println("you can drive but not vote");
		} else if (age >= 18 && age <= 24) {
			System.out.println("You can vote but not rent  a car");
		} else {
			System.out.println("You can do anyting");
		}

		sc.close();

	}

}

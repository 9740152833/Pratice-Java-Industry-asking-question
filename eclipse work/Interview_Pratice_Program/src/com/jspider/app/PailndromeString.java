package com.jspider.app;

import java.util.Scanner;

public class PailndromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Stringn");
		String n = sc.next();
		String bin = "";
		for (int i = n.length() - 1; i >= 0; i--) {
			char c = n.charAt(i);
			bin = bin + c;

		}
		if(n.equals(bin)) {
			System.out.println("its paindrome");
		}else {
			System.out.println("its not palindrome");
		}
		sc.close();
	}

}

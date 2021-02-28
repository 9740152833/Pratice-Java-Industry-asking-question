package com.jspider.app;

public class GCDnumber {
	
	public int gcd(int m ,int n) {
		
		int r;
		
		while(n!=0) {
			r=m%n;
			System.out.println("hi"+  r);
			m=n;
			n=r;
		}
		return m;
	}

	public static void main(String[] args) {
		
		GCDnumber g= new GCDnumber();
		
		int result=g.gcd(8, 20);
		System.out.println(result);
		
	}

}

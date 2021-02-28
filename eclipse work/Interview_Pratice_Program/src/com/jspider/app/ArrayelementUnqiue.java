package com.jspider.app;

public class ArrayelementUnqiue {

	public static void main(String[] args) {
		int arr[] =new int[5];
		arr[0]=2;
		arr[1]=3;
		arr[2]=1;
		arr[3]=4;
		arr[4]=10;
		
		
	boolean unique=false;
	for(int i=0;i<=arr.length-1;i++) {	
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println("reapted array element is"+" "+ arr[j]);
			unique = true;
			break;
		}
		
	}
		
	}
	if(unique==true) {
		System.out.println("not unique number");
	}else {
		System.out.println("unique number");
	}
		
	

}
}


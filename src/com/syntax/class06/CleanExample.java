package com.syntax.class06;

public class CleanExample {

	public static void main(String[] args) {
		
		
		/* find out the largest number out of the three given numbers and then
		 * define whether largest number is equal or odd
		 */
		
		
		
		int num1=10;
		int num2=20;
		int num3=30;
		
		int largest = 0;
		
		if (num1>num2 && num1>num3) {
			largest=num1;
		} else if (num2>num1 && num2>num3) {
			largest=num2;
		} else if (num3>num1 && num3>num2) {
			largest=num3;
		}
		System.out.println(largest);
		
		if(largest%2==0) {
			System.out.println(largest+" is even number");
		} else {
			System.out.println(largest+" is odd number");
		}

		
	}

}

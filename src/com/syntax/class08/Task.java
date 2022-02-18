package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		/* Find out the sum of all even and all odd numbers from 1 to 50
		 * 
		 */
		
		int sum=0;
		
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
			sum=sum+i;
			}
			  
		}
		System.out.println(sum);
		int odd=0;
		
		for(int i=1; i<=50; i++) {
			if(i%2!=0) {
			odd=odd+i;
			}
			  
		}
		System.out.println(odd);
		
		System.out.println("another way");
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=1; i<=50; i++) {
			if(i%2!=0) {
				sumOdd=sumOdd+i;
			} else {
				sumEven=sumEven+i;
			}
			
		}
		System.out.println("Sum of all even numbers is "+sumEven+" and sum of all odd is "+sumOdd);
	}
	
	

}

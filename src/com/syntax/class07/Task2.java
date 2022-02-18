package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		/* Print numbers from 1 to 100 in 1 line with space
		 * 
		 */
		
		int a=1;
		while (a<=100) {
			if (a%2==1) {
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.println(" ");
		
		/*Print numbers from 100 to 1
		 * 
		 */
		
		int b=100;
		while (b>0) {
			System.out.print(b+" ");
			b--;
		}
		
		System.out.println(" ");
		
		//Print even numbers from 20 to 100 
		
		int c=20;
		while (c<=100) {
			System.out.print(c+" ");
			c+=2;
		}
		
		System.out.println(" ");
		// Print only odd numbers from 100 to 1

		int d=100;
		while (d>=1) {
			if (d%2!=0 ) {  
			System.out.print(d+" ");
			}
		d--;
			
			
		
		}
		
		
	}

}

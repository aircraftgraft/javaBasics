package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		//task
		System.out.println(" PRINT ONLY EVEN NUMBERS FROM 1 TO 30 ");
		
		int d=2;
		
		while (d<=30) {
			System.out.print(d+" ");
		d+=2;
		}
		System.out.println("another way");
		
		int e=1;
		
		while (e<=30) {
			if (e%2==0) {
			System.out.print(e+ " ");
	/* e++;
	 * } else {
	 * e++;}
	 */
			}
			e++;
		}
		
	}
	
	
}

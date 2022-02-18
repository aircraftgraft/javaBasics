package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=1; i<=7; i++) {
			
			if(i==3) {
				continue; //skip current iteration/cycle
			}
			System.out.println("Hello "+i);
			System.out.println("We are batch 12 "+i);
		}
		
		//I want to print all the numbers from 1 to 10 except 4
		
		for(int i=1; i<=10; i++) {
			
			if(i==4 || i==7) {
				continue;
			}
			System.out.print(i+ " ");
		}
		
	}

}

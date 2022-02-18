package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		
		
		System.out.println("WHILE CHECK CONDITION BEFORE EXECUTION");
		int num=1;
		
		do {//less used than while loop
			System.out.println("Hello");
			num++;
		} while (num<=3);
		
		System.out.println("I want to print numbers from 1 to 30 using do while loop");
		
		int a=1;
		do {
			System.out.print(a+" ");
			a++;
		} while (a<=30);
	}

}

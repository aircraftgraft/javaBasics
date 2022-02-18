package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		
		//next vs. nextLine
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter temperature");
		
		int temp=scan.nextInt(); //nextInt(); nextDouble(); next().charAt(0);
		System.out.println(temp);
		
		scan.nextLine(); //will resolve skipping
		
		System.out.println("Using nextLine");
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		
		System.out.println("End of program");
	}

}

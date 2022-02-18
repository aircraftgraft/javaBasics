package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		
/*Allow user to enter grade (A, B, or C etc...) and then 
 * provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
 * Not Acceptable. At the end your program should print which grade was entered by a 
 * user with explanation.
 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter grade");
		String grade=in.next();
		
		if (grade.equalsIgnoreCase("A")) {
			System.out.println("Excellent");
		} else if (grade.equalsIgnoreCase("B")) {
			System.out.println("Good");
		} else if (grade.equalsIgnoreCase("C")) {
			System.out.println("Average");
		} else if (grade.equalsIgnoreCase("D")) {
			System.out.println("Bad");
		} else {
			System.out.println("Not acceptable");
		}
		
		
		// switch same
		

		String answer;
		
		
		
		switch (grade) {
		case "A":
			answer="Excellent";
			break;
		case "B":
			answer="Good";
			break;
		case "C":
			answer="Average";
			break;
		case "D":
			answer="Bad";
			break;
		default:
			answer="Not acceptable";
			break;
		}
		
		System.out.println(answer);
		
		
		
	}

}

package com.syntax.class04;

import java.util.Scanner; //to import: cmd+shift+o

public class TakeInput {
	
	public static void main(String[] args) {
		
		//1.create a scanner and assign to a variable
		
		Scanner anyName=new Scanner(System.in);
		
		//2. Specify instructions
		System.out.println("What country are you from?");
		
		//3. We need to capture String value --> use next();
		String country=anyName.next();
		System.out.println("You are from "+country);
		
		/* if you are from USA --> you speak English
		 * if you are from France --> you speak French
		 */
		
		//use equalsIgnoreCase to remove case importance
		if(country.equalsIgnoreCase("USA")) {
			System.out.println("You speak English");
		} else if (country.equals("France")) {
			System.out.println("You speak French");
		} else if (country.equals("Turkey")) {
			System.out.println("You speak Turkish");
		} else {
			System.out.println("I don't know which language you speak");
		}
		
	
	}

}

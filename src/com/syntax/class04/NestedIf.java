package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=false;
		int dose=1;
		
		if (vaccine) {
			System.out.println("How many doses do you have?");
			if (dose==1) {
				System.out.println("You need another shot");	
			} else {
				System.out.println("You are fully vaccinated");
			}
		} 

		System.out.println("________________________________");
		
		/* declare a variable for allergy
		 * 
		 * if you have an allergy -->
		 * 								if you have pollen allergy
		 * 								if you have peanut allergy
		 * 								if you have wheat allergy
		 * if no allergy --> you are lucky
		 */
	
		boolean allergy=true;
		
		if (allergy) {
			System.out.println("Let's check what allergies you have");
			
			String allergyType="pollen";
			if (allergyType.equals("pollen")) {
				System.out.println("Please stay at home when the trees are blooming");
			} else if (allergyType.equals("peanut")) {
				System.out.println("Please do not eat food that contains nuts");
			} else if (allergyType.equals("wheat")) {
				System.out.println("Please follow gluten free diet");
			} else {
				System.out.println("I don't have a suggestion for you");
			}
			
			
		} else {
			System.out.println("You are lucky");
			
		}
		
		
		
	}

}

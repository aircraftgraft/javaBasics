package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		/*In order to be eligible to donate your blood you have to be 18 years old. 
		 * Also once you identify age eligibility then we have to see if person 
		 * matches weight requirements. If person weight it more than 110 lbs → 
		 * then he/she is eligible, otherwise we cannot accept such a patient.
		 */
		
		int age=90;
		if (age>=18) {
			
			int weight=98;
			if (weight>110) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("We cannot accept such patient");
			}
		} else {
			System.out.println("You are ineligible to donate at this time");
		}

	}

}

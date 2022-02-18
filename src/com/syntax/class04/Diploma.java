package com.syntax.class04;

public class Diploma {

	public static void main(String[] args) {
/*Write a program to store a boolean value of whether user has diploma or not. 
 * If user has a diploma, you should say congratulations, 
 * otherwise program should suggest to get a degree.
 *  Then if user has a degree program should check a gpa score. 
 *  If gpa score is higher or equals to 3.5 → output should say 
 *  “You are eligible for scholarship”, otherwise → “You should have studied harder” .
 */
		
		boolean diploma=false;
		if (diploma) {
			System.out.println("Congratulations!");
		} else {
			System.out.println("Go get a degree!");
			double gpa=2.8;
			if (gpa>3.5) {
				System.out.println("You are eligible for a scholarship");
			} else if (gpa==3.5) {
				System.out.println("You are eligible for a scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
			
	/*Create a Java program and store values of mortgage rate and mortgage price. 
	 * First, program should check if rate is higher than 4.5 user will not buy a house, 
	 * otherwise user will consider buying. Once user decides to buy a house, 
	 * if price of the house is larger than 50000 than user will take a loan, 
	 * otherwise user will pay cash.
	 */
			
			int rate=2;
			int price=6000;
			
			if (rate>4.5) {
				System.out.println("User will not buy a house");
			} else {
				System.out.println("User will consider buying");
				if (price>50000) {
					System.out.println("User will take a loan");
				} else {
					System.out.println("User will pay cash");
				}
			}

		}
	}

}

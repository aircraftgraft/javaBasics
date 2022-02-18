package com.syntax.class04;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args) {
		
/*1. You are a loan specialist and you need to ask user what is the amount of loan 
 * is needed. If loan is less or equal to 200,000 then you would lend the money 
 * otherwise you would reject the client.
 */
		
	Scanner loan=new Scanner(System.in);
			
			System.out.println("What is the ammount of the loan needed?");
			
	int ammount=loan.nextInt();
	if (ammount<=200000) {
		System.out.println("Congratulations! Your loan is approved!");
	} else {
		System.out.println("I am sorry. The loan have been rejected");
			
		}
	
	
	/*2. You are DMV representative and you need to ask customer their age. 
	 * If they are 18 and older you will issue a driver license to them, 
	 * otherwise you will offer them to get a learners permit.
	 */
	
	Scanner age=new Scanner(System.in);
	System.out.println("Please enter your age");
	
	int theirAge=age.nextInt();
	if (theirAge>=18) {
		System.out.println("You will be issued a drivers liscence");
	} else {
			System.out.println("You are not old enough to obtain a drivers liscence, but you can get a learners permit");
			
		}
	
	/*3. Create a Java program that will ask user to input city and temperature. 
	 * Your program should convert Fahrenheit into celsius and print 
	 * “The temperature is the city __ is __”
	 */
	
	Scanner city=new Scanner(System.in);
	System.out.println("What city is your current location?");
	String cityName=city.next();
	
	Scanner temperature=new Scanner(System.in);
	System.out.println("What is the current temperature in Fahrenheit?");
	double temp=temperature.nextDouble();
	
	double celcius=((temp-32)/1.8);
	
	System.out.println("The temperature in the city of "+cityName+ " is "+celcius+" degrees Celcius");
	
	
	/*4. Create a Java program that will ask if user has a credit card or not. 
	 * If you user does not have a credit card then offer them. 
	 * If they do have one ask what is balance on the card? 
	 * If balance of the card is larger than 1000, tell them to pay off immediately, 
	 * otherwise you can tell them that they can spend more.
	 */
	
	Scanner card=new Scanner(System.in);
	System.out.println("Do you have a credit card?");
	String ccard=card.next();
	if (ccard.equalsIgnoreCase("no")) {
		System.out.println("Would you like to open one?");
	} else if (ccard.equalsIgnoreCase("yes")) {
		Scanner balance=new Scanner(System.in);
		System.out.println("What is the balance on your card?");
		int cardBalance=balance.nextInt();
		if (cardBalance>1000) {
			System.out.println("Pay it off immidiately!");
		} else {
			System.out.println("You can spend more");
		}
		
/* Write a program to ask user to enter numbers of worked years and annual salary. 
 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
 * otherwise he is not. Once user is eligible and salary is larger than 50000 than 
 * bonus = 5000, otherwise bonus=3000.
 */
		
		Scanner years=new Scanner(System.in);
		System.out.println("How many years have you worked for the company?");
		int worked=years.nextInt();

		
		if (worked>=5) {
			System.out.println("You are eligble for a bonus");
			
			Scanner salary=new Scanner(System.in);
			System.out.println("What is your salary?");
			int sal=salary.nextInt();
			if (sal>50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligible for the bonus");
		}
		
	
	}
		
	
	}
	
	
}


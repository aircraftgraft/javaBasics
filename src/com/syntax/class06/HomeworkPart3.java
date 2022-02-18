package com.syntax.class06;

import java.util.Scanner;

public class HomeworkPart3 {

	public static void main(String[] args) {
		
		/*Write a program to ask user to enter value for sale: yes or no
* if there is no sale --> you are not going for shopping
* if there is sale ask you user for the price of the item
* Based on the price you have to calculate the price of the item after the discount
* if price is less than $20 --> apply 10% discount
* if price is between $20 & $100 --> 20% discount
* if price between $100 & $500 --> 30% discount
* otherwise apply 50% discount
Output of the program should be:
	After discount ___ the price of the item reduce from __ to ___*/
		
	Scanner in=new Scanner(System.in);
	System.out.println("Is there a sale?");
	String sale=in.next();
	
	if (sale.equals("no")) {
		System.out.println("You are not going shopping");
	} else {
		System.out.println("What is the price of the item?");
		int actPrice=in.nextInt();
		int discount=0;
		
		if (actPrice<20) {
			discount=10;
		} else if (actPrice>=20 && actPrice <= 100) {
			discount=20;
		} else if (actPrice>=100 && actPrice <=500) {
			discount=30;
		} else {
			discount=50;
		}
		
		int saving= (actPrice*discount)/100;
		int finalPrice=actPrice-saving;
	
	System.out.println("After "+discount+"% discount the price of the item reduced from "+actPrice+" to "+finalPrice);

	
	
	}
	}

	}

package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/* create a secret number
		 * 
		 * we want user to guess our secret number
		 * 
		 * the moment user guessed it --> 
		 * my program should stop otherwise it shoud continue asking
		 */
		
		int secret=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		do {
			System.out.println("Please enter a number to win");
			guessNumber=scan.nextInt();
		} while (guessNumber!=secret);
		System.out.println("Congratulations!!!");
	}

}

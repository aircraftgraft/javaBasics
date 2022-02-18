package com.syntax.class04;

import java.util.Scanner;

public class HomeworkPart2 {

	public static void main(String[] args) {
		
		/*Write a program to find largest number among three numbers using 
		 * nested if provided by a user (numbers must be distinct)
		 */
		
		Scanner n1=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=n1.nextInt();
		
		Scanner n2=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num2=n2.nextInt();
		
		Scanner n3=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num3=n3.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				System.out.println(num1+" is the largest number");
			}
		}
		
		if (num2>num1) {
			if (num2>num3) {
				System.out.println(num2+" is the largest number");
			}
		}
		
		if (num3>num1) {
			if (num3>num2) {
				System.out.println(num3+" is the largest number");
			}
		}
	}

}

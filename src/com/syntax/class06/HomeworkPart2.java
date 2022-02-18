package com.syntax.class06;

import java.util.Scanner;

public class HomeworkPart2 {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers 
		 * and operator(+,-,*,/). Based on operator provide the result to user.
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=in.nextInt();
		System.out.println("Please enter second number");
		int num2=in.nextInt();
		System.out.println("Please enter operation you would like to perform");
		char op=in.next().charAt(0);
		
		int answer=0;
		
		switch (op) {
		case '+':
			answer=num1+num2;
			break;
		case '-':
			answer=num1-num2;
			break;
		case '*':
			answer=num1*num2;
			break;
		case '/':
			if (num2!=0) {
			answer=num1/num2;
			} else {
				System.out.println("We can not divide by "+num2);
			}
			break;
		default:
			System.out.println("Invalid operator");;
			
		}
		System.out.println(answer);
	
		if (op=='+') {
			System.out.println(num1+num2);
		} else if (op=='-') {
			System.out.println(num1-num2);
		} else if (op=='*' ) {
			System.out.println(num1*num2);
		} else if (op=='/') {
			System.out.println(num1/num2);
		} else {
			System.out.println("error");
		}
		
	}

}

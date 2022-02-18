package com.syntax.class07;

import java.util.Scanner;

public class HomeworkPart2 {

	public static void main(String[] args) {
		/*Ask a user to enter name, last name and age 5 times.
		 *  Every time your program should print those values in a format 
		 *  “You name is _ _ and you are _ years old’
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=in.next();
		System.out.println("Please enter your last name");
		String lastName=in.next();
		System.out.println("Please enter your age");
		int age=in.nextInt();
		
		
		int a=1;
		do {
			System.out.println("Your name is "+name+ " "+lastName+" and you are "+age+" years old");
			a++;
		} while (a<=5);
	}

}

package com.syntax.class07;

import java.util.Scanner;

public class HomeworkVariation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		
		for (int i = 0; i <5; i ++) {
		System.out.println("Your name is "+ name +
		" and you are " +age + " years old." );
		}
	}

}

package com.syntax.class06;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("What is your height?");
		int height=in.nextInt();
		
		if (height<60) {
			System.out.println("short");
		} else if (height>=60 || height<=72) {
			System.out.println("medium");
		} else if (height>72) {
			System.out.println("tall");
		}
	}

}

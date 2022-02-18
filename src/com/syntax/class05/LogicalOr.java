package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Saturday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have a Java class");
		}
		
		System.out.println("Code outside of if statement");

		/* let's ask user what day is today
		 * based on the day lets define which class we have
		 * 
		 * if monday or friday --> no class
		 * else if tue or wed --> manual
		 * else if thu --> review
		 * else if sat or sun --> java class
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("What day is today?");
		String today=in.next();
		
		if (today.equals("monday") || today.equals("friday")) {
			System.out.println("There is no class");
		} else if (today.equals("tuesday") || today.equals("wednesday")) {
			System.out.println("Manual testing class");
		} else if (today.equals("thursday")) {
			System.out.println("There is review class");
		} else if (today.equals("saturday") || today.equals("sunday")) {
			System.out.println("There is Java class");
		}
	}
	
	}



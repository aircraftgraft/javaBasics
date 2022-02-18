package com.syntax.class05;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("What city is your current location?");
		String cityName=input.nextLine();
		
		System.out.println("What is the current temperature in Fahrenheit?");
		double temp=input.nextDouble();
		
		double celcius=((temp-32)/1.8);
		
		System.out.println("The temperature in the city of "+cityName+ " is "+celcius+" degrees Celcius");
		
		
	}

}

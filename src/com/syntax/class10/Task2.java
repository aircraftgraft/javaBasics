package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		/* Create an rray of countries. While retrieving all values from an arrau print 
		 * a capital for each country
		 */
		
		String[] country= {"USA", "Canada", "Spain", "France"};
		String[] capital= {"Washindton DC", "Ottawa", "Madrid", "France"};
		for (int i=0; i<country.length; i++) {
			System.out.println(capital[i]+" is the capital of "+country[i]);
		}
		

	}

}

package com.syntax.class10;

public class Task2AnotherWay {

	public static void main(String[] args) {
		
		/* Create an rray of countries. While retrieving all values from an arrau print 
		 * a capital for each country
		 */
		
		String[] country= {"USA", "Canada", "Spain", "France"};
		String capital = null;
		
		for (int i=0; i<country.length; i++) {
		
		switch(country[i]) {
		case "USA":
			capital="Washington DC";
			break;
		case "Canada":
			capital="Ottawa";
			break;
		case "Spain":
			capital="Madrid";
			break;
		case "France":
			capital="Paris";
			break;
		}
		System.out.println("The capital of the country "+country[i]+" is "+capital);
		}
		System.out.println("ANOTHER WAY");
		
		for(String each:country) {
		if(each.equals("USA")) {
			capital="Washington DC";
		} else if (each.equals("Canada")) {
			capital="Ottawa";
		} else if (each.equals("Spain")) {
			capital="Madrid";
		} else if (each.equals("France")) {
			capital="Paris";
		}
			
		System.out.println("The capital of "+each+" is "+capital);
	}
		
			
	}

}

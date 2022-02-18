package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {
		//creating an array that holds 4 elements
		int num=1;
		int[] numbers=new int[4];
		//storing values/element inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]); //189
		
		//I want to create an array of countries
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afganistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		for (String country:countries) {
		System.out.println(country);
		}
		
		//if value is USA --> I want to live in USA
		
		for(int a=0; a<countries.length; a++) {
			System.out.println((countries[a]+" "));
			if(countries[a].equals("USA")) {
				System.out.println("I want to leave in USA");
			}
		}
		
		System.out.println(countries[3]);
		System.out.println(countries[2]);
		
		String[] names=new String[5];
		names[1]="Elena";
		names[2]="Anna";
		names[3]="Bob";
		
		System.out.println(names[1]); //Elena
		System.out.println("Value in index 4 is "+names[4]);
		
		names[1]="Angel";
		System.out.println(names[1]);
		
		//Create an array to store 4 different prices
		//find an average of how much we've spent
		
		double[] price=new double[4];
		
		price[0]=1.99;
		price[1]=10.50;
		price[2]=5.78;
		price[3]=7.00;
		double average=(price[0]+price[1]+price[2]+price[3])/4;
		System.out.println(average);
		
	}

}

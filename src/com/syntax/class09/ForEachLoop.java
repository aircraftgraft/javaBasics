package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] cities= {"Washington DC","Boston","Miami", "Los Angeles", "New York"};
		
		/*if you have an array you can use for each loop to iterate/loop through 
		*the entire array
		*/
		
		for(String city:cities) {
			System.out.println(city);
		} //this is called for each loop
	}

}

package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		
		String[][] food= {
				{"redbull", "Steak", "steak", "fries"},
				{"curry", "Buryani", "butter chicken"},
				{"noodles", "pad thai", "tom yum"},
				{"pizza", "pasta"}
		};
		
		/*
		//iterates over every array/rom
		for(int row=0; row<food.length; row++) {
			//iterate over every column of specified row
			for(int col=0; col<food[row].length; col++) {
				//accessing elements
				System.out.println(food[row][col]);
				}
				}
				*/
		
		for(String[] cuisine:food) {
			for(String f:cuisine) {
				System.out.print(f+" ");
			}
			System.out.println();
		}
		
		
	}

}

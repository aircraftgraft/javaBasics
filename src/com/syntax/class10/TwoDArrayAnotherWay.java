package com.syntax.class10;

public class TwoDArrayAnotherWay {

	public static void main(String[] args) {
		
		int [][]numbers= {
				{10,20,40},//0
				{100,200,300,400},//1
				{1000,2000,3000,4000, 5000}//2
		};
		System.out.println(numbers[2][1]);//2000
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				
				System.out.print(numbers[i][j]+" ");
				
			}
		}
		
	}

}

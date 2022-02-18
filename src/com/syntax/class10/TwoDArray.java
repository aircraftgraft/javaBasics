package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] numbers=new int[3][4];
		
		//1 row or 1 array
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2 row or 2 array
		numbers[1][0]=100;
		numbers[1][1]=200;
		numbers[1][2]=300;
		numbers[1][3]=400;
		
		//3 row or 3 array
		numbers[2][0]=1000;
		numbers[2][1]=2000;
		numbers[2][2]=3000;
		numbers[2][3]=4000;
		
		System.out.println(numbers[1][2]);//300
		System.out.println(numbers[0][1]+numbers[1][0]);
		
		int size=numbers.length; //when used with 2D gives number of 1D arrays that we stored
		System.out.println(size);//3
		
		int sizeof1Array=numbers[0].length;
		System.out.println(sizeof1Array);
		
		int sizeof2Array=numbers[1].length;
		System.out.println(sizeof2Array);
		
		for(int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[0].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
	}

}

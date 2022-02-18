package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		//create an array and retrieve all elements in reverse order
		
		int[] nums= {6,445,7,4,3,877,9,10};
		
		for (int i=nums.length-1; i>=0; i--) {
			System.out.print(nums[i]+" ");
		}
	}

}

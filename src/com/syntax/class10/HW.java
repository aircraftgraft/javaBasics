package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		
		/*Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		String[] cars={"Honda", "Audi", "Toyota", "Mustang", "Jeep"};
		
		for(int a=0; a<cars.length; a++) {
		System.out.print(cars[a]+" ");
		}
		
		System.out.println(" ");
		
		for(String car:cars) {
			System.out.print(car+" ");
		}
		
		System.out.println(" ");
		/*Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		String[] animals={"Dog", "Cat", "Tiger", "Mouse", "Rat"};
		
		for (int b=0; b<animals.length; b++) {
			System.out.print(animals[b]+" ");
		}
		
		System.out.println(" ");
		
		for(String each:animals) {
			System.out.print(each+" ");
		}
		
		System.out.println(" ");
		
		/* Create an array on integers and calculate the sum of all elements 
		 * in an array
		 */
		
		int[] nums={2,80, 678, 64, 73, 64, 63,1};
		
		int sum=0;
		for(int c=0; c<nums.length; c++) {
			sum+=nums[c];
		}
		System.out.println(sum);
		
		// From an array of integer elements find the largest number.
		
		int[] n= {78,4,456,67,97,235,865,8,747,63};
		
		int largest=n[0];
		for (int t=0; t<n.length; t++) {
			if (n[t]>largest) {
				largest=n[t];
			}
		}
		System.out.println(largest);
		
		largest=n[0];
		for(int ln:n) {
			if(ln>largest) {
				largest=ln;
			}
		}
		System.out.println(largest);
	

	}

}

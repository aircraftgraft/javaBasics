package com.syntax.class10;

import java.util.Scanner;

public class GroupTask {

	public static void main(String[] args) {
		
		/* 1. Create an array on int values using a scanner and calculate 
		 * the sum of all stored elements in that array.
		 */
		
		Scanner in=new Scanner(System.in);
		int sum=0;
		
		for(int i=0; i<3; i++ ) {
		System.out.println("Please enter a number");
		int nums[]=new int[3];
		nums[i]=in.nextInt();
		sum+=nums[i];
		}
		System.out.println(sum);
		
		
		// 2. Create a 2D array of integer values. Print the sum of all numbers.
		System.out.println("Create a 2D array of integer values. Print the sum of all numbers."); 
		
		int value[][]= {
				{2,43,56,45,3},
				{4,65,37,9}
		};
		int sum2=0;
		for (int a=0; a<value.length; a++) {
			for (int b=0; b<value[a].length; b++) {
				sum2+=value[a][b];
			} 
		}
		System.out.println(sum2);
		
		/* 3. Create a 2D array or integer type where you will store 
		 *  odd and even numbers.
		 *  Develop a program which will identify/print the even numbers only.
		 */
		
		int oddEven[][]= {
				{56,34,23,6,3,4,90},
				{54,2,6,43,1}
		};
		for(int d=0; d<oddEven.length; d++) {
			for(int t=0; t<oddEven[d].length; t++) {
				if(oddEven[d][t]%2==0) {
					System.out.print(oddEven[d][t]+" ");
				}
			}
		}
		
		/* 4. Create a 2D array of integers. Develop a program which will 
		 * calculate the sum of  even and odd numbers for that array.
		 */
		
		int task4[][]= {
				{5,6,3,6,8},
				{3,5,2,7}
		};
		int sum4=0;
		int sum4odd=0;
		for(int q=0; q<task4.length; q++) {
			for(int r=0; r<task4[q].length; r++) {
				if(task4[q][r]%2==0) {
					sum4+=task4[q][r];
				} else if (task4[q][r]%2!=0) {
					sum4odd+=task4[q][r];		
				}
			}
			System.out.println(sum4);
			System.out.println(sum4odd);
		}
		
		// 5. Write a program to swap 2 numbers without a temporary variable?
		
			int a=9, b=7;
			System.out.println("Before swapping a="+a+", b="+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After swapping a="+a+", b="+b);
		
		// 6. Write a java program to check whether a given number is prime or not?
		
			System.out.println("Please enter a number");
			int prime=in.nextInt();
			if(prime%2!=0 && prime%3!=0 && prime%5!=0 && prime%7!=0 || prime==5 || prime==7) {
				System.out.println(prime+" is a prime number");
			} else {
				System.out.println(prime+" is NOT a prime number");
			}
			
			System.out.println("OTHER WAY");
			System.out.println("Please enter a number");
			prime=in.nextInt();
			for (int i=2; i<prime/i; i++) {
				if(prime%i==0) {
				System.out.println("Number "+prime+" is not prime");
			} else {
				System.out.println("Number "+prime+" is prime");
			}
			}
			
		// 7. Write a Java Program to print the first 10 numbers of Fibonacci series.
			
			System.out.println("Write a Java Program to print the first 10 numbers of Fibonacci series");
			int c=0;
			a=0;
			b=1;
			for (int z=0; z<10; z++) {
				
				System.out.print(c+" ");
				c=b+a;
				a=b;
				b=c;
			}
			System.out.println();
		
		// 8. Maximum and minimum number in the array?
			
			int array[]= {6,76,34,90,23,87,43};
			int max=0, min=array[0];
			for(int m=0; m<array.length; m++) {
				if (array[m]>max) {
				max=array[m];	
				}
			}
			System.out.println(max+" is the largest number");
			
			for(int m=0; m<array.length; m++) {
				if(array[m]<min) {
					min=array[m];
				}
			}
			System.out.println("The smallest number is "+min);
		
			// 9. Write a java program to find the second largest number in the array
			
			int [] oneD= {9,56,63,86,26,47};
			int largest=oneD[0];
			int larg2=oneD[0];
			for(int n:oneD) {
				if (n>largest) {
					larg2=largest;
					largest=n;
				} else if (n>larg2) {
					larg2=n;
				}
			}
		System.out.println("Second largest number is "+larg2);
	}

}

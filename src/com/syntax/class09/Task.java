package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		
		/*Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
		
		char[] grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		/*Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of 
		 * creating an array).
		 */
		
		String[] name=new String[5];
		name[0]="Anna";
		name[1]="David";
		name[2]="Kat";
		name[3]="Elena";
		name[4]="Mike";
		System.out.println(name[3]);
		
		/* Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”.
		 */
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
	
	}

}

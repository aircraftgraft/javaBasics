package com.syntax.class09;

public class TaskAnotherWay {

	public static void main(String[] args) {
		
		char[] grades= {'A', 'B', 'C','D','E','F'};
		System.out.println(grades[1]);
		
		String[] names= {"Anna", "David", "Kat", "Elena", "Mike"};
		System.out.println(names[3]);
		
		/* Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”.
		 */
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}

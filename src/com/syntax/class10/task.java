package com.syntax.class10;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//From an array of integer elements 
		//find the largest number.
		
		int[] numbers= {26, 16, 30, 5, 22};
		int max=numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			
			
		}
		System.out.println("The largest number is "+max);		
		
	}

}

package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		/*
		 * we need to check if repel was completed
		 * if repel is completed we want to see
		 * if you did 15 and more ---> great job
		 * if you did more than 10 ---> did good
		 * if less then 10 ---> try to complete all assignments
		 */
		
		boolean didRepel=true;
		int assignments;
		
		if (didRepel) {
			System.out.println("How many assignments have you done");
			assignments=0;
			if (assignments>15) {
				System.out.println("you did a great job");
			}else if (assignments>10) {
				System.out.println("you did a good job");
			}else {
				System.out.println("please complete all repel assignments");
			}
	 
		}else {
			System.out.println("You should complete you Repel HW");
		
		}
		
	}

}

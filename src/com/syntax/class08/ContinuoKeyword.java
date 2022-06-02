package com.syntax.class08;

public class ContinuoKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue - skips current execution/iteration
		//when java executes continue --->
		// go back to the beginning of the loop, 
		// so rest of the code inside loop body
		//will be skipped/ignored 
		
			for (int i=1; i<=5; i++) {
				
				if (i == 2) {
					continue;
				}
				System.out.print(i+" ");
				System.out.println("Hello");
				System.out.println("we are going on break soom");
			}
			
			//print numbers from 1 to except number 5 and 7
			
			for (int i =1; i<=10; i++) {
				if (i==5 || i==7) {
					continue;
				}
				System.out.print(i +" "); // 1 2 3 4 5 6 7 8 9 10
			}
	}

}

package com.syntax.class08;

public class Tasks {

	public static void main(String[] args) {
		 
		int sum=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}		
		
		System.out.println(sum);
		int sum1=0;
		for(int i=1; i<=70; i++) {
			if(i%2!=0) {
				sum1+=i;
			}
		}	
		System.out.println(sum1);
		
		// WITHOUT IF CONDITION
			
		int sum3=0;
		for(int i=2; i<=70; i+=2) {
				sum3+=i;
		}		
		System.out.println(sum3);
		
		
		int sum4=0;
		for(int i=1; i<=70; i++) {
			if(i%2!=0) {
				sum4+=i;
			}
		}		
		System.out.println(sum4);
	}

}

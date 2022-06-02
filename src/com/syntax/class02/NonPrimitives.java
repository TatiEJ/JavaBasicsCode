package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		String name="Olaf";
		String lastName=" Eguino";
		
		long phone=7033834335L;
		
		String PhoneNumber="123-456-7890";
		String address="2901 dover Ln";
		
		String age ="10";
		String city="Miami";
		
	//shortcut fot printing
		//type syso + ctrl + space 
		// we can use +
		//    			to attach string to string 
		System.out.println(name+lastName);//Olaf Eguino
		
		
	 // olaf lives in Miami
		 System.out.println(name+" lives in "+city);
		 
	//Olaf is 30 years old
		 System.out.println(name+ " is "+age+" years old ");
	 
	 /*
	  * Rules for identifiers
	  * 1. no space (variable name) example (Phone Number) Error
	  * 2. no keywords in the variable name (purples workds)
	  * 3. names cannot start with numbers (1city) Error
	  * (number can be used in the end of the name (city1)
	  * 4. names cannot start with special character (#city) Error
	  * 	(except _ and $)
	  * 
	  */
		 
		 //variable names should start with lowercase and then follow camelcasing
		 //class name should start with uppercase
		 
		 
		 
	}

}

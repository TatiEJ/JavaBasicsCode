package com.syntax.class02;

public class ArithmericOperators {

	public static void main(String[] args) {
		
		int num1=40;
		int num2=20; 
		
		int sum, sub, mult, div;
		
		System.out.println(num1/num2);
		
		sum=num1+num2;
		System.out.println(sum);//60
		
		sub=num1-num2;
		System.out.println(sub);//20
		
		mult=num1*num2;
		System.out.println(mult); //800
		System.out.println(num1*num2); 
		
		div=num1/num2; 
		System.out.println(div);//2
		
		
		double num3=9.99;
		double num4=3.50;
		double sum1, sub1, mult1, div1;
		sum1=num3+num4;
		System.out.println(sum1);
		
		System.out.println("-----------");
		
		
		int a=10;
		int b=3;
		int result=a/b;
		System.out.println(result);//el resultado real es 3.3333 pero java solo nos 
		//da el numero competo como resultado "3" porque estamos trabajando con int
		// y no con decimales
		
		double c=10.0;
		double d=3.0;
		double result1=c/d;
		System.out.println(result1); 
		/* 
		 * la funcion double nos arroja como resultado hasta 15 decimales
		 */
		
		
		float e=10.0f;
		float f=3.0f;
		float result2=e/f;
		System.out.println(result2);
		/*
		 * la variable siempre debe de ir con f al final (e=10.0f;)
		 * la funcion float nos arroja entre 6 a 7 decimales maximo
		 */
		
		
	}

}

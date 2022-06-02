package com.syntax.class09;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] values = {6.5, 7.4, 4.4, 16.5};
		for (double num : values) {
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("Another way of performing the above is");
		for (int i = 0; i < values.length; i ++) {
			System.out.println(values[i] + " ");
		}
	}
	
}

package com.basicprogram;

public class BasicCore_program {

	static int first = 12;
	static int second = 14;

	public static void main(String[] args) {

		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

		int temporary = first;

		first = second;
		second = temporary;

		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);

	}

}

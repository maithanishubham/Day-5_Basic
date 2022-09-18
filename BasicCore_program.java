package com.basicprogram;

import java.util.Scanner;

public class BasicCore_program {

	static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any number:");
		n = sc.nextInt();

		System.out.print("The Prime Factors of " + n + " are : ");

		int i = 2;

		while (n > 1) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			} else
				i++;
		}
		System.out.println(" ");
	}
}
package com.basicprogram;

import java.util.Scanner;

public class BasicCore_program {

	public static void main(String[] args) {

		int num;
		int mul = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Power Value N:");
		num = sc.nextInt();
		
		if (num > 31) {
			System.out.println("value of number should be less than 31");
			return;
		}

		else {
			System.out.println(mul);
			for (int j = 1; j <= num; j++) {
				mul = mul * 2;
				System.out.println(mul);
			}
		}

	}

}
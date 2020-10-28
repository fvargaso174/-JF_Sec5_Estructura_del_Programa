package com.sentenciasdecontrol;

import java.util.Scanner;

public class LoopPractice2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int repeat = 0;
		int sum=0;
		do {
			System.out.println("Enter a number");
			int input = in.nextInt(); // user inputs a number
			sum += input; // add user input to sum
			System.out.println("Do you want to enter another number?");
			System.out.println("Enter 1 for yes or 2 for no:");
			repeat = in.nextInt();
		} while (repeat == 1);
		System.out.println("The sum of the numbers is: " + sum);
	}// end method main
}// end class LoopPractice2
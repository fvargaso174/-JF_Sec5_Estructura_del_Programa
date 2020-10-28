package com.sentenciasdecontrol;

import java.util.Scanner;

public class LoopPractice3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = 10;
		int sum = 0;
		for (int i = 0; i < numInputs; i++) {
			int input = in.nextInt(); // user inputs a number
			sum += input; // add user input to sum
		} // end for
		System.out.println("The sum of those ten numbers is: " + sum);
	}// end method main
}// end class LoopPractice
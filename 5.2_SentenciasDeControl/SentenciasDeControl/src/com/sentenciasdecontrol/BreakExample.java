package com.sentenciasdecontrol;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = 10, input = 0, sum = 0, stopLoop = 999;
		for (int i = 0; i < numInputs; i++) {
			input = in.nextInt(); // user inputs a number
			if (input == stopLoop) // if the number is 999, exit the
				break; // loop without adding to the sum
			else
				sum += input; // if number is not 999, add it to sum
		} // end for
		System.out.println("The sum of the numbers entered is: " + sum);
	}// end method main
}// end class BreakExample
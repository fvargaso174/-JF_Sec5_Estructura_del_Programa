package com.sentenciasdecontrol;

import java.util.Scanner;

public class LoopPractice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = 0;
		int sum = 0;
		while (numInputs < 10) { // condition to be tested each time
//loop is executed
			int input = in.nextInt(); // user inputs a number
			sum += input; // add user input to sum
			numInputs++; // statement that will change the
//loop condition
		} // end while
		System.out.println("The sum of those ten numbers is: " + sum);
	}// end method main
}// end class LoopPractice
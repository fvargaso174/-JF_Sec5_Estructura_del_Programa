package com.sentenciasadicionales;

import java.util.Scanner;

public class StringChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "";
		System.out.println("Enter your name:");
		name = in.next();
		if (name.equals("Elvis"))
			System.out.println("You are the king of rock and" + "roll");
		else if (name.equals("Michael Jackson"))
			System.out.println("You are the king of pop!");
		else
			System.out.println("You are not the king");
	}// end method main
}// end class StringChecker
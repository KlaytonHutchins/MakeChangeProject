package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double changeDue = userPrompt();

		if (changeDue == 0) {
			System.out.println("Thank you for using exact change. Have a good day!");
		} else if (changeDue < 0) {
			System.out.println("Not enough tendered!");
		} else {
			System.out.println("Change due: " + changeDue);
			makeChange(changeDue);
		}

		sc.close();
	}

	public static double userPrompt() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Item Total: ");
		double itemPrice = sc.nextDouble();

		System.out.print("Enter Money Tendered: ");
		double moneyTendered = sc.nextDouble();

		return moneyTendered - itemPrice;
	}

	public static void makeChange(double changeDue) {
		int numberTwenties, numberTens, numberFives, numberOnes,
			numberQuarters, numberDimes, numberNickels, numberPennies;
		
	}

}

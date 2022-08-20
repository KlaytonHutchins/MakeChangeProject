package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		int changeDueInCents = userPrompt();

		if (changeDueInCents == 0) {
			System.out.println("Thank you for using exact change. Have a good day!");
		}
		else if (changeDueInCents < 0) {
			System.out.println("The customer has not tendered enough money!");
		}
		else {
			System.out
					.println("------------------\nChange due: $" + (changeDueInCents / 100.0 + "\n------------------"));
			makeChange(changeDueInCents);
			System.out.println("------------------\n");
		}
	}

	public static int userPrompt() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Item Total: $");
		double itemPrice = sc.nextDouble();

		System.out.print("Enter Money Tendered: $");
		double moneyTendered = sc.nextDouble();

		sc.close();
		return (int) ((moneyTendered - itemPrice + 0.005) * 100);
	}

	public static void makeChange(int remainingChangeDue) {
		int[] denominationValues = { 2000, 1000, 500, 100, 25, 10, 5, 1 };
		String[] denominationNames = { "$20 Bills ", "$10 Bills ", "$5 Bills ", "$1 Bills ", "Quarters ", "Dimes ",
				"Nickels ", "Pennies " };
		
		for (int i = 0; i < 8; i++) {
			int amountOfDenomination = remainingChangeDue / denominationValues[i];
			remainingChangeDue %= denominationValues[i];
			
			if (amountOfDenomination > 0) {
				System.out.println(denominationNames[i] + "Due:\t" + amountOfDenomination);
			}
		}
	}
}

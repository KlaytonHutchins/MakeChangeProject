package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int changeDueInCents = userPrompt();

		if (changeDueInCents == 0) {
			System.out.println("Thank you for using exact change. Have a good day!");
		} else if (changeDueInCents < 0) {
			System.out.println("The customer has not tendered enough money!");
		} else {
			System.out.println("------------------\nChange due: $" + (changeDueInCents/100.0 + "\n------------------"));
			makeChange(changeDueInCents);
			System.out.println("------------------\n");
		}

		sc.close();
	}

	public static int userPrompt() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Item Total: $");
		double itemPrice = sc.nextDouble();

		System.out.print("Enter Money Tendered: $");
		double moneyTendered = sc.nextDouble();
		
		return (int) ((moneyTendered - itemPrice + 0.005) * 100);
	}

	public static void makeChange(int remainingChangeDue) {
		int numberTwenties = remainingChangeDue / 2000;
		remainingChangeDue %= 2000;
		if (numberTwenties > 0 ) {
			System.out.println("$20 Bills Due:\t" + numberTwenties);
		}
		
		int numberTens = remainingChangeDue / 1000;
		remainingChangeDue %= 1000;
		if (numberTens > 0 ) {
			System.out.println("$10 Bills Due:\t" + numberTens);
		}
		
		int numberFives = remainingChangeDue / 500;
		remainingChangeDue %= 500;
		if (numberFives > 0 ) {
			System.out.println("$5 Bills Due:\t" + numberFives);
		}
		
		int numberOnes = remainingChangeDue / 100;
		remainingChangeDue %= 100;
		if (numberOnes > 0 ) {
			System.out.println("$1 Bills Due:\t" + numberOnes);
		}
		
		int numberQuarters = remainingChangeDue / 25;
		remainingChangeDue %= 25;
		if (numberQuarters > 0 ) {
			System.out.println("Quarters Due:\t" + numberQuarters);
		}
		
		int numberDimes = remainingChangeDue / 10;
		remainingChangeDue %= 10;
		if (numberDimes > 0 ) {
			System.out.println("Dimes Due:\t" + numberDimes);
		}
		
		int numberNickels = remainingChangeDue / 5;
		remainingChangeDue %= 5;
		if (numberNickels > 0 ) {
			System.out.println("Nickels Due:\t" + numberNickels);
		}
		
		int numberPennies = remainingChangeDue;
		if (numberPennies > 0 ) {
			System.out.println("Pennies Due:\t" + numberPennies);
		}
		
	}

}

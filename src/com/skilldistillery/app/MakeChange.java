package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double changeDue = userPrompt();

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

}

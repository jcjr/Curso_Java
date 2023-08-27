package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class BuyDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.moneyReal = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Amount to be paid in reais = %.2f", 
				CurrencyConverter.converterDollar());
		
		sc.close();
	}

}

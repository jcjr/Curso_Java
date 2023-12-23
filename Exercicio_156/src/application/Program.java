package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);	
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			switch (option) {
				case 'i' : 
					System.out.print("Health expenditures: ");
					Double healthExpeditures = sc.nextDouble();
					list.add(new Individual(name, anualIncome, healthExpeditures));
					break;
				case 'c' :
					System.out.print("Number of employees: ");
					int NumberEmployees = sc.nextInt();
					list.add(new Company(name, anualIncome, NumberEmployees));
					break;
				default:
					System.out.println("Select one option!");
					break;
			}
		}
		Double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayers taxPayer: list) {
			System.out.println(taxPayer.toString());
			sum += taxPayer.taxPayment();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

}

package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.println("Number: ");
		int number = sc.nextInt();		
		System.out.println("Date (dd/MM/yyyy): ");
		LocalDateTime date = LocalDateTime.parse(sc.nextLine(), dateFormatter);
		System.out.println("Contract price: ");
		double price = sc.nextDouble();
		System.out.println("Installment quantity: ");
		double installment = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Instalment:");
			
		
		sc.close();
	}

}

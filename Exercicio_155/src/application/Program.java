package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int quant = sc.nextInt();
		
		for(int i = 1; i <= quant; i++) {
			System.out.print("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i): ");
			char choose = sc.next().charAt(0);	
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			switch (choose) {
				case 'c' : 
					list.add(new Product(name, price));
					break;
				case 'u' :
					System.out.print("Manufactory date (DD/MM/YYYY): ");
					LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					list.add(new UsedProduct(name, price, date));
					break;
				case 'i' : 
					System.out.print("Customs fee: ");
					Double customsFee = sc.nextDouble();
					list.add(new ImportedProduct(name, price, customsFee));
					break;
				default:
					System.out.println("Select one option!");
					break;
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod: list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}

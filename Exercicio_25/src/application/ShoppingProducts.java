package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ShoppingProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		pd.setName(sc.nextLine());
		System.out.print("Price: ");
		pd.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");
		pd.setQuantity(sc.nextInt());
		
		System.out.printf("Produtc data: " + pd);
		
		System.out.print("\n\nEnter the number of products to be added in stock: ");
		pd.addProducts(sc.nextInt());
		
		System.out.printf("\n\nUpdate data: " + pd);
		
		System.out.print("\n\nEnter the number of products to be removed from stock: ");
		pd.removeProducts(sc.nextInt());
		
		System.out.printf("\n\nUpdate data: " + pd);
		
		sc.close();
	}
}

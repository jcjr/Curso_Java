package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		PrintService ps = new PrintService();
		
		System.out.print("How many value? ");
		Integer quant = sc.nextInt();
		
		for(int i = 0; i < quant; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}

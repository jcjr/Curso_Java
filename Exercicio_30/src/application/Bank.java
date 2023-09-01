package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Transaction;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Transaction tr;
		double value;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name = sc.next();
		
		System.out.print("Is there any initial deposit [Y/N]? ");
		char confirm = sc.next().charAt(0);
		
		if(Character.toUpperCase(confirm) == 'Y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
		} else {
			value = 0.0;
		}
		System.out.println();
		tr = new Transaction(name, numberAccount, value);
		
		System.out.println("Account data:");
		System.out.println("Acoount " + tr.toString());
		System.out.println();
		
		System.out.print("Enter deposit value: ");
		tr.deposit(sc.nextDouble());	
		System.out.println("Update Account data:");
		System.out.println("Account " + tr.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		tr.withdrawMoney(sc.nextDouble());		
		System.out.println("Update Account data:");
		System.out.println("Account " + tr.toString());
		
		sc.close();
	}

}

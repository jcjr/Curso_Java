package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Transaction;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Transaction tr = new Transaction();
		
		System.out.print("Enter account number: ");
		tr.setAccountNumber(sc.nextInt());
		System.out.print("Enter account holder: ");
		tr.setName(sc.next());
		
		System.out.print("Is there any initial deposit [Y/N]? ");
		char confirm = sc.next().charAt(0);
		
		if(Character.toUpperCase(confirm) == 'Y') {
			System.out.print("Enter initial deposit value: ");
			tr.cashDeposit(sc.nextDouble());
			System.out.println();
		}
		
		System.out.println("Account data:");
		System.out.println("Acoount " + tr.toString());
		System.out.println();
		
		System.out.print("Enter deposit value: ");
		tr.cashDeposit(sc.nextDouble());	
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

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
		System.out.println();
		System.out.print("Enter account holder: ");
		tr.setName(sc.nextLine());
		System.out.println();
		System.out.print("Is there any initial deposit [Y/N]? ");
		char confirm = sc.next().charAt(0);
		
		if(Character.toUpperCase(confirm) == 'Y') {
			
		}
		tr.setName(sc.nextLine());
		
		
		
		
		
		sc.close();
	}

}

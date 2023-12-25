package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
		
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);
			
			System.out.println("New balance: " + acc.getBalance());
			
		} catch (RuntimeException e){
			
			System.out.println("Unexpected error!");
			
		} catch (AccountException e) {
			
			System.out.println("Withdraw erro: " + e.getMessage());
			
		}
		
		sc.close();
	}

}

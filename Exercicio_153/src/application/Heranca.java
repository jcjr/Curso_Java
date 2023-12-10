package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Heranca {

	public static void main(String[] args) {
		
		// Primeira parte do exercício
		Account acc = new Account(1001, "Alex", 0.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// Esse tipo de conversão não é permitido,
		// pois o acc3 é do tipo SavingsAccount enquanto
		// acc5 é BusinessAccount,ambas sendo classes paralelas.
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		
		// Percebe-se que neste if não permite fazer a instância justamente por
		// serem instâncias diferentes.
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		// Nesse if é possível perceber que foi verificado que acc3 é uma classe
		// do derivada de um tipo SavingsAccount e por isso foi possível convertê-la
		// de Account para SavingsAccount.
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		System.out.println();
		System.out.println();
		
		// Segunda parte do exercício
		Account acc6 = new Account(1006, "Joao", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1007, "Pedro", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1008, "Henrique", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
		
		System.out.println();
		System.out.println();
		
		// Terceira parte do exercício
		
		Account x = new Account(1009, "Sara", 1000.0);
		Account y = new SavingsAccount(1010, "Roberto", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}

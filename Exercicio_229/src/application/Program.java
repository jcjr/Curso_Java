package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.println("Number: ");
		Integer number = sc.nextInt();		
		System.out.println("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), format);
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter installment quantity: ");
		Integer quant = sc.nextInt();
		
		ContractService contractService = new ContractService(null);
		
		contractService.processContract(contract, quant);
		
		System.out.println();
		
		System.out.println("Instalment:");
		System.out.println();
			
		for(Installment installment : contract.getinstallmments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}

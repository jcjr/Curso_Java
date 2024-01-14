package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entitites.BrazilTaxService;
import model.entitites.CarRental;
import model.entitites.Invoice;
import model.entitites.RentalService;
import model.entitites.Vehicle;

public class Program {

	public static <SimpleFormatDate> void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
		System.out.println("Enter rent data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Start date (dd/MM/yyyy hh:mm): ");
		LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
		System.out.print("Finish date (dd/MM/yyyy hh:mm): ");
		LocalDateTime finishDate = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
		
		CarRental carRental = new CarRental(startDate, finishDate, new Vehicle(carModel));
		
		System.out.print("Enter price per hour ($): ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day ($): ");
		Double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println();
		
		System.out.println("INVOICE:");
		
		System.out.println("Basic payment: $" + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: $" + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: $" + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		
		sc.close();
	}

}

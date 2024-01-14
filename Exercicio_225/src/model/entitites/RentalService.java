package model.entitites;

import java.time.Duration;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService brasilTaxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brasilTaxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brasilTaxService = brasilTaxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double hours = (Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes()) / 60.0;
		double basicPayment;
		
		if(hours < 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		carRental.setInvoice(new Invoice(basicPayment, brasilTaxService.tax(basicPayment)));
	}

}

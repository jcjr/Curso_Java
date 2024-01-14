package model.entitites;

public class BrazilTaxService {
	
	public Double tax(Double amount) {
		return (amount <= 100.0) ? amount * 0.2 : amount * 0.15;	
	}

}

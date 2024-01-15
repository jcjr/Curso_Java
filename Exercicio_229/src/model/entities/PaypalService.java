package model.entities;

import model.entities.services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {
	
	public Double paymentFee(Double amount) {
		
		return 0.0;
	}
	
	public Double interest(Double amount, Integer months) {
		
		return 0.0;
	}

}

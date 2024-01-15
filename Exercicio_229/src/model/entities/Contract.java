package model.entities;

import java.time.LocalDateTime;

import model.entities.services.ContractService;
import model.entities.services.OnlinePaymentService;

public class Contract implements ContractService {
	
	private Integer number;
	private LocalDateTime date;
	private Double totalValue;
	
	private OnlinePaymentService onlinePaymentService;
	
	public Contract () {
		
	}

	public Contract(Integer number, LocalDateTime date, Double totalValue, OnlinePaymentService onlinePaymentService) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.onlinePaymentService = onlinePaymentService;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public double processContract(Contract contract, Integer months) {
		
	}

}

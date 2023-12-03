package entitites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitites.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem orderItens) {
		orderItem.add(orderItens);
	}
	
	public void removeItem(OrderItem orderItens) {
		orderItem.remove(orderItens);
	}
	
	public double total() {
		int sum;
		
		sum += orderItem.subTotal();
		
		return sum;
	}
}

package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {
		this.name = "";
		this.price = 0.0;
		this.quantity = 0;		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(Product product) {
		this.name = product.name;
		this.price = product.price;
		this.quantity = product.quantity;		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return this.quantity * this.price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name +", $ " + String.format("%.2f", price) + ", " + quantity +
				" units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}

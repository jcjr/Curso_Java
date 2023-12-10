package entities;

public class Transaction {
	private String name;
	private int accountNumber;
	private double amount;
	
	//Constructions
	public Transaction() {
		this.name = "";
		this.accountNumber = 0;
		this.amount = 0.0;
	}

	public Transaction(String name, int accountNumber, double amount) {
		this.name = name;
		this.accountNumber = accountNumber;
		deposit(amount);
	}

	public Transaction(Transaction transaction) {
		this.name = transaction.name;
		this.accountNumber = transaction.accountNumber;
		deposit(amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void deposit(double money) {
		if(money > 0.0) {
			this.amount += money;
		}
	}
	
	public void withdrawMoney(double money) {
		if(this.amount > 0.0) {
			this.amount -= money + 5.0;
		}
	}
	
	public String toString() {
		return accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", amount);
	}
}
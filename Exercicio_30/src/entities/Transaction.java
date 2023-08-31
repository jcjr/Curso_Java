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
		this.amount = amount;
	}

	public Transaction(Transaction transaction) {
		this.name = transaction.name;
		this.accountNumber = transaction.accountNumber;
		this.amount = transaction.amount;
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

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void cashDeposit(double money) {
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
package entities;

//Colocando "final" após a cláusula "public" não permite que a classe
// seja herdada para uma sub-classe, ou seja, não é possível extendê-la.
// Neste caso em algumas situações permite que seja executado mais rápido.
public /*final*/ class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

	// Colocando "final" após a cláusula "public" não permite que o método
	// seja sobreposto em uma sub-classe herdada desta classe. Neste caso
	// em algumas situações permite que seja executado mais rápido.
	@Override
	public /*final*/ void withdraw(Double amount) {
		balance -= amount;
	}
}

package model.entities;

import model.exceptions.AccountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

		this.number = number;
		this.holder = holder;

		if (balance >= 0.0 && withdrawLimit >= 0.0) {
			this.balance = balance;
			this.withdrawLimit = withdrawLimit;
		}

	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withdrawLimit;
	}

	public void setWithDrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		if (amount > 0.0) {
			this.balance += amount;
		}
	}

	public void withdraw(Double amount) throws AccountException {
		if (amount > 0.0) {
			if (amount <= balance && amount <= withdrawLimit) {

				balance -= amount;

			} else if (amount > withdrawLimit) {

				throw new AccountException("The amount exceeds withdraw limit!");

			} else {

				throw new AccountException("Not enough balance!");

			}
		} else {

			throw new AccountException("Not is possible withdraw this value!");

		}
	}

}

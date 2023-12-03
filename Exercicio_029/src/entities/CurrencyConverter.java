package entities;

public class CurrencyConverter {
	public static double dollarPrice, moneyReal;
	
	public static double converterDollar() {
		return ((dollarPrice + (dollarPrice * 0.06)) * moneyReal);
	}
}

package entities;

public class Company extends TaxPayers {
	
	private int numberEmployee;
	
	public Company() {
		
	}

	public Company(String name, Double anualIncome, int numberEmployee) {
		super(name, anualIncome);
		this.numberEmployee = numberEmployee;
	}

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double taxPayment() {
		if (numberEmployee > 10) {
			return super.getAnualIncome() * 0.14;
		} else {
			return super.getAnualIncome() * 0.16;
		}
	}

}

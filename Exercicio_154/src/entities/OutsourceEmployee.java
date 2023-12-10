package entities;

public class OutsourceEmployee extends Employee{
	
	private Double additionalChange;
	
	public OutsourceEmployee() {
		super();
	}
	
	public OutsourceEmployee(String name, Integer hours, Double valueHour, Double additionalChange) {
		super(name, hours, valueHour);
		this.additionalChange = additionalChange;
	}

	public Double getAdditionalChange() {
		return additionalChange;
	}

	public void setAdditionalChange(Double additionalChange) {
		this.additionalChange = additionalChange;
	}

	@Override
	public Double payment() {
		return super.payment() + (additionalChange * 1.10);	
	}
}

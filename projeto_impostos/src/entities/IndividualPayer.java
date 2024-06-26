package entities;

public class IndividualPayer extends Payer {
	private Double healthExpenditures;

	public IndividualPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
		calculateTaxes();
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public void calculateTaxes()
	{
		if(getAnualIncome() < 20000.00) {
			this.setTaxes(getAnualIncome() * 0.15);
		}
		else {
			this.setTaxes(getAnualIncome() * 0.25);
		}
		
		if(getHealthExpenditures() != 0) {
			this.setTaxes(getTaxes() - (getHealthExpenditures() * 0.50));
		}
	}
	
	
}

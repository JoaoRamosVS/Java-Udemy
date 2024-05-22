package entities;

public class CompanyPayer extends Payer {
	private Integer numberOfEmployees;

	public CompanyPayer(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
		this.calculateTaxes();
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public void calculateTaxes() {
		if(getNumberOfEmployees() > 10) {
			setTaxes(getAnualIncome() * 0.14);
		}
		else {
			setTaxes(getAnualIncome() * 0.16);
		}
	}
	
	
}

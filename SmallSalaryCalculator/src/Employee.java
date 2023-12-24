
public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return this.getGrossSalary() - (this.getGrossSalary() * (this.getTax() / 100 ));
	}
	
	public void increaseSalary(double percentage) {
		double newSalary = this.getGrossSalary() + (this.getGrossSalary() * (percentage / 100));
		System.out.println("Your current salary after a "+ percentage + " percent increase is: " + newSalary);
	}

	@Override
	public String toString() {
		return "Employee: " + getName() + "\n"
				+ "Gross Salary: " + getGrossSalary() + "\n"
				+ "Tax: " + getTax() + "\n"
				+ "Net Salary: " + netSalary();
	}
	
	
	
}

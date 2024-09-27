package cpe.eng.kps.ku.ac.th.employee;

public class FixedSalary extends Employees{
	protected double salary;
	
	public double earnings() {
		
		return salary;
		
	}
	
	public String toString() {
		return "Fixed salary employee: " + firstName + ' ' + lastName + '\n' +
				"social security number: " + securityNumber + '\n' +
				"monthly salary: $" + salary ;
	}
		
	public FixedSalary(String first, String last, String ssn,double salary) {
		super(first,last,ssn);
		this.salary = salary;
		
	}
	
	
}

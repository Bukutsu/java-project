package cpe.eng.kps.ku.ac.th.employee;

public class HourlySalary extends Employees{
	protected double pay;
	protected int hour;
	
	public double earnings() {
		return hour*pay;
		
	}
	
	public String toString() {
		return "Fixed salary employee: " + firstName + ' ' + lastName + '\n' +
				"social security number: " + securityNumber + '\n' +
				"hourly pay: $ " + pay + "; hours worked: " + (float)hour ;

	}
	
	public HourlySalary(String first, String last, String ssn,double pay,int hour) {
		super(first,last,ssn);
		this.pay = pay;
		this.hour = hour;
	}
	
	
}

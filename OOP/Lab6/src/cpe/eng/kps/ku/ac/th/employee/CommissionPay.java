package cpe.eng.kps.ku.ac.th.employee;

public class CommissionPay extends Employees{
	protected double sale;
	protected double rate;
	
	public double earnings() {
		return sale*rate;
		
	}
	
	public String toString() {
		return "Fixed salary employee: " + firstName + ' ' + lastName + '\n' +
				"social security number: " + securityNumber + '\n' +
				"gross sales: $" + "sale; commission rate: " + rate;
	}
	
	public CommissionPay(String first,String last,String ssn,double sale, double rate) {
		super(first,last,ssn);
		this.sale = sale;
		this.rate = rate;
	}
	
	
	
}

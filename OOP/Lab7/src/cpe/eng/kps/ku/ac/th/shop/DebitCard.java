package cpe.eng.kps.ku.ac.th.shop;

public class DebitCard extends Card{
	
	private String type;
	private double discount;
	
	public DebitCard() {
		type = "visa";
		discount = 2.5;
	}
	
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public double discount() {
		return discount;
	}
	
}

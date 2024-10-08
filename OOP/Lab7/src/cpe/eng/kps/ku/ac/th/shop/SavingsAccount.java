package cpe.eng.kps.ku.ac.th.shop;

public class SavingsAccount extends BaseAccount{
	private int money;
	//private String cardNumber;
	
	
	public SavingsAccount(FixedSalary employee) {
		System.out.println("\tCARD TYPE:" + employee.getCard().type());
		String[] splited = employee.securityNumber.split("-");
		System.out.println("\t" + "CARD NUMBER:" + "XXX-XXX-" +splited[2]);
	}
	


	@Override
	public boolean withdraw(double amount) {
		if(amount < money) {
			money -= amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if(amount > 0) {
			money += amount;
			return true;
		}
		return false;
	}

}

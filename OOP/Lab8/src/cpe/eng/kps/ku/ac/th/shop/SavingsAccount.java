package cpe.eng.kps.ku.ac.th.shop;

public class SavingsAccount extends BaseAccount{
	private double money;
	private DebitCard card;
	//private String cardNumber;

	public class DebitCard extends Card{
		private String type;
		private double discount;
	
		
		public DebitCard() {
			type = "visa";
			discount = 2.5;
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

		@Override
		public boolean withdraw(double amount) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

	
	public SavingsAccount(FixedSalary employee) {
		this.card = new DebitCard();
		this.money = employee.salary;
		
		System.out.println("\tCARD TYPE:" + card.type());
		String[] splited = employee.securityNumber.split("-");
		System.out.println("\t" + "CARD NUMBER:" + "XXX-XXX-" +splited[2]);
	}
	

	public SavingsAccount() {
		this.card = new DebitCard();
		this.money = 0;
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
	
	public DebitCard getCardtype() {
		return card;
	}


//	public void setCard(DebitCard card) {
//		this.card = card;
//	}

}

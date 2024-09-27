package cpe.eng.kps.ku.ac.th.shop;

public class DriverProgram {

	public static void main(String[] args) {
		
		FixedSalary employeeA = new FixedSalary("Clark", "Kent","555-999-5555", 15000.00);

		SavingsAccount b = new SavingsAccount(employeeA);

		b.deposit(1000); 

		 Milk p1 = new Milk(150);
		 p1.setVolume(250);
		 Sugar p2 = new Sugar(50);
		 p2.setWeight(250);
		 Product p3 = new Coffee(250);
		 p3.setWeight(50);
		 Product p4 = new Coffee(250);
		 p4.setWeight(50);

		 InventoryCart ic = new InventoryCart (10);
		 ic.addProduct(p1);
		 ic.addProduct(p2);
		 ic.addProduct(p3);
		 ic.addProduct(p4);
		 
		 Cashier c = new Cashier();
		 c.doPayment(ic,employeeA.getCard());
		 
		 c.printReceipt(); 

		}
}

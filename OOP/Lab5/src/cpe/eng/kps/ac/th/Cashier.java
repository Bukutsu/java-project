package cpe.eng.kps.ac.th;

public class Cashier {
	private String name;
	
	public Cashier(String name) {
		this.name = name;
	}
	
	public void printReceipt(InventoryCart cart) {
		int totalPrice = 0;
		System.out.println("\tPumpkin Shop " + '(' + this.name + ")\n");

		for(int i=0;i<cart.getItemLimit();i++) {
			if(cart.getProduct(i) != null) {
				totalPrice += cart.getProduct(i).getPrice();
				System.out.println("\t1 x " + '(' + cart.getProduct(i).getName() + ')' + '\t' + '(' + cart.getProduct(i).getCode() + ')' + '\t' + cart.getProduct(i).getPrice());
			}
		}
		
		System.out.println('\t' + "--------------------");
		
		System.out.println('\t' + "Total" + '\t' + totalPrice + '$');
	}
	

}

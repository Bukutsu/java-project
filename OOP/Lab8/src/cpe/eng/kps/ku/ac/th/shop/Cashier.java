package cpe.eng.kps.ku.ac.th.shop;

public class Cashier {
	private String name;
	private double discount;
	private double total;
	
	public String getName() {
		return name;
	}

	public Cashier(String name) {
		this.name = name;
	}
	
	public Cashier() {
		this.name = "Unnamed";
	}
	
	
	public void printReceipt(InventoryCart cart) {
		int totalPrice = 0;
		int currentCount = 0;
		System.out.println('\t' + "---------------------------");
		System.out.println("\t\tPumpkin Shop "+ "\n");
		for(int i=0;cart.getProductInfo(i) != null;i++) {
			
			String currentProduct = cart.getProductInfo(i).getName();
			int currentWeight = cart.getProductInfo(i).getWeight();
			int currentPrice  = cart.getProductInfo(i).getPrice();
			
			
			//count condition
			for(int j=0;cart.getProductInfo(j) != null;j++) {
				if(currentProduct == null) break;
				if(currentProduct.equals(cart.getProductInfo(j).getName())) {
					currentCount++;
					if(currentCount > 1) {
						cart.getProduct(j);
					}
					
				}
			}
				
			totalPrice += cart.getProductInfo(i).getPrice()*currentCount;
			if((cart.getProductInfo(i).getName().equals("Coffee") || cart.getProductInfo(i).getName().equals("Sugar"))) {
				System.out.println("\t" + currentCount + " x (" + currentProduct + ") " + currentWeight + " Gram" + '\t' + currentPrice*currentCount);
			}
			else if(cart.getProductInfo(i).getName().equals("Milk") ) {
				System.out.println("\t" + currentCount + " x (" + currentProduct + ") " + currentWeight + " CC" + '\t' + currentPrice*currentCount);
			}
			currentCount = 0;
			
		}
		

		
		System.out.println('\t' + "---------------------------");
		
		System.out.println('\t' + "Total" + '\t' + totalPrice + '$');
	}
	

	
	
	public void doPayment(InventoryCart cart,Card card) {
		int totalPrice = 0;
		int currentCount = 0;
		System.out.println('\t' + "---------------------------");
		System.out.println("\t\tPumpkin Shop "+ "\n");
		for(int i=0;cart.getProductInfo(i) != null;i++) {
			
			String currentProduct = cart.getProductInfo(i).getName();
			int currentWeight = cart.getProductInfo(i).getWeight();
			int currentPrice  = cart.getProductInfo(i).getPrice();
			
			
			//count condition
			for(int j=0;cart.getProductInfo(j) != null;j++) {
				if(currentProduct == null) break;
				if(currentProduct.equals(cart.getProductInfo(j).getName())) {
					currentCount++;
					if(currentCount > 1) {
						cart.getProduct(j);
					}
					
				}
			}
				
			totalPrice += cart.getProductInfo(i).getPrice()*currentCount;
			if((cart.getProductInfo(i).getName().equals("Coffee") || cart.getProductInfo(i).getName().equals("Sugar"))) {
				System.out.println("\t" + currentCount + " x (" + currentProduct + ") " + currentWeight + " Gram" + '\t' + currentPrice*currentCount);
			}
			else if(cart.getProductInfo(i).getName().equals("Milk") ) {
				System.out.println("\t" + currentCount + " x (" + currentProduct + ") " + currentWeight + " CC" + '\t' + currentPrice*currentCount);
			}
			currentCount = 0;
			
			total = totalPrice;
		}
		

		
		System.out.println('\t' + "---------------------------");
		
		System.out.println("\tCARD DISCOUNT \t\t" + card.discount() + "%");
		discount = card.discount();
	
	}
	
	public void printReceipt(){
		total -= (total*(discount/100));
		System.out.println("\tTotal\t\t\t" + total + '$');
	}

}

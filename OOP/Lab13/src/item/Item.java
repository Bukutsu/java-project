package item;

public class Item {
	String name;
	double price;
	int quantity;
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void printItemInfo() {
		System.out.println(name + "\t" + "$" + price + "\t" + quantity + "\t" + "$" + price*quantity);
	}

	public String getItemInfo(){
		return name + "\t" + "$" + price + "\t" + quantity + "\t" + "$" + price*quantity;
	}
	
	public double getTotal() {
		return price*quantity;
	}
	
}

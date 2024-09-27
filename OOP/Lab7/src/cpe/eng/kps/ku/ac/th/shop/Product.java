package cpe.eng.kps.ku.ac.th.shop;

public class Product {
	protected String code;
	protected String name;
	protected int price;
	protected int weight;
	
	
	public Product(String code,String name,int price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		this.code = null;
		this.name = null;
		this.price = 0;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPrice() {
		return this.price;
	}
	
}

package cpe.eng.kps.ku.ac.th.shop;

public class Milk extends Product{

	
	public void setVolume(int volume) {
		weight = volume;
	}
	
	public int getVolume() {
		return weight;
	}
	
	public Milk(int price) {
		super("XA1101","Milk",price);
	}
}

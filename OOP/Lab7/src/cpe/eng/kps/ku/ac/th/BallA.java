package cpe.eng.kps.ku.ac.th;

public class BallA extends Ball implements Rollable{
	
	public BallA(String tradeMark) {
		super.setTradeMark(tradeMark);
		System.out.println(this.getTreadMark() + " is a trademark of " + this.getClass().getSimpleName() + '.');
	}
	
	public BallA() {
		
	}
	
	public void inflate(double volume) {
		System.out.println(this.getTreadMark() + "'s ball is inflated " + volume + " cu.ft.");
		
	}
	
	public void roll() {
		System.out.println(this.getTreadMark() + " rolls rather smoothly.");
	}
}

package cpe.eng.kps.ku.ac.th;

public class BallC extends BallA{
	public BallC(String tradeMark) {
		super.setTradeMark(tradeMark);
		System.out.println(this.getTreadMark() + " is a trademark of " + this.getClass().getSimpleName() + '.');
	}
	public void roll() {
		System.out.println(this.getTreadMark() + " rolls very smoothly.");
	}
}

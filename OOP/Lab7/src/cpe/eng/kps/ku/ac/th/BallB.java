package cpe.eng.kps.ku.ac.th;

public class BallB extends BallA{
	public BallB(String tradeMark) {
		super.setTradeMark(tradeMark);
		System.out.println(this.getTreadMark() + " is a trademark of " + this.getClass().getSimpleName() + '.');
	}
	public void roll() {
		System.out.println(this.getTreadMark() + " rolls smoothly.");
	}
}

package cpe.eng.kps.ku.ac.th;

public class DriverProgram {
	public static void TestBall(Ball ball,double volume) {
		ball.inflate(volume);
		((BallA)ball).roll();

	}
	
	public static void main(String[] args) {
		Ball b1 = new BallA("Zentia");
		TestBall(b1,1.0);
		Ball b2 = new BallB("Zapphire");
		TestBall(b2,1.1);
		Ball b3 = new BallC("Zenith");
		TestBall(b3,1.2);

	}
	
}

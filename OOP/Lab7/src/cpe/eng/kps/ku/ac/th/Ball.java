package cpe.eng.kps.ku.ac.th;

public abstract class Ball {
	private String tradeMark;
	
	public String getTreadMark() {
		return tradeMark;
	}

	public void setTradeMark(String treadMark) {
		this.tradeMark = treadMark;
	}
	
	public String toString() {
		return "";
	}

	public abstract void inflate(double volume);


}

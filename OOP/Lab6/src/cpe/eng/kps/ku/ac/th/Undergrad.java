package cpe.eng.kps.ku.ac.th;

public class Undergrad extends Student {
	protected String year;
	
	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public Undergrad(int id,String name,double gpa,String year) {
		super(id,name,gpa);
		this.year = year;
	}
	
	public String toString() {
		System.out.println("Untergraduate Students:");
		System.out.println(super.toString());
		return "Year: " + this.year;
	}
	
	
	
}

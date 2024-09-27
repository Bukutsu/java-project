package cpe.eng.kps.ku.ac.th;

public class Graduate extends Student{
	protected String thesisTitle;

	public String getThesisTitle() {
		return thesisTitle;
	}

	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	
	public String toString() {
		System.out.println("Graduate Students:");
		System.out.println(super.toString());
		return "Thesis: " + this.thesisTitle;
	}
	

	public Graduate(int id,String name,double gpa,String thesisTitle) {
		super(id,name,gpa);
		this.thesisTitle = thesisTitle;
	}

	
	
}

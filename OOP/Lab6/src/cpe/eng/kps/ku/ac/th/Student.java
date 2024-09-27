package cpe.eng.kps.ku.ac.th;

public class Student {
	protected String name;
	protected int id;
	protected double gpa;
	
	public String getName() {
		return this.name;
	}
	public double getGPA() {
		return this.gpa;
	}
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
		this.name = null;
		this.gpa = 0;
		this.id = 0;
	}
	
	public Student(int id,String name,double gpa) {
		this.name = name;
		this.gpa = gpa;
		this.id = id;
	}
	
	public Student(int id,double gpa) {
		this.name = null;
		this.gpa = gpa;
		this.id = id;
	}
	
	public String toString() {
		
		return "ID: " + this.id + '\n' + "Name: " + this.name + '\n' + "GPA: " + this.gpa;
		
	}
	
	

}

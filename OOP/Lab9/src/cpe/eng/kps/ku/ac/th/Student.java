package cpe.eng.kps.ku.ac.th;

public class Student {
	private String name;
	private String grade;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void show(){
		try {
			calGPA();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void calGPA() throws Exception{	
		if(name.matches(".*\\d.*")) {
			throw new Exception("SpaceException :(space is now allowed in name) can not display");
		}
		if(name.matches(".*\\s.*")) {
			throw new Exception("DigitException :(digit is now allowed in name) can not display");
		}
		
		if(grade.contains("I")){
			throw new Exception("IncompleteException :(grade I is incomplete) can not display");
		}

		int i;
		double GPA = 0;
		double sum = 0;
		for(i = 0;i < grade.length();i++) {
			if(grade.charAt(i) == 'A' || grade.charAt(i) == 'B' || grade.charAt(i) == 'C' || grade.charAt(i) == 'D' || grade.charAt(i) == 'F' ) {
				switch (grade.charAt(i)) {
					case 'A': sum += 4; break;
					case 'B': sum += 3; break;
					case 'C': sum += 2; break;
					case 'D': sum += 1; break;
					default : sum += 0; break;
				}			
			}
			else {
				throw new Exception("GradeException :(grade must be A B C D F) can not display");
			}
		}
		
		GPA = sum / i;
		System.out.println(name + " registered " + i + " subjects and got GPA " + GPA);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student("Decha","ABI").show();
		new Student("George1","ABC").show();
		new Student("John Young","DB").show();
		new Student("Ted","JAB").show();
		new Student("Tony","CAB").show();
		}
	
	
}

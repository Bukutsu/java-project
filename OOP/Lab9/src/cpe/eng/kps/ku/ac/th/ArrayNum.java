package cpe.eng.kps.ku.ac.th;

public class ArrayNum {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,};
		try {
			System.out.println(num[5]);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
		}
		
		for(int i : num) {
			System.out.println(i);
		}
	}

}

package Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.nextLine();
		String[] splited = input.split("]");
		splited[0] = splited[0].replaceAll("\\s+","");
		splited[1] = splited[1].replaceAll("\\s+","");
		splited[0] = splited[0].replace("[", "");
		splited[1] = splited[1].replace("[", "");
		splited[1] = splited[1].replace("+", "");
		String[] operand1 = splited[0].split(",");
		String[] operand2 = splited[1].split(",");
		
		Set<String> set1 = new TreeSet<>();
		Set<String> set2 = new TreeSet<>();
		
		for(String numChar : operand1) {
			set1.add(numChar);
		}
		
		for(String numChar : operand2) {
			set2.add(numChar);
		}
		
		
		if(input.contains("+")) {
			Set<String> output = new TreeSet<>(set1);
			output.addAll(set2);
			System.out.println(output);
		}
		else if(input.contains("-")) {
			Set<String> output = new TreeSet<>(set1);
			output.removeAll(set2);
			System.out.println(output);
		}
		else if(input.contains("*")) {
			Set<String> output = new TreeSet<>(set1);
			output.retainAll(set2);
			System.out.println(output);
		}
		
	}
}

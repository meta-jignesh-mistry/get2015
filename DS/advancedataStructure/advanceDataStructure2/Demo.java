package advanceDataStructure2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
public static void main(String[] args) {
		try {
		System.out.println("Enter a String");
		BufferedReader bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
		String input = bufferedReaderObj.readLine();
		input = input.toLowerCase();
		input=input.replaceAll("\\s","");
		if(ValidateExpression.isExpression(input)) {
			GenerateTruthTable truthTableObj = new GenerateTruthTable();
			truthTableObj.truthTableGenerator(input);
		}
		else {
			System.out.println("Enter Valid Expression");
		}
		}
		catch(Exception e) {
			
		}
	}
}

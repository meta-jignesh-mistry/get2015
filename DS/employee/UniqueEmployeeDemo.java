package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueEmployeeDemo {
	
	//Employee Set which will contain only unique Employee object based on Employee Id
	public static Set<Employee> employee =  new HashSet<Employee>() ; 

	public static void main(String[] args) {
		String regex="[0-9]+";
		Scanner scan = new Scanner(System.in);
	
		String name;
		String address;
		String choice;
		
		while(true) {
			System.out.println("\nEnter 1 to add employee");
			System.out.println("Enter 2 to exit");
			choice = scan.next();
			switch(choice) {
			
				case "1" :
						String id;
					
						do{
							System.out.println("Enter Employee Id");
							id=scan.next();
				         
						}while(!(id.matches(regex)));
					
							int empId=Integer.parseInt(id);
							System.out.println("Employee name");
							name = scan.next();
							System.out.println("Enter employee Address");
							address = scan.next();
							
							
							Employee emp = new Employee(empId,name,address);
							
							//adding employee Object to Employee Set if same employee not present
							if(employee.contains(emp)){
								System.out.println("Sorry ! Same Employee Already Present");
							}
							else{
							employee.add(emp);
							}
							break;
							
						   
				case "2" : return;
				
				default : System.out.println("please enter right choice");
			}	
		}
	}
}

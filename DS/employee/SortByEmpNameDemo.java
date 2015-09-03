package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortByEmpNameDemo {
	
	//Employee List which will contain Employee object 
	public static List<Employee> employee =  new ArrayList<Employee>() ; 

	public static void main(String[] args) {
		String regex="[0-9]+";
		Scanner scan = new Scanner(System.in);
	
		String name;
		String address;
		String choice;
		
		while(true) {
			System.out.println("\nEnter 1 to add employee");
			System.out.println("Enter 2 to show sorted employee list according their name");
			System.out.println("Enter 3 to exit");
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
							
							//adding employee Object to Employee Set
							employee.add(emp);
							break;
							   
				case "2" : LinkedList list = new LinkedList(employee);
							//sorting based on Employee name
							Collections.sort(list,new NameComparator());
							System.out.println("\n**Sorted Employee by their Names**\n");
							if(employee.size()>0){
								for(Object e : list){
										System.out.println(e.toString());
								}
							}
								else{
									System.out.println("No Employee Available\n");
								}
							  break;
										   
				case "3" : return;
								
				default : System.out.println("please enter right choice");

}
		}
		}
	}

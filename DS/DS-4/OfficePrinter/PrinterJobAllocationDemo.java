package OfficePrinter;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PrinterJobAllocationDemo {
	
	public static int counter = 0;
	//method to add in priority Queue
	public static void addData(Queue priorityQueue) {
		
		int temp,i;
		if(counter<=0) {
			return;
		}
		else {
				temp= counter;	
				Node[] array = new Node[temp];	
				i=0;
				while(temp!=0){
					array[i]=(Node) priorityQueue.remove();
					i++;
					temp--;
				}
					HeapSort.sort(array);
					
					for(int j = array.length-1;j>=0;j--  ){ 
						priorityQueue.add((Node)array[j]);
					}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Queue<Node> priorityQueue=new LinkedList<Node>();
		
		String priorityNo = "-1";
		String name = "";
		String department = "";
		
		
		String choice;
		//regular expression for numeric value
		String regix="[0-9]+";
		while(true) {
			System.out.println("\nEnter 1 for send Request to Printer ");
			System.out.println("Enter 2 for show Printer Allocation sequence");
			System.out.println("Enter 3 to exit");
			choice = sc.nextLine();
			switch(choice) {
				case "1" : 
							do{
							System.out.println("\nEnter user type--\nPress 1 for UnderGraduate\nPress 2 for PostGraduate\nPress 3 for Professor\nPress 4 for Chairman\n"); 
						    priorityNo = sc.nextLine();
							}while(!(priorityNo.matches(regix)));
						    
						    int priority=Integer.parseInt(priorityNo);
						    
						    while( !(priority > 0 && priority<=4) ){
						    	System.out.println("Please enter values (1/2/3/4) as input");
						    	priority = sc.nextInt();
						    }
					 
					 if(priority==1) {
						 department = "UG";
					 }
					 else if(priority==2) {
						 department = "PG";
					 }
					 else if(priority==3) {
						 department = "Professors";
					 }
					 else{
						 department = "Chairman";
					 }
					 System.out.println("\nEnter your name\n");
					 name = sc.nextLine();
					 //creating new node
					 Node node = new Node(priority,name,department);
					 //adding new node in priorityQueue
					 priorityQueue.add(node);
					 counter++;
					 addData(priorityQueue);
					 break;

				case "2" :System.out.println("\n*****Current Printing Request*****\n");
						  System.out.println("Name               Designation");
						if(counter<=0) {
							System.out.println("\nNo Current Request on printer Right Now\n");
						}
						else {
								//removing the node from priority Queue
								System.out.println(priorityQueue.remove());
								counter--;
						}
					
						break;
				
				case "3": return;
					
				default: System.out.println("\nPlease enter Correct Input\n");
			
			}
		}

	}

}

package studentInfo;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class StudentSortingDemo {
	
	public static void main(String args[]) {
		
		
		Set<Integer> rollNumberSet=new HashSet<Integer>();
		String regix="[0-9]+";
		Scanner sc=new Scanner(System.in);
		//creating tree Sort Object
		TreeSort tree=new TreeSort();
		
		
		while(true){
		System.out.println("\nPress 1 to enter Student Detalis ");
		
		System.out.println("Press 2 to Show Student Details Roll number wise");
		
		System.out.println("Press 3 to Exit");
		
		String choice=sc.next();
		
		switch(choice){
		
		case "1": 
			String rNumber;
			 do{
				 	System.out.println("Enter Student Roll no.");
					rNumber=sc.next();
	                if(!(rNumber.matches(regix))){
	                	
	                	System.out.println("\nSorry ! Invalid Roll Number ,Enter Again\n");
	                }
	                
	                
	            }while(!(rNumber.matches(regix)));
			
			
			int rollNo=Integer.parseInt(rNumber);
			
			
			System.out.println("Enter Student name");
			String name=sc.next();
			if(!rollNumberSet.contains(rollNo)){
				rollNumberSet.add(rollNo);
				//adding student node to tree
				tree.addNode(rollNo, name);
				
			}
			else{
				//if same roll number already present in set
				System.out.println("\nSorry ! Student Details Already Entered\n");
			}
			break;	
		case "2":
				if(rollNumberSet.size()!=0){
				System.out.println("**Students Details Sorted in Ascending Order of Roll number**\n");
				Node root=tree.getRoot();
				//in-order traversal of tree 
				tree.inOrderTraversalTree(root);
				}
				else
				{
					System.out.println("\nSorry ! No Student Entry Present\n");
						
				}
				break;
		case "3" :
				System.exit(0);
		default :System.out.println("Please enter valid choice");	
		
		}
		
		}
		
	}
	
	
}

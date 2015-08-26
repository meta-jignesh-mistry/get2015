

import java.util.Scanner;

public class ImplementingLinkList {
	
		
		
		public static void main(String args[])
		{   
			
			//creating node of integer type 
			Node<Integer> newNode = new Node<Integer>();
			
			
			System.out.println("How many nodes you want to create in a singly linked list");
			int n,data;
			
			Scanner scanner=new Scanner(System.in);
			
			n=scanner.nextInt();
			for(int i=0;i<n;i++){
				System.out.println("Enter new node value");
				data=scanner.nextInt();
				newNode.add(data);
			}
			//calling method to display nodes of link list
			newNode.display();
			
		    System.out.println("Enter position where you want to add the new node");
		    int pos=scanner.nextInt();
		    
		    System.out.println("Enter new node value");
		    data=scanner.nextInt();
			//calling method to add element at position
		    newNode.addAtPostion(pos, data);
			newNode.display();
			
			System.out.println("Enter value which you want to delete");
			int deleteValue=scanner.nextInt();
			//calling method to delete element by value
			if(newNode.deleteByValue(deleteValue))
			{
				System.out.println(deleteValue+" deleted from linked list");
			}
			else{
				System.out.println("no such type of number Exist");
			}
			
			newNode.display();
			System.out.println("");
			//calling method to remove element from index position
			 System.out.println("Enter index from where you want to delete an item");
			 pos=scanner.nextInt();
			 if(newNode. deleteByIndex(pos))
				{
					System.out.println("data deleted from index "+pos);
				}
			
			newNode.display();
			
			System.out.println("Enter position from where you want to retrieve the data");
			pos=scanner.nextInt();
			//calling method to retrieve element from position
			System.out.println(newNode.getitem(pos));
			//calling method to reverse the link list
			newNode.reverseLinkedList();
			System.out.println("Reversed list is :");
			newNode.display();
			//calling method to sort the link list
			newNode.sortList();
			System.out.println("Sorted list is :");
			newNode.display();
		}
}

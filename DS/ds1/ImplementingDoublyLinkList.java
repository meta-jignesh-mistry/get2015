

import java.util.Scanner;


//Class having implementation of methods of Doubly link list

public class ImplementingDoublyLinkList {
	public static void main(String args[]) {
		
		NodeOfDoublyLinkList<Integer> newNode = new NodeOfDoublyLinkList<Integer>();
		
		System.out.println("How many nodes you want to create in a doubly linked list");
		int n, data;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter new node value");
			data = scanner.nextInt();
			newNode.add(data);
		}
		//calling method to display the doubly link list
		newNode.display();
		
		System.out.println("Enter position where you want to add the new node");
		int position = scanner.nextInt();
		System.out.println("Enter new node value");
		data = scanner.nextInt();
		//calling method to add element at position
		newNode.addAtPostion(position, data);
		newNode.display();
		
		System.out.println("Enter value which you want to delete");
		int deleteValue = scanner.nextInt();
		//calling method to remove element by value
		if (newNode.deleteByValue(deleteValue)) {
			System.out.println(deleteValue + " deleted from linked list");
		} else {
			System.out.println("no such type of number Exist");
		}

		newNode.display();
		System.out.println("");
		System.out.println("Enter index from where you want to delete an item");
		position = scanner.nextInt();
		//calling method to remove element by position
		if (newNode.deleteByIndex(position)) {
			System.out.println("data deleted from index " + position);
		}

		newNode.display();
		System.out
				.println("Enter position from where you want to retrieve the data");
		position = scanner.nextInt();
		//calling method to retrieve element from position
		System.out.println(newNode.getitem(position));
		//calling method to reverse the doubly link list
		newNode.reverseLinkedList();
		System.out.println("Reversed list is :");
		newNode.display();
		//calling method to sort the doubly link list
		newNode.sortList();
		System.out.println("Sorted list is :");
		newNode.display();
	}

}

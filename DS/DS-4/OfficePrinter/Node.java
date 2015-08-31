package OfficePrinter;

public class Node {
	
	public int priority;
	public String name;
	public String department;
	
	
	public Node () {
		priority = -1;
		name = "";
		department = "";
		
	}
	
	public Node(int priority, String name, String department ) {
		this.priority = priority;
		this.name = name;
		this.department = department;
		
	}
	//overriding the toString method
	public String toString() {
		return name+"	             "+department;
	}
}

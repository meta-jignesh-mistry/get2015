package studentInfo;



//class to generate Tree node
public class Node {
   
    public int rollNumber;
    Node left;
    Node right;
    String name;

    public Node(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    //overriding the toString method of the object class
    public String toString(){
        
    	return "Roll No. = "+rollNumber+"  Student Name = "+name;
        
    }
    
    
}
 
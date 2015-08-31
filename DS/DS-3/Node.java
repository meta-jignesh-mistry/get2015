
package binarysearchtree;

//class to generate BinaryTree node
public class Node {
   
    public int key;
    Node leftChild;
    Node rightChild;
    String name;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }
    //overriding the toString method of the object class
    public String toString(){
        return name+" has a key "+key;
        
    }
    
    
}
 

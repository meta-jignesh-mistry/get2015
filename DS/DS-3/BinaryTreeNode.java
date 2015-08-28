
package binarysearchtree;

//class to generate BinaryTree node
public class BinaryTreeNode {
   
    public int key;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    String name;

    public BinaryTreeNode(int key, String name) {
        this.key = key;
        this.name = name;
    }
    //overriding the toString method of the object class
    public String toString(){
        return name+" has a key "+key;
        
    }
    
    
}
 
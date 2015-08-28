package binarysearchtree;

import java.util.Scanner;

/*class to check if two binary trees are mirror images or not
	
	ENTER values in sequence 15 7 20 14 18 5 10 for both Binary trees
	
	
*/
public class MirrorImageOfTreeMainClass {
 
public static boolean checkForMirror(String preOrder,String postOrder){
	
	if(postOrder.equals(preOrder)){
		
		return true;
	}
	else{
		
		return false;
	}
}
	
 public static void main(String args[]){ 

	 
String preOrder,postOrder;

 int flag=0;
 //regular expression to match the choice of user
 String regix="[0-9]+";
 BinaryTreeMethodImplementation binaryTree1=new BinaryTreeMethodImplementation();   
 BinaryTreeMethodImplementation binaryTree2=new BinaryTreeMethodImplementation();   
 Scanner sc=new Scanner(System.in);  
 
 System.out.println("\n**To Check Two Binary Trees are Mirror Image of Each Other**\n" );
       while(true){
            System.out.println("press 1 to add node in First Binary Tree");
           
            System.out.println("press 2 to exit from First Binary Tree ");
            
            String choice1 =sc.next();
            String key1;
        
            if(choice1.equals("1")){
            do{
                System.out.println("enter node Key value(Integer)");
                key1=sc.next();
                
            }while(!(key1.matches(regix)));
            System.out.println("enter node name");
            String nodeName=sc.next();
            //adding the node in tree
            binaryTree1.addNode(Integer.parseInt(key1),nodeName);
            flag=1;
            }
            else 
            if(choice1.equals("2")){
                    break;
            }
            else{
                    System.out.println("\nPlease enter Correct Option\n");
            }
       }
        System.out.println("\n**PreOrder Traversal of First Binary Tree**\n");
       	preOrder=binaryTree1.preOrderTraversalTree(binaryTree1.root);
          while(true){
            System.out.println("press 1 to add node in Second Binary Tree");
            
            System.out.println("press 2 to exit from Second Binary Tree ");
            
            String choice2 =sc.next();
            String key2;
    
            if(choice2.equals("1")){
            do{
                System.out.println("enter node Key value(Integer)");
                key2=sc.next();
                
            }while(!(key2.matches(regix)));
            System.out.println("enter node name");
            String nodeName=sc.next();
            //adding the node in tree
            binaryTree2.addMirrorNode(Integer.parseInt(key2),nodeName);
            flag=1;
            }
            else 
            if(choice2.equals("2")){
                    break;
            }
            else{
                    System.out.println("\nPlease enter Correct Option\n");
            }

        }
          System.out.println("\n**PostOrder Traversal of Second Binary Tree**\n");
          postOrder=binaryTree2.postOrderTraversalTree(binaryTree2.root);
          
          System.out.println("\n**If preorder of first binary tree and \npostorder of second binary tree are reverse of each other, it will be Mirror Images**\n");
          //calling method to check whethere two binary tress are mirror images or not  
          System.out.println("\nAre the two tress are Mirror Images -- "+checkForMirror(preOrder,postOrder));
 
 
 
 
 }
}

 
 
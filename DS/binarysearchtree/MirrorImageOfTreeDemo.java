package binarysearchtree;

import java.util.Scanner;

/*class to check if two binary trees are mirror images or not
	
	for example FirstBinaryTree with input values 10 9 11 12
	        and SecondBinaryTree with input values 10 11 9 12 
	        both are mirror images of each other 
	
	
*/
public class MirrorImageOfTreeDemo {
 

 public static void main(String args[]){ 

	 



 //regular expression to match the choice of user
 String regix="[0-9]+";
 BinaryTree binaryTree1=new BinaryTree();   
 BinaryTree binaryTree2=new BinaryTree();   
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
           
            }
            else 
            if(choice1.equals("2")){
                    break;
            }
            else{
                    System.out.println("\nPlease enter Correct Option\n");
            }
       }
       
      
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
            
            }
            else 
            if(choice2.equals("2")){
                    break;
            }
            else{
                    System.out.println("\nPlease enter Correct Option\n");
            }

        }
          
         
          //calling method to check whethere two binary tress are mirror images or not  
          System.out.println("\nAre the two tress are Mirror Images -- "+binaryTree1.checkMirror(binaryTree1.root,binaryTree2.root));
 
 
 
 
 }
}

 
 
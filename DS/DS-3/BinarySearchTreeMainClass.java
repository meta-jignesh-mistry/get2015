
package binarysearchtree;

import java.util.Scanner;


public class BinarySearchTreeMainClass {

    public static void main(String[] args) {
        int flag=0;
        BinaryTreeMethodImplementation tree=new BinaryTreeMethodImplementation();
        while(true){
        System.out.println("press 1 to add node in Tree");
        System.out.println("press 2 to show preOrder traversal of Tree");
        System.out.println("press 3 to show postOrder traversal of Tree");
        System.out.println("press 4 to exit");
        Scanner sc=new Scanner(System.in);
        String choice =sc.next();
        String key;
        
        //regular expression to match the choice of user
        String regix="[0-9]+";
        
        if(choice.equals("1")){
            do{
                System.out.println("enter node Key value(Integer)");
                key=sc.next();
                
            }while(!(key.matches(regix)));
            System.out.println("enter node name");
            String nodeName=sc.next();
           //adding the node in tree
            tree.addNode(Integer.parseInt(key),nodeName);
            flag=1;
        }
            else if(choice.equals("2")){
            	
            	System.out.println("\nPreOrder Traversal of tree\n");
                
                //if no node in tree 
                if(flag==0){
                    System.out.println("\nSorry ! Tree has No Node\n");
                }
                //showing pre order traversal
                 tree.preOrderTraversalTree(tree.root);
                 System.out.println("\n");
                 
                  }
             else if(choice.equals("3")){
            	 
            	 System.out.println("\nPostOrder Traversal of tree\n");
                 
            	 //if no node in tree 
                if(flag==0){
                    System.out.println("\nSorry ! Tree has No Node\n");
                }
                //showing post order traversal
                 tree.postOrderTraversalTree(tree.root);
                 System.out.println("\n");
                
                  }
             else if(choice.equals("4")){
                 System.exit(0);
             }
             else{
                 System.out.println("\nPlease enter Correct Option\n");
             }

        }
        
      
       }
        
    
}

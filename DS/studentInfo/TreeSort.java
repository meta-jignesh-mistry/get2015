package studentInfo;

import java.util.ArrayList;


//class have method implementation of tree sort
public class TreeSort  {
    
    ArrayList<Integer> rollNumber=new ArrayList<Integer>();
   
    Node root;
    //method to add node in  tree
    public void addNode(int rollNumber,String name){
        
       Node newNode=new Node(rollNumber,name);
       
       //if root null,make it new node
       if(root==null){
           
           root=newNode;
           
       }
       else{
           
           Node currentNode=root;
           Node parent;
           while(true){
               parent=currentNode;
               if(rollNumber<currentNode.rollNumber){
                    currentNode=currentNode.left;
                    if(currentNode==null){
                        parent.left=newNode;
                        return;
                       
                    }
               }
               else{
                   currentNode=currentNode.right;
                   if(currentNode==null){
                       parent.right=newNode;
                       return;
                       
                   }
               }
           }
           
       }
        
        
    }
 
 //method to show in-order traversal of tree
 public void inOrderTraversalTree(Node currentNode){
           
         if(currentNode!=null){
                
               	
                inOrderTraversalTree(currentNode.left);
                //adding sorted detail in ArrayList
                rollNumber.add(currentNode.rollNumber);
               
                System.out.println(currentNode);
                inOrderTraversalTree(currentNode.right);
               
         }
         
 }   
    
 	//return roll number of the student node
    public int getrollNumber(Node node){
        return node.rollNumber;
    }
    //return root of the tree
    public Node getRoot(){
        return root;
    }
    //returning array of the ascending order roll number
    public int[] ascendingOrderRollNumber(){
    	int rollNumberArray[]=new int[rollNumber.size()];		
    	for(int i=0;i<rollNumber.size();i++){
    		rollNumberArray[i]=rollNumber.get(i);			
    	}
    	
    	return rollNumberArray;
    	
    }
    
    
 }

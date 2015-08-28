package binarysearchtree;

//class have method implementation of BinarySearchTree
public class BinaryTreeMethodImplementation  {
    
    String str="";
    String str1="";
    BinaryTreeNode root;
    //method to add node in Binary Search tree
    public void addNode(int key,String name){
        
       BinaryTreeNode newNode=new BinaryTreeNode(key,name);
       
       //if root null,make it new node
       if(root==null){
           
           root=newNode;
           
       }
       else{
           
           BinaryTreeNode currentNode=root;
           BinaryTreeNode parent;
           while(true){
               parent=currentNode;
               if(key<currentNode.key){
                    currentNode=currentNode.leftChild;
                    if(currentNode==null){
                        parent.leftChild=newNode;
                        return;
                       
                    }
               }
               else{
                   currentNode=currentNode.rightChild;
                   if(currentNode==null){
                       parent.rightChild=newNode;
                       return;
                       
                   }
               }
           }
           
       }
        
        
    }
  //method to show inordertraversal of tree  
 public void inOrderTraversalTree(BinaryTreeNode currentNode  ){
     
     if(currentNode!=null){
         inOrderTraversalTree(currentNode.leftChild);
         System.out.println(currentNode);
         inOrderTraversalTree(currentNode.rightChild);
     }
 }   
    
 //method to show preorder traversal of tree
 public String preOrderTraversalTree(BinaryTreeNode currentNode){
           
         if(currentNode!=null){
                System.out.println(currentNode);
                str1+=currentNode.key;
                preOrderTraversalTree(currentNode.leftChild);
                preOrderTraversalTree(currentNode.rightChild);
                return str1;
         }
         return str1;
 }   
    
 //method to show post order traversal of tree
 public String postOrderTraversalTree(BinaryTreeNode currentNode){
     
            if(currentNode!=null){
                postOrderTraversalTree(currentNode.leftChild);
                postOrderTraversalTree(currentNode.rightChild);
                System.out.println(currentNode);
                str=currentNode.key+str;
                return str;
            }
			return str;
 }     
    public int getKey(BinaryTreeNode node){
        return node.key;
    }
    public BinaryTreeNode getRoot(){
        return root;
    }
    
    public void addMirrorNode(int key,String name){
        
        BinaryTreeNode newNode=new BinaryTreeNode(key,name);
        
        //if root null,make it new node
        if(root==null){
            
            root=newNode;
            
        }
        else{
            
            BinaryTreeNode currentNode=root;
            BinaryTreeNode parent;
            while(true){
                parent=currentNode;
                if(key<currentNode.key){
                     currentNode=currentNode.rightChild;
                     if(currentNode==null){
                         parent.rightChild=newNode;
                         return;
                        
                     }
                }
                else{
                    currentNode=currentNode.leftChild;
                    if(currentNode==null){
                        parent.leftChild=newNode;
                        return;
                        
                    }
                }
            }
            
        }
         
         
     }
 }

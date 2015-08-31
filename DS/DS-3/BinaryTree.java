package binarysearchtree;

//class have method implementation of BinarySearchTree
public class BinaryTree  {
    
    String str="";
    String str1="";
    Node root;
    //method to add node in Binary Search tree
    public void addNode(int key,String name){
        
       Node newNode=new Node(key,name);
       
       //if root null,make it new node
       if(root==null){
           
           root=newNode;
           
       }
       else{
           
           Node currentNode=root;
           Node parent;
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
  //method to show in-order traversal of tree  
 public void inOrderTraversalTree(Node currentNode  ){
     
     if(currentNode!=null){
         inOrderTraversalTree(currentNode.leftChild);
         System.out.println(currentNode);
         inOrderTraversalTree(currentNode.rightChild);
     }
 }   
    
 //method to show pre-order traversal of tree
 public String preOrderTraversalTree(Node currentNode){
           
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
 public String postOrderTraversalTree(Node currentNode){
     
            if(currentNode!=null){
                postOrderTraversalTree(currentNode.leftChild);
                postOrderTraversalTree(currentNode.rightChild);
                System.out.println(currentNode);
                str=currentNode.key+str;
                return str;
            }
			return str;
 }     
    public int getKey(Node node){
        return node.key;
    }
    public Node getRoot(){
        return root;
    }
    
    public void addMirrorNode(int key,String name){
        
        Node newNode=new Node(key,name);
        
        //if root null,make it new node
        if(root==null){
            
            root=newNode;
            
        }
        else{
            
            Node currentNode=root;
            Node parent;
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

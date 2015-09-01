package binarysearchtree;

//class have method implementation of BinarySearchTree
public class BinaryTree  {
    
    
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
 
 //method to show pre-order traversal of tree
 public void preOrderTraversalTree(Node currentNode){
           
         if(currentNode!=null){
                System.out.println(currentNode);
               
                preOrderTraversalTree(currentNode.left);
                preOrderTraversalTree(currentNode.right);
               
         }
         
 }   
    
 //method to show post order traversal of tree
 public void postOrderTraversalTree(Node currentNode){
     
            if(currentNode!=null){
                postOrderTraversalTree(currentNode.left);
                postOrderTraversalTree(currentNode.right);
                System.out.println(currentNode);
                
            }
			
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
                     currentNode=currentNode.right;
                     if(currentNode==null){
                         parent.right=newNode;
                         return;
                        
                     }
                }
                else{
                    currentNode=currentNode.left;
                    if(currentNode==null){
                        parent.left=newNode;
                        return;
                        
                    }
                }
            }
            
        }
         
         
     }
	//method return true if trees are mirror image otherwise false
	public boolean checkMirror(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if ((root1 == null && root2 != null)
				|| (root1 != null && root2 == null)) {
			return false;

		}

		if (root1.key != root2.key) {
			return false;
		}
		checkMirror(root1.left, root2.right);
		checkMirror(root1.right, root2.left);
		return true;
	}
 }

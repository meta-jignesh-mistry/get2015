

//Stack class that have method like pop,push,peep
public class Stack {
    int size;
    Node node=new Node();
    public Stack(){
        size=0;
        
    }
    
    //push method to add item at top
    public boolean push(Object item){   
    node.add(item);
    size++;
    return true;
    }
    
    //method return the size of stack
    public int size(){
        return size;
    } 
    
    //method remove the item from top
    public Object pop(){
        
        if(size==0){
            return false;
        }
        else{
            Object currentTopItem=new Object();
            currentTopItem=node.getitem(size);
            node.deleteByIndex(size);
            size--;
            return currentTopItem;
        }
        
        
    }
    //method to traverse the top item of stack
      public Object peep(){
    
        if(size==0){
            return null;
        }
        else{
            
            return node.getitem(size);
        }
        
        
    }
      
      

  	//method return true if stack is empty
  	boolean isEmpty() {
  		if(size <= 0){
  			return true;
  		}
  		return false;
  	}
      
         
   
  }

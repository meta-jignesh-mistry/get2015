package queue;

import java.util.LinkedList;

public  class QueueUsingLinkList extends LinkedList<String>  {
   
	LinkedList<String> linkList;
    
	public QueueUsingLinkList(){
    
		linkList=new LinkedList<String>(); 
    }
    
	//method to add item at rear position of queue
	public void enque(String item){
        linkList.add(item);
        
     }
    //method to remove front item of the queue
    public Object dequeue(){
     return linkList.removeFirst();
        
    }
    //return size of queue
    public int size(){
       
        return linkList.size();
    }
    //return item at index position
    public String get(int index){
       return linkList.get(index);
   }
 }
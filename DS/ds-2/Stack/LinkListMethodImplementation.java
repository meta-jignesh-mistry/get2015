package Stack;

//class have implementation of methods of LinkList
public class LinkListMethodImplementation extends Node {
	
	
	 //method to add element in list
	   <T> boolean add(T element)
	   {
		  
		   Node<T> newNode1 = new Node<T>(element);
		   Node<T> current=new Node<T>();
		   if(start== null)
		   {
			   start = newNode1;
			  
			   return true;
		   }
		   else{
			   current = start;
			   while(current.next!= null)
			   {
				  
				 current=current.next;
			   }
			 current.next=newNode1;
		   }
		   return true;
	   }
	


	
	 //method to delete element by position
	   <T> boolean deleteByIndex(int position)
	   {
		Node<T> current=new Node<T>();
		current = start;
		int count=1;
		if(position==1){
			
		
			start=current.next;
			
		}
		else{
		 count=2;
		 while(current!= null)
		   {
			 if(count==position)
			 {
			 current.next=current.next.next;
			 
			 }
			 count++;
			 current=current.next;
		   }
		 if(count < position)
		 {
			 return false;
		 }
		}
		return true;
		
	}

	//method to get item by position
	<T> T getitem(int position)
	{
		Node<T> current=new Node<T>();
		current = start;
		int count=1;
		 while(current!= null)
		   {
			 if(count==position)
			 {
			 return current.nodeValue;
			 
			 }
			 count++;
			 current=current.next;
		   }
		return null;
	}
	

}

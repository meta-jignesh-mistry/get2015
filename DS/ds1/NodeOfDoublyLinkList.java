


//class having methods performing on Nodes of doubly link list
public class NodeOfDoublyLinkList<T> {
	
   T nodeValue; 
   NodeOfDoublyLinkList<T> start;
   NodeOfDoublyLinkList<T> next;
   NodeOfDoublyLinkList<T> previous;
   
   //default constructor with null initial value
   public NodeOfDoublyLinkList() {
  	nodeValue = null;
  	next = null;
  	previous=null;
   }
   //initialize nodeValue to item and set next and previous to null
   public NodeOfDoublyLinkList(T item) {
  	nodeValue = item;
  	next = null;
  	previous=null;
   }
   
   //method to add element in doubly link list
   boolean add(T element)
   {
	  
	   NodeOfDoublyLinkList<T> newNode1 = new NodeOfDoublyLinkList<T>(element);
	   NodeOfDoublyLinkList<T> current=new NodeOfDoublyLinkList<T>();
	   if(start== null)
	   {
		   start = newNode1;
		   newNode1.previous=start;
		   return true;
	   }
	   else{
		   current = start;
		   while(current.next!= null)
		   {
			   current=current.next;
		   }
		 current.next=newNode1;
		 newNode1.previous=current;
	   }
	   return true;
   }
   //method to display doubly link list
boolean display()
{
	NodeOfDoublyLinkList<T> current=new NodeOfDoublyLinkList<T>();
	current = start;
	
	   while(current!= null)
	   {
		   System.out.print(current.nodeValue + "   ");
		   current=current.next;
	   }
	   System.out.println();
	return true;
}

//method to add element at position in doubly link list
boolean addAtPostion(int position,T value)
{
	NodeOfDoublyLinkList<T> newNode1=new NodeOfDoublyLinkList<T>(value);
	NodeOfDoublyLinkList<T> current=new NodeOfDoublyLinkList<T>();
	
	current = start;
	int count=1;
	if(position==1){
		newNode1.next=current;
		newNode1.previous=start;
		start=newNode1;
	}
	
	else{
		count=2;
	 while(current!= null)
	   {
		 if(count==position)
		 {
		  newNode1.next=current.next;
		  newNode1.previous=current;
		  current.next=newNode1;
		  
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
//method to delete value in doubly link list
boolean deleteByValue(T value)
{
	int flag=0;
	NodeOfDoublyLinkList<T> current = start;
	if(current == null)
		return false;
	 while(current!= null)
	   {
		 if(current.nodeValue == value){
			 start = current.next;
			 
			 return true;
		 }
		 if(current.next!= null){
		 if(current.next.nodeValue == value)
		 {	if(current.next.next!=null){	
			 current.next=current.next.next;
			 current.next.next.previous=current;
			 flag=1;
			 return true;
			 }
		 }
		 }
		 current=current.next;
	   }
		 if((flag==0)&&(current==null))
				 {
			 		return false;
				 }
		
		 
	 
	 return false;
	
}
//method to delete element by position in doubly link list
boolean deleteByIndex(int position)
{
	NodeOfDoublyLinkList<T> current=new NodeOfDoublyLinkList<T>();
	current = start;
	int count=1;
	if(position==1){
		start=current.next;
		current.next.previous=start;
		
	}
	else{
	 count=2;
	 while(current!= null)
	   {
		 if(count==position)
		 {
		 current.next=current.next.next;
		 current.next.next.previous=current;
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
//method to get element by position in doubly link list
T getitem(int position)
{
	NodeOfDoublyLinkList<T> current=new NodeOfDoublyLinkList<T>();
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
//method to reverse doubly link list
public void reverseLinkedList() {
	if (start == null || start.next == null)
		return;
	NodeOfDoublyLinkList<T> Second = start.next;
	Second.previous=start;
	
	NodeOfDoublyLinkList<T> Third = Second.next;
	
	Third.previous=Second;
	
	Second.next = start; 
	
	start.next = null; 
	
	if (Third == null)
		return;
	NodeOfDoublyLinkList<T> CurrentNode = Third;
	NodeOfDoublyLinkList<T> PreviousNode = Second;
	while (CurrentNode != null) {
		NodeOfDoublyLinkList<T> NextNode = new NodeOfDoublyLinkList<T>();
		NextNode=CurrentNode.next;
       
		CurrentNode.next = PreviousNode;
		PreviousNode = CurrentNode;
		CurrentNode = NextNode;
	}
	start = PreviousNode; 
	NodeOfDoublyLinkList<T> current = start;

}
//method to sort the doubly link list
public boolean sortList() {
	if (start == null || start.next == null)
		return true;

	NodeOfDoublyLinkList<T> newHead = new NodeOfDoublyLinkList<T>(start.nodeValue);
	NodeOfDoublyLinkList<T> pointer = start.next;
	pointer.previous=start;

	
	while (pointer != null) {
		

		NodeOfDoublyLinkList<T> innerPointer = newHead;
		NodeOfDoublyLinkList<T> next = pointer.next;
       
		if ((int) pointer.nodeValue <= (int) newHead.nodeValue) {
			NodeOfDoublyLinkList<T> oldHead = newHead;
			newHead = pointer;
			newHead.next = oldHead;
			oldHead.previous=newHead;
		} else {
			while (innerPointer.next != null) {

				if ((int) pointer.nodeValue > (int) innerPointer.nodeValue
						&& (int) pointer.nodeValue <= (int) innerPointer.next.nodeValue) {
					NodeOfDoublyLinkList<T> oldNext = innerPointer.next;
					
					innerPointer.next = pointer;
					pointer.previous=innerPointer;
					pointer.next = oldNext;
					oldNext.previous=pointer;
				}

				innerPointer = innerPointer.next;
			}

			if (innerPointer.next == null
					&& (int) pointer.nodeValue > (int) innerPointer.nodeValue) {
				innerPointer.next = pointer;
				pointer.previous=innerPointer;
				pointer.next = null;
			}
		}

		
		pointer = next;
	}
	start = newHead;
	return true;
}
}


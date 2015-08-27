package Stack;


//class will create node 

public class Node<T> {
   
	// data held by the node
   T nodeValue;
   // next node in the list
   Node<T> start;
   Node<T> next;
   // default constructor with no initial value
   public Node() {
  	nodeValue = null;
  	next = null;
   }
 // initialize nodeValue to item and set next to null
   public Node(T item) {
  	nodeValue = item;
  	next = null;
   }
   
   
}


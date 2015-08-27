package Queue;

//class having implementation of queue methods
public class Queue {
	
	Object list[];
	
	int front = -1;
	int rear = -1;
	public Queue(int n) {
		list = new Object[n];
		
	}
	//method to enqueue 
	void enQueue (Object item ) {
		if(rear==-1) {
			rear = 0;
			front = 0;
			list[rear] = item;
		}
		else {
			list[++rear] = item;
		}
	}
	//method to dequeue
	Object deQueue() {
		Object object;
		if(front==rear+1 || front == -1) {
			throw new NullPointerException("Queue is empty");
		}
		else {
				
				object = list[front];
				front++;
		}
		return object;
	}
	
	//method to make the queue empty
	void makeEmpty(){
		front=-1;
		rear=-1;
		
	}
	//method to get front of the queue
	Object getFront(){
		if(front==rear+1 || front == -1) {
			throw new NullPointerException("Queue is empty");
		
		}
		else{
			return list[front];
		}
		
		
	}
	
}


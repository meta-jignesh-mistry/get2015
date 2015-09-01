
package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class QueueDemo {
    
    public static void main(String args[]){
        
        
        QueueUsingLinkList queue=new QueueUsingLinkList();
        while(true){
        System.out.println("\n\nPress 1 to add Element in queue");
        System.out.println("Press 2 to remove Element from queue");
        System.out.println("Press 3 to show queue");
        System.out.println("Press 4 to exit");
        Scanner sc=new Scanner(System.in);
        String choice=sc.nextLine();
         
        switch(choice)
       {
            case "1":
                	System.out.println("Enter Queue element");
                	String element=sc.nextLine();
                	//adding item in queue
                	queue.enque(element);
                	System.out.println(element+"  Added successully in queue\n");
                		break;
                
            case "2" :if(queue.size()==0){
            			System.out.println("\nQueue is Empty");
            	
            		}else
            		{	//removing item from front of queue
            			queue.dequeue();
            			System.out.println("Front item is removed");
            		}
            			break;
                    
            case "3" :if(queue.size()==0){
    					System.out.println("\nQueue is Empty");
            	
    				}
            	else
    				{	System.out.println("\n**Items in Queue**\n");
            			//displaying queue items
    					for(int i=1;i<=queue.size();i++){
    		                   
                			String obj=queue.get(i-1);
                			System.out.print("  "+obj);
                       
                		}
    					
    	            		
    				}
                
            			break;
            case "4": 
            		System.exit(0);
            default:
                	System.out.println("Please enter correct choice");
                
         
       
       }
     }
       
        
        
        
   }
    
    
 }

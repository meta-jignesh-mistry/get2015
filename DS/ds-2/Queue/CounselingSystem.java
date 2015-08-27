package Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//class implementing the Counseling System of Colleges
public class CounselingSystem {
	
    public static void main(String args[]){
    	Scanner sc =new Scanner(System.in);
    	int numberOfCollege=0;
    	
    	System.out.println("Enter the number of colleges participating in Counseling");
    	
    	numberOfCollege=sc.nextInt();
    	
    	//hashmap having college name as key and number of seats as Value 	
    	HashMap<String,Integer> collegeList=new HashMap<String,Integer>();
    	
    	for(int j=0;j<numberOfCollege;j++){
    		
    	System.out.println("Enter "+ (j+1) +" college name ");
    	
    	String collegeName=sc.next();
    	
    	System.out.println("Enter number of seats Available in "+ collegeName);
    	
    	int numberOfSeats=sc.nextInt();
    	
    	collegeList.put(collegeName.toUpperCase(), numberOfSeats);
    	
    	}
    	System.out.println("\nColleges which are Participating in Counseling\n");
		 
		for(Map.Entry<String,Integer>entry:collegeList.entrySet()){
             
             System.out.println(entry.getKey());
             
         }
    	System.out.println("Enter the number of students ");
    	int numberOfStudent=sc.nextInt();
    	
    	Queue studentQueue =new Queue(numberOfStudent);
    	System.out.println("\nPlease Enter Students name Rank Wise\n");
    	for(int i=0;i<numberOfStudent;i++){
    		System.out.println("Enter "+(i+1)+" Student Name --");
    		
    		String studentName=sc.next();
    		System.out.println("\nHello "+studentName+"\n");
    		System.out.println("Enter your choice of college");
    		
    		String choiceOfCollege=sc.next();
    		
    		if(collegeList.containsKey(choiceOfCollege.toUpperCase())){
    			Student student=new Student(studentName,choiceOfCollege.toUpperCase());
    			//inserting the student object in queue
        		studentQueue.enQueue(student);
        		
    		}
    		else{
    			System.out.println("\nYou entered Incorrect College name\n");
    			System.out.println("\nOnly These Colleges are Participating in Counseling\n");
    			 
    			for(Map.Entry<String,Integer>entry:collegeList.entrySet()){
                     
                     System.out.println(entry.getKey());
                     
                 }
    			System.out.println("Please Enter college name Again\n");
    			choiceOfCollege=sc.next();
    			Student student=new Student(studentName,choiceOfCollege.toUpperCase());
    			//inserting the student object in queue
    			studentQueue.enQueue(student);
    		}
    		
    	}
    	
    	System.out.println("Allocation List of students in college\n");
    	for(int i=0;i<numberOfStudent;i++){
    	
    		//dequeue the student object
    		Student student=(Student)studentQueue.deQueue();
    		int availableSeat=collegeList.get(student.studentChoice.toUpperCase());
    		
    		if(availableSeat!=0){
    			
    			student.allocatedCollege=student.studentChoice;
    			collegeList.replace(student.studentChoice.toUpperCase(), availableSeat, availableSeat-1);
    			
    		}
    		
    		System.out.println(student.studentName+" ------> "+student.allocatedCollege.toUpperCase());
    	
    	
    	}
    	
    	
    	
    
    	
    	
    	
    	
    	
    	

    	
    	
    	
    }


	
	
	
}
	
	



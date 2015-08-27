package Queue;

//Class having attributes of Student
public class Student {
	
	String studentName;
	
	String studentChoice;
	
	//variable holding the name college which will be allocate 
	String allocatedCollege="Not allocated";
	
	//Default constructor
	public Student(){
		
	}
	//parameterized constructor
	public Student(String studentName, String studentChoice) {
		
		this.studentName = studentName;
		this.studentChoice = studentChoice;
	}
	
	
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


//Base class of Student and Teacher class
class Person {
	
	private String name;
	private int uId;
	public Person(String name, int uId){
		this.name=name;
		this.uId=uId;
	}
	public Person(){	
	}
	
	public String toString(){
		return name+"	  "+uId;
	}

	
}

//child class of Person
class Student extends Person{
	
	public int sId;
	public String [] course;
	public Student(String name, int uId,int sId){
		super(name,uId);
		this.sId=sId;
		
	}
	//setter method
	public void setCourse(String course[]){
		this.course=new String[course.length];
		for(int i=0;i<course.length;i++){
			this.course[i]=course[i];
		}
	}
	//getter method
	public String [] getCourse(){
		return course;
	}
	
	public String toString(){
		return super.toString()+"	  		"+sId;
	}
	
}

//child class of Person class
class Teacher extends Person{
	
	private int tId;
	private String  subject;
	public Teacher(String name, int uId,int tId,String subject){
		super(name,uId);
		this.tId=tId;
		this.subject=subject;
	}
	
	
	public String toString(){
		return super.toString()+"		  "+tId+"		"+subject;
	}
	
}


//class Having main method
public class InheritanceImplementation{
	//Array list which hold Student objects
	public static ArrayList<Student> stud = new ArrayList<Student>();
	//Array list which hold Teacher objects
	public static ArrayList<Teacher> teach = new ArrayList<Teacher>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,subject,course[];
		int uId,sId,tId,numberCourse;
		String flag="0";
		String type="0";
		try{
		while(flag.equalsIgnoreCase("0")){
			
			System.out.println("Please Enter 1 to Insert Data for Student ");
			System.out.println("Please Enter 2 to Insert Data for Teacher\n");
		    type=sc.next();
		    if(type.equalsIgnoreCase("1")){
		    	System.out.println("Enter the name of student ");
				name=sc.next();
			
				System.out.println("Enter the UniqueId of student(Integer Value only) ");
				uId=sc.nextInt();
				System.out.println("Enter the Id of student (Integer Value only)");
				sId=sc.nextInt();
				Student student=new Student(name,uId,sId);
				
				System.out.println("Enter the number of Course for student ");
				numberCourse=sc.nextInt();
				course=new String[numberCourse];
				for(int i=0;i<numberCourse;i++){
					System.out.println("Enter the name of Course ");
					course[i]=sc.next();
				}
			
			student.setCourse(course);
			stud.add(student);
				
		    }
		    else if(type.equalsIgnoreCase("2")){
		    	
		    	System.out.println("Enter the name of teacher ");
				name=sc.next();
				
				System.out.println("Enter the UniqueId of teacher(Integer Value only)");
				uId=sc.nextInt();
				System.out.println("Enter the Id of teacher (Integer Value only)");
				tId=sc.nextInt();
				System.out.println("Enter the name of subject ");
				subject=sc.next();
				
				Teacher teacher=new Teacher(name,uId,tId,subject);
    	        
				teach.add(teacher);
		   
				
		    }
		    
		    else{
		    	System.out.println("Please Enter Valid Input");
		    }
		    System.out.println("\nIf you want to continue Application then Press 0 \nfor exit from Application Press Any key");
		    
		    if (!(sc.next().equals("0"))) {
		    	System.out.println("\nAre You Really Want to Exit From Application ? y/n");
		    	if (sc.next().equalsIgnoreCase("n")) {
		    		flag = "0";
		    	} else {
		    		flag = "1";
		    	}
	}
				
				
		
	}
		
		System.out.println("....Student Details....\n");
		Iterator<Student> studentIterator = ((ArrayList<Student>)stud).iterator();
		System.out.println("Name	uniqueId	  schoolId	  Course's Taken");
		do {
			Student studentObject = studentIterator.next();
			
			System.out.print(studentObject.toString());
			
			String cArray[]=studentObject.getCourse();
			for(int i=0;i<studentObject.getCourse().length;i++){
				
				System.out.print("  "+cArray[i]+", ");
				
			}
			System.out.println("\b");
		
		
		
		} while (studentIterator.hasNext());
		System.out.println();
		System.out.println("\n....Teacher Details....\n");
		Iterator<Teacher> teacherIterator = ((ArrayList<Teacher>)teach).iterator();
		System.out.println("Name	uniqueId	teacherId  Subject");
		do {
			Teacher teacherObject = teacherIterator.next();
			
			System.out.println(teacherObject.toString());
			
		
		} while (teacherIterator.hasNext());

	
	}
	catch(Exception e){
		System.out.println("Invalid Input");
		
	}
	
}}
package constructor;

class Student{  
    int id;  
    String name;  

//parametrised constructor
    Student(int id,String name){  
    this.id = id;  
    this.name = name;  
    
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student s1 = new Student(11,"Jignesh");  
    Student s2 = new Student(22,"Rohan");  
    s1.display();  
    s2.display();  
   }  
}  
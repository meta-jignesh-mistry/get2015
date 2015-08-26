
package socialnetwork;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Person extends Entity {
    
    long phoneNumber;
    String interest;
    
   
    public Person(long phoneNumber,String email,String name){
        super(email,name);
        this.phoneNumber=phoneNumber;
    }

    
 
 
    public void setInterest(String interest) {
        this.interest=interest;
        
    }

   
    public String getInterest() {
     
        return interest;
    }

  //method to get all  the nodes of the person in social network
 public static  HashMap<String,Person> getPersonNode() throws IOException{
	 HashMap<String,Person> personList=new HashMap<String,Person>();
        
        try {
			StringTokenizer stringTokenizer;
			FileInputStream fin = new FileInputStream(new File(".\\src\\socialnetwork\\Person.txt"));
			DataInputStream in = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String personData="";
			int i=1;
			String email="",name="",phoneNumber="",interest="";
			while ((personData = br.readLine()) != null) {
                           Person person;
				stringTokenizer = new StringTokenizer(personData,","); 
				 i=1;
				 while (stringTokenizer.hasMoreTokens()) {  
			         if(i==1){  
			        	 email=stringTokenizer.nextToken();
			         }
			         else if(i==2){
			        	 name=stringTokenizer.nextToken();
			         }
			         else if(i==3){
			        	 phoneNumber=stringTokenizer.nextToken();
			         }
			         else{
			        	 interest=stringTokenizer.nextToken();
			         }
			         
			        	i++; 
			     }
				long phoneNum= Long.parseLong(phoneNumber);
				
				
					person=new Person(phoneNum,email,name);
                    person.setInterest(interest);
					personList.put(email, person);
				
				
				
				
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        return personList;
	}
}

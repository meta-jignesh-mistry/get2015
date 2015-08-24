
package socialnetwork;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Node {
    ArrayList<Entity> personList=new ArrayList<Entity>();
    ArrayList<Entity> organisation=new ArrayList<Entity>();
    public  ArrayList<Entity> addNode() throws IOException{
        
        try {
			StringTokenizer stringTokenizer;
			FileInputStream fin = new FileInputStream(new File("C:\\Users\\Jignesh\\workspace\\socialnetwork\\src\\Person.txt"));
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
					personList.add(person);
				
				
				
				
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        return personList;
	}
	

        
    }
    
    



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


public class Organisation extends Entity {
    long phoneNumber;
    
     String placementRecord;
     public Organisation(long phoneNumber,String email,String name){
        super(email,name);
        this.phoneNumber=phoneNumber;
    }

    

   
    public void setPlacementRecord(String placementRecord) {
    this.placementRecord=placementRecord;    
    }

    
    public String getPlacementRecord() {
        
    return placementRecord;
            }

    //method to get all  the nodes of the organisation in social network
    public static  HashMap<String,Organisation> getOrganisationNode() throws IOException{
    	 
    	HashMap<String,Organisation> organisationList=new HashMap<String,Organisation>();
        
        try {
			StringTokenizer stringTokenizer;
			FileInputStream fin = new FileInputStream(new File(".\\src\\socialnetwork\\organisation.txt"));
			DataInputStream in = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String organisationData="";
			int i=1;
			String email="",name="",phoneNumber="",placementRecord="";
			while ((organisationData = br.readLine()) != null) {
				Organisation organisation;
				stringTokenizer = new StringTokenizer(organisationData,","); 
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
			        	 placementRecord=stringTokenizer.nextToken();
			         }
			         
			        	i++; 
			     }
				long phoneNum= Long.parseLong(phoneNumber);
				
				
				organisation=new Organisation(phoneNum,email,name);
				organisation.setPlacementRecord(placementRecord);
				organisationList.put(email,organisation);
				
				
				
				
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        return organisationList;
	}
	

    
}

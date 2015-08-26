
package socialnetwork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocialNetwork {
    
    
    
    public static void main(String args[]){
        HashMap<String,Person> personList=new HashMap<String,Person>();
        HashMap<String,Organisation> organisationList=new HashMap<String,Organisation>();
        
       
        try {
        	//calling method to add all person nodes in social network
           personList =Person.getPersonNode();
           //calling method to add all Organization nodes in social network
           organisationList=Organisation.getOrganisationNode();
        } catch (IOException ex) {
            Logger.getLogger(SocialNetwork.class.getName()).log(Level.SEVERE, null, ex);
        }
        String choice = "1";
        
       
        
       while(true){
    	   
    	   Scanner sc = new Scanner(System.in);
           
           System.out.println("If you are of Individual(Person) type user press 1 \nand for Organisation type press 2\n ");
           String type=sc.next();
           
        if(type.equals("1")){  
   
        System.out.println("Enter your Email Id");
        String email;
        
        email = sc.next();
        if(personList.containsKey(email)){
        Person currentPerson=null;
        Graph graph=new Graph();
       //getting current person object
        currentPerson=personList.get(email);
        System.out.println("\nWelcome "+currentPerson.name+"\n"+"Mobile No. - "+currentPerson.phoneNumber+"\n"+"your Interest is - "+currentPerson.getInterest());
                   
        while(true){
        System.out.println("\npress 1 to see your friend List");
        System.out.println("press 2 to add your friend");
        System.out.println("press 3 to remove your friend");
        System.out.println("press 4 for Sign Out");
        System.out.println("press 5 exit the application");
        			choice=sc.next();
                    if(choice.equals("1")||choice.equals("2")||choice.equals("3")||choice.equals("4")||choice.equals("5")){
                    
                    if(choice.equals("1")){
                    	
                    	//showing list of all friends
                       
                    if(currentPerson.friends.isEmpty()){
                               System.out.println("Sorry !! You Don't have any friend in your Friend list\n");
                           }
                     else{
                         System.out.println("\nYour Friend List ---");
                         int p=0;
                       for(Map.Entry<String,String>entry:currentPerson.friends.entrySet()){
                           
                           System.out.println(++p+" "+entry.getKey());
                           
                       }
                     }
                   }
                   if(choice.equals("2")){
                	   
                    System.out.println("please enter your friends Email ID");
                    String friendEmail=sc.next();
                    if(currentPerson.friends.containsKey(friendEmail)){
                    	System.out.println("\nYou Already have the same friend");
                    }
                    else{
                    if(personList.containsKey(friendEmail)){ 
                    Person friend=personList.get(friendEmail);
                    //calling method to add connection between the persons
                    graph.addConnection(currentPerson, friend);
                    }
                    else if(organisationList.containsKey(friendEmail)){
                    	Organisation friend=organisationList.get(friendEmail);
                        //calling method to add connection between the persons
                        graph.addConnection(currentPerson,friend);
                    	
                    }
                    else{
                        System.out.println("\nYou entered Incorrect Email Id !!");
                    }
                    }
                   }
                   
                   if(choice.equals("3")){
                       
                    System.out.println("please enter your frinds Email ID whom you want to remove");
                    String friendEmail=sc.next();
                    if(personList.containsKey(friendEmail)){
                    if(currentPerson.friends.containsKey(friendEmail)){
                     Person friendToRemove=personList.get(friendEmail);
                  //calling method to remove connection between the persons
                    graph.removeConnection(currentPerson, friendToRemove);
                    }
                   }
                    else if(organisationList.containsKey(friendEmail)){
                	 
                	   Organisation friendToRemove=organisationList.get(friendEmail);
                	   graph.removeConnection(currentPerson, friendToRemove);
                   }
                    else{
                        System.out.println("\nYou entered Incorrect Email Id !!");
                    }
                   }
                   
                   if(choice.equals("4")){
                      break;
                   }
                   if(choice.equals("5")){
                       System.exit(0);
                   }
                   }
                   else{
                	   System.out.println("Please choose correct option !");
                   }
                    
                }
        
       }
       else{
            System.out.println("please enter Valid Email Id");
       }
       }
        else if(type.equals("2")){
        	System.out.println("Enter your Email Id");
            String email;
            
            email = sc.next();
            if(organisationList.containsKey(email)){
            Organisation currentOrganisation=null;
            Graph graph=new Graph();
           //getting current organization object
            currentOrganisation=organisationList.get(email);
            System.out.println("\nWelcome "+currentOrganisation.name+"\n"+"Contact No. - "+currentOrganisation.phoneNumber+"\n"+"Campus Placement is  "+currentOrganisation.getPlacementRecord());
                       
            while(true){
            System.out.println("\npress 1 to see your Organisation Member List");
            System.out.println("press 2 to add any Member");
            System.out.println("press 3 to remove any Member");
            System.out.println("press 4 for Sign Out");
            System.out.println("press 5 exit the application");
            			choice=sc.next();
                        if(choice.equals("1")||choice.equals("2")||choice.equals("3")||choice.equals("4")||choice.equals("5")){
                        
                        if(choice.equals("1")){
                        	//showing list of all members
                        	 if(currentOrganisation.friends.isEmpty()){
                                   System.out.println("Sorry !! You Don't have any member in your Member list\n");
                               }
                         else{
                             System.out.println("\nYour Organisation Member List ---");
                             int p=0;
                           for(Map.Entry<String,String>entry:currentOrganisation.friends.entrySet()){
                               
                               System.out.println(++p+" "+entry.getKey());
                               
                           }
                         }
                       }
                       if(choice.equals("2")){
                        System.out.println("please enter your Member's Email ID");
                        String friendEmail=sc.next();
                        if(currentOrganisation.friends.containsKey(friendEmail)){
                        	System.out.println("\nYou Already have the same Member");
                        }
                        else{
                        if(organisationList.containsKey(friendEmail)){ 
                        Organisation member=organisationList.get(friendEmail);
                        //calling method to add connection between the members
                        graph.addConnection(currentOrganisation, member);
                        }
                        else if(personList.containsKey(friendEmail)){
                        	Person member=personList.get(friendEmail);
                            //calling method to add connection between the members
                            graph.addConnection(currentOrganisation, member);
                        }
                        else{
                        
                            System.out.println("\nYou entered Incorrect Email Id !!");
                        }
                       }
                       }
                       
                       
                       if(choice.equals("3")){
                           
                        System.out.println("please enter your Member Email ID whom you want to remove");
                        String friendEmail=sc.next();
                        if(organisationList.containsKey(friendEmail)){
                        if(currentOrganisation.friends.containsKey(friendEmail)){
                         Organisation memberToRemove=organisationList.get(friendEmail);
                      //calling method to remove connection between the organization
                        graph.removeConnection(currentOrganisation, memberToRemove);
                        }
                       }
                        else if(personList.containsKey(friendEmail)){
                    	 
                    	   Person memberToRemove=personList.get(friendEmail);
                    	   graph.removeConnection(currentOrganisation, memberToRemove);
                       }
                        else{
                            System.out.println("\nYou entered Incorrect Email Id !!");
                        }
                       }
                       
                       if(choice.equals("4")){
                          break;
                       }
                       if(choice.equals("5")){
                           System.exit(0);
                       }
                       }
                       else{
                    	   System.out.println("Please choose correct option !");
                       }
                        
                    }
            
           }
           else{
                System.out.println("please enter Valid Email Id");
           }
           
        	
        	
        }
        else{
        	System.out.println("\nInvalid Input either choose 1 or 2\n");
        }
                    
             
       }                   
                        
}
}

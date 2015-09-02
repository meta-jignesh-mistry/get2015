package ConcordanceOfString;


import java.util.HashMap;
import java.util.HashSet;

import java.util.Set;


public class ConcordanceOfStringDemo {
   public static HashMap<Character,Set<Integer>> concordance=new HashMap<Character,Set<Integer>>();
    
    public static void main(String args[]){
    
    //input string array as Console input
    String arg[]={"hello jignesh","hey"};   
   
      
    System.out.println(new ConcordanceOfString().findConcordance(arg));
    
   }
    
    
  }

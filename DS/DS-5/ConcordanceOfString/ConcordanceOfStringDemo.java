package ConcordanceOfString;


import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;


public class ConcordanceOfStringDemo {
   public static Hashtable<Character,Set<Integer>> concordance=new Hashtable<Character,Set<Integer>>();
    
    public static void main(String args[]){
    
    //input string array as Console input
    String arg[]={"hello jignesh","hey"};   
   
      
    System.out.println(new ConcordanceOfString().findConcordance(arg));
    
   }
    
    
  }

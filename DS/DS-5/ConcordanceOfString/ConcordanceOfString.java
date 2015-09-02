package ConcordanceOfString;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;


public class ConcordanceOfString {

	
	public  HashMap<Character,Set<Integer>> concordance=new HashMap<Character,Set<Integer>>();
	
	//method to find concordance of character in string array and return hash map variable
	public HashMap<Character,Set<Integer>> findConcordance(String arg[]){
		 int length=arg.length;
		    int index=0;
		    
		    for(int i=0;i<length;i++){
		        
		        for(int j=0;j<arg[i].length();j++){
		            
		        char character=arg[i].charAt(j);  
		        if(character!=32){
		        if(!(concordance.containsKey(character))){
		            
		            Set<Integer> indexValue=new HashSet<Integer>();
		            indexValue.add(index);
		            index++;
		            concordance.put(character,indexValue);
		            
		        }
		        else{
		           
		            Set<Integer> indexValue=concordance.get(character);
		            indexValue.add(index);
		            index++;
		            concordance.put(character,indexValue);
		        }
		        }else{
		        	index++;
		        }
		        
		    } 
		        
		        
		 }
		   
		    return concordance;
		
		
	}
	
	
}

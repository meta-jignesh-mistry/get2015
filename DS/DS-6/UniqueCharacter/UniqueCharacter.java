package UniqueCharacter;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {
	
	
	//Hash map having key as String and values as Set of unique character
		
	HashMap<String,Set<Character>> stringMap=new HashMap<String, Set<Character>>();
	
	//method to find unique characters in String
	public Set<Character> findUniqueCharacter(String string){
	
	
	
	//if string present in hash map it will simply return its unique character set(i.e Present in cache)
	if(stringMap.containsKey(string)){
		
		System.out.println("\nFind Result directly from Cache Memory");
		return stringMap.get(string);	
		
	}
	else{
		/*if String is not present in hash map first it will count,number of unique characters in string 
		 * then add that unique character set to hashmap Corrosponding to Key value of String
		 * 
		 * i.e. Set does not allow duplicate elements
		 * 
		 */
		
		Set<Character> set=new LinkedHashSet<Character>(); 
	
		for(int i=0;i<string.length();i++){
			
			
			if(!(string.charAt(i)==32)){
			set.add(string.charAt(i));
			}
			
			
		}
		
		stringMap.put(string,set);
		
		System.out.println("\nwas not available in Cache..Now Added");
		
		return set;
	}

}
}

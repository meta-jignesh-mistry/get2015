package SortedLinkList;

import java.util.LinkedList;

public class LinkList {
	    //create linkedList
		public static LinkedList <Integer> list = new LinkedList<Integer>();   
		int size = 0; 
		
		//method store element at the appropriate position 
		public static void checkIndex(int index, int element)
		{
			if(index==list.size())
			{
				list.add(element);
			}
			else if(((int)list.get(index) < element)&&((index+1)<=list.size())) {
				checkIndex(index+1, element);
			}	
			else {
				list.add(index, element);
			}	
		}
		//return size of linked list
		public int size(){
			return list.size();
		}
	
}

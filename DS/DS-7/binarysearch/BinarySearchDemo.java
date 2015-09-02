package binarysearch;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchDemo {
	public static void main(String args[]){
	 Scanner scan = new Scanner(System.in);
	 String regex="[0-9]+";
	 
	 int sizeOfArray;
	 String size;
	 
	 do{
		 System.out.println("Enter Total no. of Elements Of Array");
	     size=scan.nextLine();
	     
	   }while(!size.matches(regex));
	 
	 sizeOfArray=Integer.parseInt(size);
	 //list will contain all elements
	 List<Integer> listOfElements=new LinkedList<Integer>();
	 
	 int array[]=new int[sizeOfArray];
	 
	 System.out.println("Enter Elements of Array--");
	 
	 String newElement;
	 int element;
	 
	 for(int i=0;i<sizeOfArray;i++)
	 {
	 do{
			System.out.println("Enter element "+(i+1));
			newElement=scan.nextLine(); 
		}while(!newElement.matches(regex));
	 
	    element=Integer.parseInt(newElement);
	    
	    listOfElements.add(element);
	 }
	 //sorting the list
	 Collections.sort(listOfElements);
	 
	 for(int i=0;i<sizeOfArray;i++){
		 array[i]=listOfElements.get(i);
	 }
	
	 
	 int searchElement;
	 
	 String searchElement1;
	 
	 int low=0;
	 
	 int high=sizeOfArray-1;
	 
	 int arraySize=sizeOfArray;
	 
	 BinarySearch binarySearch=new BinarySearch();
	 do{
		 System.out.println("Enter element to be searched");
		 searchElement1=scan.nextLine();
	 }while(!searchElement1.matches(regex));
	 
	 searchElement = Integer.parseInt(searchElement1);
	 //method will return left most index value of element if element present otherwise it will return -1
	 int leftMostIndex=binarySearch.findLeftMostOccurance(array,arraySize,low,high,searchElement);
	 
	 if(leftMostIndex==-1){
		 //if element is not present
		 System.out.println("\nElement not Found\n");
	 }
	 else{
		 System.out.println("\nLeftmost position of element in array : "+leftMostIndex);
	 }

}
}
package SortingSystem;

import java.util.Scanner;

public class SortSystemDemo {

	
public static void main(String args[]){
	
	int noOfElements=0;
	int[] sortedArray;
	Scanner sc=new Scanner(System.in);
	String regexForPositiveInt="[1-9][0-9]*";
	String regexForAllInteger="-?[0-9]{0,10}";
	while(true){
		
		System.out.println("\nPress 1 to Sort any Integer List");
		System.out.println("Press 2 Exit");
		
		String choice=sc.next();
		switch(choice){
		case "1":
			
			String size;
			 do{
				 System.out.println("Enter Number of elements you want to enter");
				 size=sc.next();
			     if(!size.matches(regexForPositiveInt)){
			    	 System.out.println("Please enter valid number\n");
			     }
			     
			   }while(!size.matches(regexForPositiveInt));
			
			 noOfElements=Integer.parseInt(size);
			//creating number array
			int[] arrayOfNumber=new int[noOfElements];
			
			for(int i=0;i<noOfElements;i++){
			
			
			
			
				String element=String.valueOf(arrayOfNumber[i]);	
			
			 do{
				 System.out.println("Enter "+(i+1)+" Element");
				
				 element=sc.next();
			     if(!element.matches(regexForAllInteger)){
			    	 System.out.println("Please enter valid Integer\n");
			     }
			     
			   }while(!element.matches(regexForAllInteger));
			
			 arrayOfNumber[i]=Integer.parseInt(element);
			
			}
		
			System.out.println("\nPress 1 for Comparison Sorting\nPress 2 for Linear Sorting");
			String sortType=sc.next();
			switch(sortType){
			case "1":
					if(noOfElements<=10){
					
					//calling Bubble Sort if Total number of Elements are less or equal to 10	
					
					sortedArray=BubbleSort.bubbleSort(arrayOfNumber);
					System.out.println("\nCalling Bubble Sort for Sorting\n");
					for(int i=0;i<noOfElements;i++){
						System.out.print("  "+sortedArray[i]);
						
					}
					System.out.println("");	
					}
					else{
						QuickSort quickSort=new QuickSort();
						
						//calling Quick sort if total number of elements are more than 10
						
						quickSort.quickSort(arrayOfNumber, 0,arrayOfNumber.length-1);
						System.out.println("\nCalling Quick Sort for Sorting\n");
						for(int i=0;i<noOfElements;i++){
							System.out.print("  "+arrayOfNumber[i]);
						}
							
						System.out.println("");
					}
					break;
			case "2":
				
				int max=0;
				boolean flag=true;
				for(int i=0;i<noOfElements;i++){
					if(arrayOfNumber[i]<0){
						flag=false;
					}
					if(arrayOfNumber[i]>max){
						
						max=arrayOfNumber[i];
						
					}
					
				}
				
				if((max/100)>=1){
					
					//Calling Radix Sort if  large element(more than 2 digit) is present
					
					sortedArray=RadixSort.radixSort(arrayOfNumber);
					System.out.println("\nCalling Radix Sort for Sorting\n");
					
					for(int i=0;i<noOfElements;i++){
						System.out.print("  "+sortedArray[i]);
					}
						
						}
					else{
						if(flag==true){
							
						//Calling Counting Sort if elements are only 2 digits and all elements are positive
						
						sortedArray=CountingSort.countingSorting(arrayOfNumber);
						
						System.out.println("\nCalling Count Sort for Sorting\n");
						for(int i=0;i<noOfElements;i++){
							System.out.print("  "+sortedArray[i]);
						}
					}
						else{
							
							
							System.out.println("\nCounting Sort can't Apply because Elements Contain Negative values\n");
							
							//calling Radix sort if more than 2 digit element present but containing negative element also
							
							sortedArray=RadixSort.radixSort(arrayOfNumber);
							System.out.println("\nCalling Radix Sort for Sorting\n");
							
							for(int i=0;i<noOfElements;i++){
								System.out.print("  "+sortedArray[i]);
							}
						
						}
					}
				
				
				break;
			default:
				System.out.println("Please Enter valid Input");
			
			}
			break;
		case "2":
			 System.exit(0);
		
		default:
			System.out.println("Invalid Choice");
			
		}
		
		
		
		
		
	}
	
	
	
}
	
	
}

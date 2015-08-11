import java.util.Scanner;


public class BinarySearch {

	int find=0;
	
	/* function to find number using binary search,
	   here low is Lower Index and high is Higher Index of array
	   function will return 1 if number present otherwise 0
	*/
	
	public int binarySearch(int low,int high,int[] array,int number){
		
		int mid= (low+high)/2;
		
		while(high>=low){
			
		
		if(array[mid]==number){
			
			find =1;
			
			
		}
		if(number>array[mid]){
			
			return binarySearch(mid+1,high,array,number);
		}
		else{
			return binarySearch(low,mid-1,array,number);
		}
		
	}
		return find;
		
	}
	
  public static void main(String args[]){
	  
	  BinarySearch object=new BinarySearch();
	  int[] array=new int[25];
	  
	  System.out.println("Enter the length of Array");
	  
	  Scanner sc=new Scanner(System.in);
	  
	  //here exception may occur
	  
	  try{
	  int n=sc.nextInt();
	  
	  System.out.println("Enter the numbers");
	  
	  for(int i=0;i<n;i++){
		  array[i]=sc.nextInt();
	  }
	  
	  System.out.println("Enter the number you want  to search");
	  int number=sc.nextInt();
	  int low=0;
	  int high=(array.length)-1;
	  
	  int found=object.binarySearch(low,high,array,number);
	  if(found==1){
		  
		  System.out.println("Number found");
		  
	  }
	  else{
		  System.out.println("Number Not found");
	  }
	 } 
	  //handling exception
	  
	  catch(Exception e){
		  System.out.println("Invalid input");
		  
	  }
	  
	  sc.close();
  }
	
	
	
	
	
	
	
}

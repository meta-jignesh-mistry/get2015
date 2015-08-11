import java.util.Scanner;


public class LinearSearch {
	
	
	
	
	int position=0;
	int find=0;
	
	
	/*function to find the number in array 
	  and will return 1 if number is present
	  otherwise 0
	 */ 
	 
	public int findNumber(int array[],int number){
	
		
		
		if(position<=(array.length-1)){
			
			if(array[position]==number){
				
				position++;
				find= 1;
				
			}
			position++;
			return this.findNumber(array,number);
		}
		else{
				return find;
			}
				
			
			
		}
	
	
	public static void main(String args[]){
		int n;
		
		LinearSearch object=new LinearSearch();
		
		System.out.println("enter length of array");
		
		Scanner sc=new Scanner(System.in);
		
		//here exception may occur
		try{
		n=sc.nextInt();
		
		int[] Array=new int[n];
		
		System.out.println("enter the elements");
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<Array.length;i++){
			
			Array[i]=scan.nextInt();
		}
		
		System.out.println("enter the number You want to find in the Array");
		
		Scanner scan1=new Scanner(System.in);
		
		int number=scan1.nextInt();
		
		if(object.findNumber(Array, number)==1){
			
		System.out.println(number+" is present in the Array ");
			
		}
		else{
			System.out.println(number+" is not present in the Array ");
		}
	}//handling of exception
	catch(Exception e){
		
		System.out.println("Invalid input");
		
	}
		
		
	}
		
		
		
		
		
		
		
		
	}
	
	



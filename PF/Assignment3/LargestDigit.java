import java.util.Scanner;


public class LargestDigit {
	
	
	 
   	long Max=0;
   	
   	//function to find the largest digit in the number
   	
	 public long largestDigit(long x){
		 //base case 
		 if(x/10 ==0){
			 
			 return Max;
		 }
		 else{
			 //recursive case
			 long temp = x%10 ;
			 
			 if(temp>Max){
				 
				 Max=temp;
				 
				 	 
			 }
			 return this.largestDigit(x/10);
		 
		 }
		  
		 
	 }
		 
		 
	public static void main(String args[]){
		
		
		int number=0;
		LargestDigit object=new LargestDigit();
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		
		//Here Exception may occur
		try{
			
		number=sc.nextInt();
		
		long large=object.largestDigit(number);
		System.out.println("maximum is  "+large);
		}
		
		//handling the Exception
		catch(Exception e){
			System.out.println("Invalid input");
		}
		
		 
		 
	 }
	
	
	
}

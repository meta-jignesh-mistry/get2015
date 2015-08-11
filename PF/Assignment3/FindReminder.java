import java.util.Scanner;


//function to find remainder

public class FindReminder {

	public int findRem(int divident,int divisor){
		
		
		if(divisor==0){
			return -1;
		}
		
		if(divident>=divisor){
			
			
			return findRem((divident-divisor) , divisor);
			
		}
		else{
			return divident;
		}
		
		
		
		
	}
	
	
	public static void main(String args[]){
		int divident=0;
		int divisor=0;
		
		FindReminder object=new FindReminder();
		
		Scanner sc=new Scanner(System.in);
		 //here exception can generate
		try{
		 System.out.println("enter the divident");
		 divident=sc.nextInt();
		 
		 System.out.println("enter the divisor");
		 divisor=sc.nextInt();
		 
		 //calling of function
		 if(object.findRem(divident,divisor)==-1){
			 System.out.println("Divisor can't be zero");
		 }
		 else{
		 System.out.println("remainder is "+object.findRem(divident,divisor));
		}
		 }
		//handling of exception
		catch(Exception e){
			System.out.println("Invalid Input");
			
		}
		
		
		
		
	}
	
	
}

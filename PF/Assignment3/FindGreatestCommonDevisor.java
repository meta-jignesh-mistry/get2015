import java.util.Scanner;


public class FindGreatestCommonDevisor {
	
	int getGcd(int number1, int number2){
		
		//if number are equal then return any one number of them 
		if(number1==number2){
			return number1;
		}
		
		/*if number1 is greater then call getGcd 
		and pass difference between number instead of number1 */
		
		else if(number1>number2){
			return getGcd(number1-number2,number2);
		}
		
		/*if number2 is greater then call getGcd 
		and pass difference between number instead of number2 */
		
		else if(number2>number1){
			return getGcd(number1,number2-number1);
		}
		else{
			
			//if number1 is zero then return number2
			
			if(number1==0)
				return number2;
			//if number2 is zero then return number1
			
			else if(number2==0)
				return number1;
			else
				return -1;
			
		}
	}
	public static void main(String[] args) {
		
		FindGreatestCommonDevisor object=new FindGreatestCommonDevisor ();
		int firstnumber=0;
		int secondnumber=0;
		Scanner sc=new Scanner(System.in);
		 //here exception can generate
		try{
		 System.out.println("enter the first number");
		 firstnumber=sc.nextInt();
		 
		 System.out.println("enter the second number");
		 secondnumber=sc.nextInt();
		 
		 //calling of function
		 
		 System.out.println("gcd is "+object.getGcd(firstnumber, secondnumber));
		}
		//handling of exception
		catch(Exception e){
			System.out.println("Invalid Input");
			
		}
	}

}

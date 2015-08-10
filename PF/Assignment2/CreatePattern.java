import java.util.Scanner;


public class CreatePattern {

	
	    //function for creating space string row wise and return  space string
		
	    public static String spaces(int row, int n){    
		
		String space_string="";
		
		for(int i = n;i > n-row; i--){
		
                space_string=space_string+" ";
			
		}
	
		return space_string;    
	}
	
	//function for creating number string row wise and return number string
	    
	public static String numbers(int row,int n){  
		String number_string="";
		int counter=0;
		
		for(int i=0 ;i<n-row; i++){

			
                number_string=number_string+(++counter);
			
		}
		 
		
		 return number_string;            
	}
	
	//function for printing whole pattern
	
	 public String[] fullPattern(int n){    
         int row=0;
         
         String[] output_string =new String[n];
         
		 for(int i = 0;i < n; i++){
			 
			//Storing array containing spaces and number Row-wise
			
			 output_string[i]=CreatePattern.spaces(row, n)+CreatePattern.numbers(row, n);   
			 row++; 
		 }
		 
		 return output_string;
		 
		 
		 
	 }
	
	
	
	public static void main(String args[]){
		
		int N=0;
		CreatePattern a=new CreatePattern();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pattern Value(N)");
		try{
		N=sc.nextInt();
		
		}
		catch(Exception e ){
			
			System.out.println("Invalid Input -- input should be +ive integer");
					
			}

        
		 try{		
		String[] result_string_array=a.fullPattern(N);  
		
		
		for(int i=0; i<result_string_array.length; i++){                 
			
			System.out.println(result_string_array[i]);
		}
		
		
		 }
		 catch(java.lang.NegativeArraySizeException e){
			 
			 System.out.println("Invalid Input -- Negative integer values are not allow");
				 
			 
		 }
	}
	
	}


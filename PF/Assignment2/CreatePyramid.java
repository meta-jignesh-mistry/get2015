import java.util.Scanner;

public class CreatePyramid {

	//function for creating space string row wise and return  space string
	
	public static String spaces(int row,int n){      
		
		String space_string="";
		for(int i=0;i<n-row;i++){
			space_string=space_string+" ";
			
		}
		
		return space_string;                    
		
	}
	
	
	
	//function for creating number string row wise and return number string
	
	public static String numbers(int row,int n){         
		
		String number_string="";
		int counter=0;
		for(int i=0;i<row;i++){
			number_string=number_string+(++counter);
		}
		for(int j=0;j<row-1;j++){
			
			number_string=number_string+(--counter);
		}
		
		return number_string;    
		
		
	}
	
	//function for printing whole Pyramid
	
	public String[] fullPyramid(int n){              
         
		 int row=1;
        
         String[] output_string_array =new String[n];
        
		 for(int i=0;i<n;i++){
			 
			//String array containing spaces and number Row-wise
			 
			 output_string_array[i]=CreatePyramid.spaces(row, n)+CreatePyramid.numbers(row, n);  
			 row++; 
		 }
		 
		 return output_string_array;
		 
		 
		 
	 }
	
	
	
	
	public static void main(String args[]){
		int N=0;
		CreatePyramid a=new CreatePyramid();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pyramid Value(N)");
		
		try{
			N=sc.nextInt();
			
			}
        catch(Exception e ){
			
			System.out.println("Invalid Input -- input should be +ive integer");
					
			}
		
		try{
		String[] result_string_array=a.fullPyramid(N);    
		
				
		 //loop creating half Pyramid
		
		for(int i=0;i<result_string_array.length;i++){    
			
			System.out.println(result_string_array[i]);

		
	}
		//loop creating other half of pyramid
		
		for(int j=(result_string_array.length)-2;j>=0;j--)  
		{
			System.out.println(result_string_array[j]);
				
		}
	
	}
		catch(java.lang.NegativeArraySizeException e){
			System.out.println("Invalid Input -- input should be +ive integer");
		}
			
	
}
}
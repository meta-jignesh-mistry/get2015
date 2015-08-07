public class CreatePyramid {

	
	public static String spaces(int row,int n){      //function for creating space string row wise
		
		String space_string="";
		for(int i=0;i<n-row;i++){
			space_string=space_string+" ";
			
		}
		
		return space_string;                    //return  space string
		
	}
	
	
	
	
	public static String numbers(int row,int n){         //function for creating number string row wise
		
		String number_string="";
		int counter=0;
		for(int i=0;i<row;i++){
			number_string=number_string+(++counter);
		}
		for(int j=0;j<row-1;j++){
			
			number_string=number_string+(--counter);
		}
		
		return number_string;    //return number string
		
		
	}
	
	
	public String[] fullPyramid(int n){              //function for printing whole Pyramid
        int row=1;
        
        String[] output_string_array =new String[n];
        
		 for(int i=0;i<n;i++){
			 
			 output_string_array[i]=CreatePyramid.spaces(row, n)+CreatePyramid.numbers(row, n);  //String array containing spaces and number Row-wise
			 row++; 
		 }
		 
		 return output_string_array;
		 
		 
		 
	 }
	
	
	
	
	public static void main(String args[]){
		
		CreatePyramid a=new CreatePyramid();
		
		String[] result_string_array=a.fullPyramid(3);     // Pattern for N=3 ,Value can be other also
		
		for(int i=0;i<result_string_array.length;i++){     //loop creating half Pyramid
			
			System.out.println(result_string_array[i]);

		
	}
		for(int j=(result_string_array.length)-1;j>=0;j--)  //loop creating other half of pyramid
		{
			System.out.println(result_string_array[j]);
				
		}
	
	
	
}
}
import java.util.Scanner;


public class QuickSort {
	
	//this method return the pivot element   
	
	int createPartition (int [] array,int left,int right){
		
		int pivot=array[left];
		
		while(left<=right){
			//increase the value of left if array[left] is less then pivot
			while(array[left]<pivot){
				left++;
			}
			
			//decrease the value of left if array[right] is greater then pivot
			while(array[right]>pivot){
				right--;
			}
			
			//swap the values of left and right position of array
			if(left<=right){
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
				right--;
			}
		}
		return left;
	}
	
	//this method divide the array into lower bound to pivot-1 and pivot to upper bound
	
	void quickSort (int [] array,int lowerBound,int upperBound){
		
		
		
		//get the pivot element 
		
		int pivot=createPartition(array,lowerBound,upperBound);	
		
		//call the method quick sort for the first half lower bound to pivot-1
		
		if(lowerBound < pivot-1){
			quickSort (array,lowerBound,pivot-1);
		}
		//call the method quick sort for the first half pivot to upper bound
		
		if(upperBound>pivot){
			quickSort (array,pivot,upperBound);
		}
	}
	
	public static void main(String[] args) {
		
		  QuickSort object=new QuickSort();
		  
		  
		  
		  System.out.println("Enter the length of Array");
		  
		  Scanner sc=new Scanner(System.in);
		  
		  //here exception may occur
		  
		  try{
		  
			   int n=sc.nextInt();
			   int[] array=new int[n];
			   System.out.println("Enter the numbers");
		  
			   for(int i=0;i<n;i++){
				   array[i]=sc.nextInt();
			   }
			   //calling the quickSort method
			   object.quickSort(array,0,array.length-1);
		
			   for(int i=0;i<array.length;i++){
				   System.out.print(" "+array[i]);
			   }
		  
		  } catch(Exception e){
			  
			  System.out.println("Invalid Input");
			  
		  }

	}
}

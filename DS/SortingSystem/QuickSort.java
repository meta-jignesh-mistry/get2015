package SortingSystem;


public class QuickSort {

	
		// method return the pivot element   
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
		
		//method divide the array into lower bound to pivot-1 and pivot to upper bound
		
		void quickSort (int [] array,int lowerBound,int upperBound){
			
			
			
			//get the pivot element 
			
			int pivot=createPartition(array,lowerBound,upperBound);	
			
			//calling the method quick sort for the first half lower bound to pivot-1
			
			if(lowerBound < pivot-1){
				quickSort (array,lowerBound,pivot-1);
			}
			//calling the method quick sort for the first half pivot to upper bound
			
			if(upperBound>pivot){
				quickSort (array,pivot,upperBound);
			}
	

}
}
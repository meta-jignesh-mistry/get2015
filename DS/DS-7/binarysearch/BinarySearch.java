package binarysearch;


public class BinarySearch {
	
	private int mid;
	private int leftMostIndex;
	
	public BinarySearch() {

	}
	
	//method will return index value of left most element 
	public int findLeftMostOccurrence(int[] array,int size, int low, int high, int searchElement) {
		
			if(high<0 || low >size-1){
				return -1;
			}
			
			if(low<=high)
			{	//calculating mid value
				mid=(low+high)/2;
				//if mid element is small than search element
				if(searchElement<array[mid])
				{
					high=mid-1;
					return findLeftMostOccurrence(array, size,low,high,searchElement);
				}//if mid element is greater than search element
				else if(searchElement>array[mid])
				{
					low=mid+1;
					return findLeftMostOccurrence(array, size,low,high,searchElement);
				}
				
				else 
				{
					leftMostIndex=mid;
					//again checking from low to leftMostIndex-1 to find left most index of element
					findLeftMostOccurrence(array, size, low, mid-1, searchElement);
					return leftMostIndex;
				} 
				
				
			}
			
			else{
				//if element not found
				return -1;
			}
			
		
		
	}


}

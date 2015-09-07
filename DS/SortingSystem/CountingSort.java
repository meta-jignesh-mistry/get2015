package SortingSystem;

public class CountingSort {
	
	//return sorted Array After Counting Sort
	public static int[] countingSorting(int[] array ) {
		int maxElement = 0;
		for(int i = 0 ; i<array.length ; i++) {
			if(array[i]>maxElement) {
				maxElement = array[i];
			}
		}
		//intializing the counting array to maxElement+1
		int [] countingArray = new int[maxElement+1];
		
		//setting the counter value in countingArray according to repeatation of number
		for(int i = 0; i<array.length; i++) {
			countingArray[array[i]]++;
		}
		int k = 0;
		//storing the number in final output array from countingArray
		for(int i = 0;i <= maxElement; i++){
			while(countingArray[i]!=0){
				array[k] = i;
				countingArray[i]--;
				k++;
			}
		}
		return array;
	}

}

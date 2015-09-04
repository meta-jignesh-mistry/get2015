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
		int [] countingArray = new int[maxElement+1];
		
		for(int i = 0; i<array.length; i++) {
			countingArray[array[i]]++;
		}
		int k = 0;
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

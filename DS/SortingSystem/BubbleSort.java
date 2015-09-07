package SortingSystem;

public class BubbleSort {

//return sorted array After Bubble Sort
public static int[] bubbleSort(int[] array){
	
	int length=array.length;
	
    for (int i = 0; i < (length - 1); i++) {
      for (int j= 0; j < length - i - 1; j++) {
        if (array[j] > array[j+1]) 
        {
          int temp = array[j]; //swapping the number if array[j] > array[j+1]
          array[j]   = array[j+1];
          array[j+1] =temp;
        }
      }
    }
 
	
	return array;	
}
	
}

package OfficePrinter;

import java.util.Scanner;

// Class HeapSort  perform the sorting
public class HeapSort { 
	
    private static int N;
    
    //method to sort the array using heap sort
    public static void sort(Node arr[]) {       
        heapify(arr);        
        for (int i = N; i > 0; i--) {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }   
    
    // Method to create a heap    
    public static void heapify(Node arr[]) {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    
    // method to swap largest element in heap         
    public static void maxheap(Node arr[], int i) { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left].priority > arr[i].priority)
            max = left;
        if (right <= N && arr[right].priority > arr[max].priority)        
            max = right;
 
        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    
    // method to swap two numbers in heap
    public static void swap(Node arr[], int i, int j) {
        Node tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    
    
   
}

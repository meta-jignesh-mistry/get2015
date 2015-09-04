package SortingSystem;
import java.util.ArrayList;
public class RadixSort {

public static int[] radixSort(int[] array) {
	
	  // declare and initialize bucket[]
	  ArrayList<Integer>[] bucket = new ArrayList[10];
	  //bucket for negative values
	  ArrayList<Integer> negativeBucket=new ArrayList<Integer>();
	//bucket for positive values
	  ArrayList<Integer> positveBucket=new ArrayList<Integer>();
	//bucket for output sorted values
	  ArrayList<Integer> outputBucket=new ArrayList<Integer>();
	  
	  
	  for(int i=0;i<array.length;i++){
		  if(array[i]<0){
			  negativeBucket.add(array[i]);
		   }
		  else{
			  
			  positveBucket.add(array[i]);
		  }
		 }
	  
	  int positiveArray[]=new int[positveBucket.size()];
	  for(int i=0;i<positiveArray.length;i++){
		  
		 positiveArray[i]=positveBucket.get(i);
		 
	  }
	  int negativeArray[]=new int[negativeBucket.size()];
	  for(int i=0;i<negativeArray.length;i++){
		  
		 negativeArray[i]=negativeBucket.get(i);
		 
	  }
	  	int length=negativeArray.length;
		for(int i=0;i<length;i++){
	            for(int j=i;j<length;j++){
	                if(negativeArray[i]>negativeArray[j]){
			
	                	int temp=negativeArray[i];
	                	negativeArray[i]=negativeArray[j];
	                	negativeArray[j]=temp;
	                }
	            }
		}
	
	  for (int i = 0; i < bucket.length; i++) {
	    bucket[i] = new ArrayList<Integer>();
	  }
	 // sorting through Bucket/Radix Sort
	  boolean maxLength = false;
	  int tmp = -1, placement = 1;
	  
	  while (!maxLength) {
	    
		  maxLength = true;
	    // split input between lists
	    for (Integer i : positiveArray) {
	      
	      tmp = i / placement;
	      bucket[tmp % 10].add(i);
	      if (maxLength && tmp > 0) {
	        maxLength = false;
	      
	      }
	    }
	    // empty lists into input array
	    int a = 0;
	    for (int b = 0; b < 10; b++) {
	      for (Integer i : bucket[b]) {
	    	  positiveArray[a++] = i;
	      }
	      bucket[b].clear();
	    }
	    //move to next digit position
	    placement *= 10;
	  }
	  for(int i=0;i<negativeArray.length;i++){
		  
		  outputBucket.add(negativeArray[i]);
		  
	  }
	  for(int i=0;i<positiveArray.length;i++){
		  
		  outputBucket.add(positiveArray[i]);
		  
	  }
	  int[] outputArray=new int[outputBucket.size()];
	  for(int i=0;i<outputBucket.size();i++){
		  
		  outputArray[i]=outputBucket.get(i);
	  }
	  //returning the output array
	 return outputArray;
	}

}

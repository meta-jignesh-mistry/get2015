
public class SortingOfTwoArray {

	int[] join(int a[], int asize, int b[], int bsize, int c[]){    //function to join two array with sorting
		
		int apointer=0,bpointer=0;
		
		for(int i=0;i<(asize+bsize);i++)
		{
			if(apointer!=asize && a[apointer]<b[bpointer]){
				c[i]=a[apointer];
				apointer++;
			}
			
			else{
				if(bpointer!=bsize){
					c[i]=b[bpointer];
					bpointer++;
				}
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		SortingOfTwoArray object=new SortingOfTwoArray();
		int array1[]={1,2,3,4,5};     //input array-1
		
		int array2[]={6,7,8,9,10};     //input array-2
		
		int asize=array1.length,bsize=array2.length;
		
		int array3[]=new int[asize+bsize];
		
		int finalArray[]=object.join(array1,asize,array2,bsize,array3);   //final sorted Array
		
        for (int i = 0; i <finalArray.length; i++) {
            
              System.out.print(" "+finalArray[i]);
        }
	}
}

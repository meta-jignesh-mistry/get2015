package SortingSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	//positive test case
	@Test
	public void quickSortTest() {
		
		int[] inputArray={-13,65,42,-17,18,10};	
		int[] expectedSortedArray={-17,-13,10,18,42,65};
		QuickSort tester=new QuickSort();
		tester.quickSort(inputArray,0,inputArray.length-1);
		assertArrayEquals(expectedSortedArray,inputArray);
		
		
	}

}

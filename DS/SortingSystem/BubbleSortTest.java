package SortingSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubbleSortTest {

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
	public void bubbleSortTest() {
		
	int[] inputArray={-3,6,2,-7,8,1};	
	int[] expectedSortedArray={-7,-3,1,2,6,8};	
	assertArrayEquals(expectedSortedArray,BubbleSort.bubbleSort(inputArray));	
	}

}

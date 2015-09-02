package binarysearch;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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
	public void binarySearchLeftMostTest1() {
		
		BinarySearch binarySearch =new BinarySearch();
		int[] array={2,4,6,7,7,7,8,9};
		int expectedOutput=3;
		assertEquals(expectedOutput,binarySearch.findLeftMostOccurance(array,8,0,7,7));
		
		}
	//negative test case
		@Test
		public void binarySearchLeftMostTest2() {
			
			BinarySearch binarySearch =new BinarySearch();
			int[] array={2,4,6,7,7,7,8,9};
			int expectedOutput=-1;               //11 is not present in array so it will return output as -1
			assertEquals(expectedOutput,binarySearch.findLeftMostOccurance(array,8,0,7,11));
			
			}
	

}

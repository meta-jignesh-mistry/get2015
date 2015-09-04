package SortingSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RadixSortTest {

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
	public void radixSortingTest() {
		int[] inputArray={-345,36,-12,-237,811,11};	
		int[] expectedSortedArray={-345,-237,-12,11,36,811};	
		assertArrayEquals(expectedSortedArray,RadixSort.radixSort(inputArray));	
		
		
	}

}

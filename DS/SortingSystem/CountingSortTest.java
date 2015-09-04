package SortingSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountingSortTest {

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
	public void countingSortTest() {
		int[] inputArray={3,6,2,7,8,1};	
		int[] expectedSortedArray={1,2,3,6,7,8};
		assertArrayEquals(expectedSortedArray,CountingSort.countingSorting(inputArray));
		
	}

}

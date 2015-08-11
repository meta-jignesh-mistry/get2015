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

	@Test
	public void QuickSortTest1() {
		
		//positive test case
		QuickSort test=new QuickSort();
		int inputArray[]= {2,5,8,9,10, 77, 55, 11};
		int expectedArray[]= {2,5,8,9,10,11,55,77};
		test.quickSort(inputArray,0,7);
		assertArrayEquals(expectedArray,expectedArray);
		}

	
	 //negative test case
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void QuickSortTest2() {
		
		//positive test case
		QuickSort tester=new QuickSort();
		int inputArray[]= {};
		int expectedArray[]= {};
		tester.quickSort(inputArray,0,0);
		assertArrayEquals(expectedArray,expectedArray);
		}
	
}

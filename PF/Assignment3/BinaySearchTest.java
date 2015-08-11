import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinaySearchTest {

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
	public void BinarySearchTest1() {
		BinarySearch tester=new BinarySearch();
		
		//positive test case ,function will return 1 if number present otherwise 0
		
		int[] array={10,34,27,74,89};
		
		//starting two parameters are low index and higher index of Array
		
		assertEquals(1,tester.binarySearch(0,4,array,27));
		
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void BinarySearchTest2() {
		BinarySearch tester=new BinarySearch();
		
		//Negative test case ,function will return 1 if number present otherwise 0
		
		int[] array={};
        System.out.println("Array is empty");		
		//starting two parameters are low index and higher index of Array
		tester.binarySearch(0,0,array,27);
		
		
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {

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
     
	//positive test case ,function will return 1 if number present otherwise 0
	@Test
	public void linerSearchTest1() {
		
		LinearSearch tester=new LinearSearch();
		 int[] array={10,34,27,74,89};
		  
		assertEquals(1,tester.findNumber(array, 27));
		
		}
	//negative test case
	@Test
	public void linerSearchTest2() {
		
		LinearSearch tester=new LinearSearch();
		 int[] array={};
		  
		assertEquals(0,tester.findNumber(array, 27));
		
		}
     
}

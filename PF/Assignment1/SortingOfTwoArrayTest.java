import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortingOfTwoArrayTest {

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
	public void test6() {
		
		SortingOfTwoArray tester=new SortingOfTwoArray();
		int input1[]={1,2,3};
		int input2[]={4,5,6};
		int input3[]=new int[6];
		int expected[]={1,2,3,4,5,6};
		assertArrayEquals(expected,tester.join(input1,3,input2,3,input3));
	}

}

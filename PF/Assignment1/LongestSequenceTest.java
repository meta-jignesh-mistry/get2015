import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LongestSequenceTest {

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
	public void test() {
		
		LongestSequence tester =new LongestSequence();
		int[] inputArray = { 1, 2, 3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		
		String programOutput=tester.longestSequence(inputArray);
		
		int expectedArray[]={1,2,4,5,6,7,8,9};
		
		assertEquals(Arrays.toString(expectedArray),programOutput);
	}


}



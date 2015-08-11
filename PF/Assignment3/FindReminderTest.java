import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FindReminderTest {

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
	public void positiveTest() {
		
		//positive test case
		
		FindReminder tester=new FindReminder();
		assertEquals(14,tester.findRem(14,50));
		
	}
	@Test
	public void negativeTest() {
		
		/*negative test case
		 if divisor is 0(undefined value) then function will return -1
		*/
		FindReminder tester=new FindReminder();
		assertEquals(-1,tester.findRem(14,0));
		
	}

}

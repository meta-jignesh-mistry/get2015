import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinaryToOctalTest {

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
		
		BinaryToOctal tester=new BinaryToOctal();     // Binary 110101 will give 65 as octal 
		int octal = tester.convertBinaryToOctal(110101);
		assertEquals("match",65,octal);
	}

}

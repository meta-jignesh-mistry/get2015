import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CreatePatternTest {

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
	
	CreatePattern tester=new CreatePattern();     //creating object of CreatePattern class
	
	@Test
	public void testForNumberFunction() {
		 
		assertEquals("12345",tester.numbers(0, 5));     //for row=0 and n=5
		
	
    }
	
	@Test
	public void testForSpaceFunction() {         //for row=1 and n=5
		
		assertEquals(" ",tester.spaces(1, 5));
		
	
    }
	@Test
	public void testForfullPatternFunction(){
		
		String[] expected={"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expected, tester.fullPattern(5));       //for n=5
		
	}
	
	
}

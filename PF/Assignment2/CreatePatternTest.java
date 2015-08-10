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
	
	//creating object of CreatePattern class
	
	CreatePattern tester=new CreatePattern();     
	
	@Test
	public void testForNumberFunction() {
		
		//for row=0 and n=5 ,Positive Test Case
		
		assertEquals("12345",tester.numbers(0, 5));
		
		
		
		
	}
	
	
	@Test
	
	//for row=1 and n=5 , Positive Test Case
	
	public void testForSpaceFunction() {        
		
		assertEquals(" ",tester.spaces(1, 5));
		
	
    }
	@Test
	public void testForfullPatternFunction(){
		
		String[] expected={"12345"," 1234","  123","   12","    1"};
		
		//for input value n=5 , Positive Test Case
		
		assertArrayEquals(expected, tester.fullPattern(5));       
		
	}
	
	
	
	
	
}

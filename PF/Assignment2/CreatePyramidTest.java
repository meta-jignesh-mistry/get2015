import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CreatePyramidTest {

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
	
	CreatePyramid tester=new CreatePyramid();     
	
	@Test
	public void testForNumberFunction() {       
		
		//for row=1 and n=5 
		
		assertEquals("1",tester.numbers(1, 5));
		
	
    }
	@Test
	
	//for row=2 and n=5
	
	public void testForSpaceFunction() {       
		
		assertEquals("   ",tester.spaces(2, 5));
		
	}
	
	

}

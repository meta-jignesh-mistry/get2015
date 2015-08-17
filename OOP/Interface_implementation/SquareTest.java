package Interface_implementation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SquareTest {

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
	//Creating object of class square
	Shape square=new Square(4);	
	
	//to check getArea method the Square class
	@Test
	public void testToGetArea() {
		double expected=16.0;
		assertEquals(expected,square.getArea(),0.01);
	}
	//to check Draw method the Square class
	@Test
	public void testToDraw() {
		String expected="This is square ";
		assertEquals(expected,square.draw());
	}

}

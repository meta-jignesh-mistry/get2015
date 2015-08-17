package Interface_implementation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CircleTest {

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

	//Creating object of class Circle
	Shape circle=new Circle(3); 
	
	//to check getArea method of the Circle class
	@Test
	public void testToGetArea() {
		double expected=28.26;
		assertEquals(expected,circle.getArea(),0.01);
	}
	
	
	//to check Draw method of the Circle class
	@Test
	public void testToDraw() {
		String expected="This is circle ";
		assertEquals(expected,circle.draw());
	}

}

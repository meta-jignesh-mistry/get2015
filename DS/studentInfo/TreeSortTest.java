package studentInfo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeSortTest {

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
	//positive test case
	@Test
	public void rollNumberAscendingOrderTest() {
		
		TreeSort studentTree=new TreeSort();
		
		studentTree.addNode(2,"Jignesh");
		studentTree.addNode(1,"Rahul");
		studentTree.addNode(7,"Rohit");
		studentTree.addNode(10,"Anil");
		studentTree.addNode(6,"Lalit");
		studentTree.addNode(11,"Neha");
		studentTree.inOrderTraversalTree(studentTree.getRoot());
		int[] ascendingOrderRollNumber=studentTree.ascendingOrderRollNumber();
		int[] expectedArray={1,2,6,7,10,11};
		assertArrayEquals(expectedArray,ascendingOrderRollNumber);
		
		}
	

}

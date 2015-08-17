import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MatrixTest {

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
		
		
		Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.println("Enter the number of rows and columns of matrix");
		row=sc.nextInt();
		col=sc.nextInt();
		int [][] data=new int [row][col];
		Matrix mat=new Matrix(row,col);
		
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				int value = sc.nextInt();
				mat.addElement(i,j,value);	
			}
		}
			int Expectedrow,Expectedcol;
			
			System.out.println("Enter the number of rows and columns of Expected Transpose matrix");
			Expectedrow=sc.nextInt();
			Expectedcol=sc.nextInt();
			int [][] ExpectedData=new int [Expectedrow][Expectedcol];
			Matrix expectedObject=new Matrix(Expectedrow,Expectedcol);
			
			System.out.println("Enter the elements of expected Transpose matrix");
			for(int p=0;p<Expectedrow;p++){
				for(int q=0;q<Expectedcol;q++){
					int value = sc.nextInt();
					expectedObject.addElement(p,q,value);
					}
			
				
			
			
		}
		
	}

	}



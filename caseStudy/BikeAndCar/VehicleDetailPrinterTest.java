import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class VehicleDetailPrinterTest {

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
  //test for car specification
	@Test
	public void testOfCarSpecification() {
		
		Vehicle vehicle=VehicleHelper.createVehicle("Car","swift","maruti");
		VehicleHelper vehicleHelper=new VehicleHelper();
		Car car=vehicleHelper.createCar(vehicle,750,20,20,500000,10000,true,true);
		String output=VehicleDetailPrinter.printVehicleSpecification(car);
	
		String expectedOutput="Company name = maruti Model =swift engineInCC =750 fuelCapacity= 20 milage=20 price = 500000 is Ac available = true is Powersteering = true";
		
		assertEquals(output,expectedOutput); 
		
	}
	//test for Bike specification
	@Test
	public void testOfBikeSpecification() {
		
		Vehicle vehicle=VehicleHelper.createVehicle("Bike","Splender","Hero");
		VehicleHelper vehicleHelper=new VehicleHelper();
		Bike bike=vehicleHelper.createBike(vehicle,150,10,65,50000,10000,true,700);
		String output=VehicleDetailPrinter.printVehicleSpecification(bike);
		
		String expectedOutput="Company name = Hero Model =Splender engineInCC =150 fuelCapacity= 10 milage=65 price = 50000 is self Start = true helmet price= 700";
	
		assertEquals(output,expectedOutput); 
		
	}

}

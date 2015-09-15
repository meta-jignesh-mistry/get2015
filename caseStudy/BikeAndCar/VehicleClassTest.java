import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class VehicleClassTest {

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

	//test for checking type of vehicle
	@Test
	public void testOfTypeOfVehicle() {
		
		
		Vehicle vehicle=VehicleHelper.createVehicle("Car","swift","maruti");
		assertEquals(String.valueOf(vehicle.getClass()),"class Car");
	}
	
	
	//test case for car class
	@Test
	public void testForCar() {
		
		
		Vehicle vehicle=VehicleHelper.createVehicle("Car","swift","maruti");
		
		VehicleHelper vehicleHelper=new VehicleHelper();
		Car car=vehicleHelper.createCar(vehicle,750,20,20,500000,10000,true,true);
		
		assertEquals(car.getEngineInCC(), 750);	
		assertEquals(car.getFuelCapacity(),20);	
		assertEquals(car.getMilage(),20);	
		assertEquals(car.getPrice(),500000);
		assertEquals(car.isAC(),true);	
		assertEquals(car.isPowerSteering(),true);
		assertEquals(car.getOnRoadPrice(),510000);	
	}
	
	//test case for Bike class
	@Test
	public void testForBike() {
		
		
		Vehicle vehicle=VehicleHelper.createVehicle("Bike","Splender","Hero");
		
		VehicleHelper vehicleHelper=new VehicleHelper();
		Bike bike=vehicleHelper.createBike(vehicle,150,10,65,50000,10000,true,700);
		
		assertEquals(bike.getEngineInCC(),150);	
		assertEquals(bike.getFuelCapacity(),10);	
		assertEquals(bike.getMilage(),65);	
		assertEquals(bike.getPrice(),50000);
		assertEquals(bike.isSelfStart(),true);	
		assertEquals(bike.getHelmetPrice(),700);
		assertEquals(bike.getOnRoadPrice(),50700);	
		System.out.println(bike);
	}
	
	
	
}

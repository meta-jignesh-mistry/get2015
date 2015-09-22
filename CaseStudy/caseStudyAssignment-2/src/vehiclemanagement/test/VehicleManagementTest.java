package vehiclemanagement.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import vehiclemanagement.StaXParser;
import vehiclemanagement.VehicleInterfaceImplementation;
import vehiclemanagement.model.Vehicle;

public class VehicleManagementTest{	

	
//test method to check insertion of car object data in car table	
@Test
public void testForCar() {
	VehicleInterfaceImplementation tester = new VehicleInterfaceImplementation();
StaXParser st = new StaXParser();
List<Vehicle> cars = st
.readConfig("../casestudy2/xmlFiles/carinput.xml");
for (Vehicle vehicle : cars) {
assertTrue(tester.insertIntoVehicle(vehicle)) ;
}
}

// test method to check insertion of bike object data in bike table

@Test
public void testForBike() {
	VehicleInterfaceImplementation tester = new VehicleInterfaceImplementation();
StaXParser st = new StaXParser();
List<Vehicle> bikes = st
.readConfig("../casestudy2/xmlFiles/bikeinput.xml");
for (Vehicle vehicle : bikes) {
assertTrue(tester.insertIntoVehicle(vehicle));
}
}
}
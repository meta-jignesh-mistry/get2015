
public class VehicleDetailPrinter {
	
	//method return String of vehicle Specification
	public static String printVehicleSpecification(Vehicle vehicle){
		
		if(String.valueOf(vehicle.getClass()).equals("class Car"))
		{
			
			Car car=(Car)vehicle;
			return car.toString();
			
		}
		else if(String.valueOf(vehicle.getClass()).equals("class Bike")){

			

			Bike bike=(Bike)vehicle;
			return bike.toString();
		}
		return null;
		
	}

	
}




public class VehicleHelper {

	
	//method return object of car or bike based on vehicle Type
	public static Vehicle createVehicle(String vehicleType,String model,String make)
	{
		
		
		if(vehicleType.equalsIgnoreCase("Car")){
		
			
			Car car=new Car();
			car.setMake(make);
			car.setModel(model);
			return car;
			
			
		}
		else 
		if(vehicleType.equalsIgnoreCase("Bike")){
			
			Bike bike=new Bike();
			bike.setMake(make);
			bike.setModel(model);
			return bike;
			
			
		}
		else
		return null;
		
	}
	
	//method to create car object
	public Car createCar(Vehicle vehicle,int engineInCC,int fuelCapacity,int milage,long price,int roadTax,boolean AC,boolean powerSteering){
		
		Car car=(Car)vehicle;
		car.setAC(AC);
		car.setPowerSteering(powerSteering);
		car.setFuelCapacity(fuelCapacity);
		car.setEngineInCC(engineInCC);
		car.setMilage(milage);
		car.setPrice(price);
		car.setRoadTax(roadTax);
		car.setOnRoadPrice(price);
		return car;
		
	}
	
	
	//method to create bike object
	public Bike createBike(Vehicle vehicle,int engineInCC,int fuelCapacity,int milage,long price,int roadTax,boolean selfStart,int helmetPrice){
		
		Bike bike=(Bike)vehicle;
		bike.setHelmetPrice(helmetPrice);
		bike.setSelfStart(selfStart);
		bike.setFuelCapacity(fuelCapacity);
		bike.setEngineInCC(engineInCC);
		bike.setMilage(milage);
		bike.setPrice(price);
		bike.setRoadTax(roadTax);
		bike.setOnRoadPrice(price);
		return bike;
		
	}
	
	
	
	
}

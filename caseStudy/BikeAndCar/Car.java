
public class Car extends Vehicle {
	
	boolean AC;
	boolean powerSteering;

	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public Boolean isPowerSteering() {
		return powerSteering;
	}
	public void setPowerSteering(Boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	
	public void setOnRoadPrice(long price) {
		super.onRoadPrice=price+10000;
	}
	
	
	//overriding toString() method
	
	public String toString(){
		
		
	return "Company name = "+make+" Model ="+model+" engineInCC ="+engineInCC+" fuelCapacity= "+fuelCapacity+
		   " milage="+milage+" price = "+price+" is Ac available = "+AC+ " is Powersteering = "+powerSteering;

		
	}
	
}


package vehiclemanagement.model;


// class have Car specific attributes

public class Car extends Vehicle {

	private boolean AC;
	private boolean powerSteering;
	private String accessoryKit; 

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	} 

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public String isAccessoryKit() {
		return accessoryKit;
	}

	public void setAccessoryKit(String string) { 
		this.accessoryKit = string;
	}
	
	//overriding the vehicle class method
	@Override
	public double calculateOnRoadPrice() {
		double onRoadPrice = 0.0;
		if (this.isAC()) {
			onRoadPrice = onRoadPrice + 5000;

		}

		if (isAccessoryKit() != null) {
			onRoadPrice = onRoadPrice + 10000;

		}

		if (isPowerSteering()) {
			onRoadPrice = onRoadPrice + 3000;

		}

		return super.calculateOnRoadPrice() + onRoadPrice;
	}

	@Override
	public String toString() {
		return super.toString() + " AC=" + AC + ", powerSteering="
				+ powerSteering + ", accessoryKit=" + accessoryKit;
	}

}

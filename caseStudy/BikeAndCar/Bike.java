
public class Bike extends Vehicle {

	Boolean selfStart;
	int helmetPrice;
	
	
	//getter setter methods of  Bike class Attributes
	public Boolean isSelfStart() {
		return selfStart;
	}
	public void setSelfStart(Boolean selfStart) {
		this.selfStart = selfStart;
	}
	public int getHelmetPrice() {
		return helmetPrice;
	}
	public void setHelmetPrice(int helmetPrice) {
		this.helmetPrice = helmetPrice;
	}
	public void setOnRoadPrice(long Price) {
		super.onRoadPrice=Price+this.helmetPrice;
	}
	
	//overriding toString() method
	public String toString(){
		
	return "Company name = "+make+" Model ="+model+" engineInCC ="+engineInCC+" fuelCapacity= "+fuelCapacity+
		   " milage="+milage+" price = "+price+" is self Start = "+ selfStart+ " helmet price= "+ helmetPrice;

	}

	
	
}

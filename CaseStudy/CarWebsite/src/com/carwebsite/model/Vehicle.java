package com.carwebsite.model;

public class Vehicle {
	private int vId;
	private String make;
	private String model;
	private int engineInCc;
	private int fuelCapacity;
	private int milage;
	private int price;
	private int roadTax;
	private int onRoadPrice;
	private String image;
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineInCc() {
		return engineInCc;
	}
	public void setEngineInCc(int engineInCc) {
		this.engineInCc = engineInCc;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRoadTax() {
		return roadTax;
	}
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}
	public int getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(int onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	
	

}

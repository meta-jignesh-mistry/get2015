package com.carwebsite.model;

//model class of Car
public class Car extends Vehicle {

	private String ac;
	private String powerSteering;
	private String accessoriesKit;

	public Car() {

	}

	public Car(String company, String model, int engine, int fuel, int milage,
			int showroomprice, int roadtax, int roadprice, String ac,
			String accessorieskit, String powersteering, String image) {
		super(company, model, engine, fuel, milage, showroomprice, roadtax,
				roadprice, image);
		this.ac = ac;
		this.accessoriesKit = accessorieskit;
		this.powerSteering = powersteering;

	}
	//getter and setter
	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(String powerSteering) {
		this.powerSteering = powerSteering;
	}

	public String getAccessoriesKit() {
		return accessoriesKit;
	}

	public void setAccessoriesKit(String accessoriesKit) {
		this.accessoriesKit = accessoriesKit;
	}

}

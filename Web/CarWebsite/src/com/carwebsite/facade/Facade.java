package com.carwebsite.facade;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.ArrayList;

import com.carwebsite.db.helper.CarHelper;
import com.carwebsite.db.helper.VehicleHelper;
import com.carwebsite.exception.CarSystemException;

import com.carwebsite.model.Car;
import com.carwebsite.model.Vehicle;

public class Facade {

	private static Facade instance;

	private Facade() {

	}

	public static Facade getInstance() {

		if (instance == null) {

			instance = new Facade();
			return instance;
		} else {
			return instance;
		}

	}

	//create method
	public boolean create(Car car, Connection connection)
			throws CarSystemException, SQLException {

		CarHelper carHelper = new CarHelper();
		return carHelper.create(car, connection);

	}
//search method
	public ArrayList<Vehicle> search(String search, Connection connection)
			throws CarSystemException {

		VehicleHelper vehicleHelper = new VehicleHelper();
		return vehicleHelper.searchVehicle(search, connection);

	}

	public Car getCar(int carId, Connection connection)
			throws CarSystemException {

		CarHelper carHelper = new CarHelper();
		return carHelper.getCar(carId, connection);

	}
//update method
	public int update(Car car, Connection connection)
			throws CarSystemException, SQLException {

		CarHelper carHelper = new CarHelper();
		return carHelper.update(car, connection);

	}

}

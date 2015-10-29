package com.carwebsite;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.carwebsite.db.ConnectionFactory;
import com.carwebsite.db.helper.CarHelper;
import com.carwebsite.exception.CarSystemException;
import com.carwebsite.facade.Facade;

import com.carwebsite.model.Car;
import com.carwebsite.model.Vehicle;

//class that provide all methods to controller &
//directly interacted to Controller
public class Service {

	public boolean create(Car car) {

		boolean create = false;

		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			try {
				create = Facade.getInstance().create(car, connection);
				connection.commit();
			} catch (CarSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not roleback.");
			}
			try {
				throw new CarSystemException("Could not Create Car, ["
						+ e.getMessage() + "]");
			} catch (CarSystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {

			ConnectionFactory.closeConnection(connection);
		}
		return create;

	}

	public ArrayList<Vehicle> search(String car, String budget) {

		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		CarHelper carHelper = new CarHelper();

		try {
			return Facade.getInstance().search(carHelper.search(car, budget),
					connection);
		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			ConnectionFactory.closeConnection(connection);
		}

		return null;
	}

	public Car getCar(int carId) {

		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			return Facade.getInstance().getCar(carId, connection);
		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int update(Car car) {
		int status = -1;
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			try {
				status = Facade.getInstance().update(car, connection);
				connection.commit();
			} catch (CarSystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("Could not roleback.");
			}
			try {
				throw new CarSystemException("Could not Update Car, ["
						+ e.getMessage() + "]");
			} catch (CarSystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {

			ConnectionFactory.closeConnection(connection);
		}
		return status;
	}

}

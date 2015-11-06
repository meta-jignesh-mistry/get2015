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

	// method to create car
	public boolean create(Car car) throws CarSystemException {

		boolean create = false;

		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			create = Facade.getInstance().create(car, connection);
			try {

				connection.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Could not commit " + e.getMessage());
				throw new CarSystemException("Could not Commit "
						+ e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Could not create Car" + e.getMessage());
			try {

				connection.rollback();
				throw new CarSystemException(
						"Could not create car and transition RollBack "
								+ e.getMessage());

			} catch (SQLException e1) {
				System.out.println("Could not roleback.");
				throw new CarSystemException("Could not roll back");

			}

		} finally {

			ConnectionFactory.closeConnection(connection);
		}
		return create;

	}

	// method to search car
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

	// method to get car Object
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

	// method to update car
	public int update(Car car) throws CarSystemException {
		int status = -1;
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			status = Facade.getInstance().update(car, connection);

			try {

				connection.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Could not commit " + e.getMessage());
				throw new CarSystemException("Could not Commit "
						+ e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Could not Update Car" + e.getMessage());
			try {

				connection.rollback();
				throw new CarSystemException(
						"Could not Update car and transition RollBack "
								+ e.getMessage());

			} catch (SQLException e1) {
				System.out.println("Could not roleback.");
				throw new CarSystemException("Could not roll back");

			}

		} finally {

			ConnectionFactory.closeConnection(connection);
		}
		return status;

	}

}

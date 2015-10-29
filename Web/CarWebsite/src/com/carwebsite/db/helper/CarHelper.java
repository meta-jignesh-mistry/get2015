package com.carwebsite.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carwebsite.exception.CarSystemException;
import com.carwebsite.model.Car;

public class CarHelper extends VehicleHelper {

	private static String INSERT_CAR_QUERY = "INSERT INTO car(carId,AC,powerSteering,accessoryKit) VALUES (?,?,?,?)";
	private static String UPDATE_CAR_QUERY = "UPDATE car SET AC=?,powerSteering=?,accessoryKit=? where carId=?";

	// method to create the car

	public boolean create(Car car, Connection connection)
			throws CarSystemException {
		boolean created = false;
		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				super.create(connection, car);
				int vehicleId = getLastRow(connection).getvId();
				if (vehicleId > 0) {
					preparedStatement = connection
							.prepareStatement(INSERT_CAR_QUERY);
					preparedStatement.setInt(1, vehicleId);
					preparedStatement.setString(2, car.getAc());
					preparedStatement.setString(3, car.getPowerSteering());
					preparedStatement.setString(4, car.getAccessoriesKit());
					created = preparedStatement.execute();

				}
			} catch (SQLException e) {
				throw new CarSystemException("Could not create Vehicle, ["
						+ e.getMessage() + "]");
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out
								.println("Could not close prepared statement, ["
										+ e.getMessage() + "]");
					}
				}
			}
		}
		return created;
	}

	// method to update the car
	public int update(Car car, Connection connection)
			throws CarSystemException, SQLException {
		int update = -1;

		if (connection != null) {
			PreparedStatement preparedStatement = null;
			try {
				super.updateVehicle(car, connection);

				preparedStatement = connection
						.prepareStatement(UPDATE_CAR_QUERY);
				preparedStatement.setString(1, car.getAc());
				preparedStatement.setString(2, car.getPowerSteering());
				preparedStatement.setString(3, car.getAccessoriesKit());
				preparedStatement.setInt(4, car.getvId());
				update = preparedStatement.executeUpdate();

			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						System.out
								.println("Could not close prepared statement, ["
										+ e.getMessage() + "]");
					}
				}

			}
		}

		return update;
	}

	// method to get last row inserted in vehicle table
	private Car getLastRow(Connection connection) {
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		Car car = null;
		System.out.println("i am calling getLastRow Fuction");
		try {
			preparedStatement = connection
					.prepareStatement("select * from VEHICLE order by vehicleId desc limit 1");
			rs = preparedStatement.executeQuery();
			car = new Car();
			while (rs.next()) {
				car.setvId(rs.getInt("vehicleId"));

			}

		} catch (SQLException e) {
			System.out.println("Could not close prepared statement, ["
					+ e.getMessage() + "]");
		}
		return car;
	}

	// getting the car object based on car id
	public Car getCar(int carId, Connection connection)
			throws CarSystemException {

		ResultSet rs = null;
		Car car = new Car();
		String query = "select * from vehicle v inner join car c on v.vehicleId=c.carId where vehicleId=?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, carId);
			rs = preparedStatement.executeQuery();

			while (rs.next()) {

				car.setvId(rs.getInt("vehicleId"));
				car.setMake(rs.getString("make"));
				car.setModel(rs.getString("model"));
				car.setEngineInCc(rs.getInt("engineInCC"));
				car.setFuelCapacity(rs.getInt("fuelCapacity"));
				car.setMilage(rs.getInt("milage"));
				car.setRoadTax(rs.getInt("roadTax"));
				car.setPrice(rs.getInt("price"));
				car.setOnRoadPrice(rs.getInt("onRoadPrice"));
				car.setImage(rs.getString("image"));
				car.setAc(rs.getString("AC"));
				car.setPowerSteering(rs.getString("powerSteering"));
				car.setAccessoriesKit(rs.getString("accessoryKit"));

			}
			return car;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, ["
							+ e.getMessage() + "]");
				}
			}

		}

		return null;

	}

}

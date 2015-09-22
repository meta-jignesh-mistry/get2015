package vehiclemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vehiclemanagement.connection.ConnectionUtil;
import vehiclemanagement.model.Bike;
import vehiclemanagement.model.Car;
import vehiclemanagement.model.Vehicle;


//implementation of vehicle interface

public class VehicleInterfaceImplementation implements VehicleInterface{
	
	//method to insert into vehicle table
	
	public  boolean insertIntoVehicle(Vehicle vehicle) {

		Connection con = null;
		PreparedStatement ps = null;
		int result;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "INSERT INTO vehicle (`vehicleId`, `make`, `model`, `engineInCC`, `fuelCapacity`,"
				+ " `mileage`, `price`, `roadTax`)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?); ";	
		try {
			ps = con.prepareStatement(query);
			
			ps.setDouble(1,vehicle.getVehicalid());
			ps.setString(2,vehicle.getMake());
			ps.setString(3,vehicle.getModel());
			ps.setInt(4,vehicle.getEnginInCC());
			ps.setInt(5,vehicle.getFuelCapacity());
			ps.setInt(6,vehicle.getMilage());
			ps.setDouble(7,vehicle.getPrice());
			ps.setDouble(8,vehicle.getRoadTax());
			result = ps.executeUpdate();
			
			if(result!=0) {
				if(vehicle instanceof Car) {
					  insertIntoCar(vehicle);
					return true;
				}
				else {
					 insertIntoBike(vehicle);
					 return true;
				}
			}
		} catch (SQLException e) {
				
				new VehicleException("Error ! you are trying to put duplicate entry in database...");
				
		} finally {
		
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	//method to insert into car table
	
	private boolean insertIntoCar(Vehicle vehicle) {
		Connection con = null;
		PreparedStatement ps = null;
		boolean result;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "INSERT INTO Car (`vehicleId`, `ac`, `powerSteering`, `accessoryKit`)"
				+ " VALUES (?, ?, ?, ?); ";
		
		try {
			ps = con.prepareStatement(query);
			ps.setDouble(1,vehicle.getVehicalid());
			ps.setBoolean(2,((Car) vehicle).isAC());
			ps.setBoolean(3,((Car) vehicle).isPowerSteering());
			ps.setString(4,((Car) vehicle).isAccessoryKit());
			result = ps.execute();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				new VehicleException("Error ! you are trying to put duplicate entry in database...");
				
			  }
		}
		return false;
	}

	//method to insert into bike table
	
	private boolean insertIntoBike(Vehicle vehicle) {
		Connection con = null;
		PreparedStatement ps = null;
		boolean result;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "INSERT INTO Bike (`vehicleId`, `SelfStart`, `HelmetPrice`)"
				+ " VALUES (?, ?, ?);  ";
		try {
			ps = con.prepareStatement(query);
			ps.setDouble(1,vehicle.getVehicalid());
			ps.setBoolean(2,((Bike) vehicle).isSelfStart());
			ps.setDouble(3,((Bike) vehicle).getHelmetPrize());
			result = ps.execute();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				new VehicleException("Error ! you are trying to put duplicate entry in database...");
				
			}

		}
		return false;
	}
}

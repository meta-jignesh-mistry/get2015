package com.carwebsite.db.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.carwebsite.db.ConnectionFactory;
import com.carwebsite.exception.CarSystemException;

import com.carwebsite.model.Vehicle;

public class VehicleHelper {

	
	
	private static String INSERT_VEHICLE_QUERY = "INSERT INTO vehicle (make,model,engineInCC,fuelCapacity,milage,price,roadTax,onRoadPrice,image) VALUES (?,?,?,?,?,?,?,?,?)";
	private static String UPDATE_VEHICLE_QUERY = "UPDATE vehicle SET make=?,model=?,engineInCC=?,fuelCapacity=?,milage=?,price=?,roadTax=?,onRoadPrice=? where vehicleId=?";
	//private static String SELECT_FOR_EMAIL_ID_QUERY = "select id from EMPLOYEE where EMAIL_ID=?";
	
	protected void createVehicle(Connection connection, Vehicle vehicle) throws CarSystemException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(INSERT_VEHICLE_QUERY);
			preparedStatement.setString(1,vehicle.getMake());
			preparedStatement.setString(2,vehicle.getModel());
			preparedStatement.setInt(3,vehicle.getEngineInCc());
			preparedStatement.setInt(4,vehicle.getFuelCapacity());
			preparedStatement.setInt(5,vehicle.getMilage());
			preparedStatement.setInt(6,vehicle.getPrice());
			preparedStatement.setInt(7,vehicle.getRoadTax());
			preparedStatement.setInt(8,vehicle.getOnRoadPrice());
			preparedStatement.setString(9,vehicle.getImage());
			preparedStatement.execute();
		} catch (SQLException e) {
			throw new CarSystemException("Could not create Vehicle, [" + e.getMessage() + "]");
		} finally {
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
				}
			}
		}
	}
	
	public ArrayList<Vehicle> searchVehicle(String query) throws CarSystemException{
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		Connection connection = ConnectionFactory.getConnection();
		ResultSet rs = null;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();
			Vehicle vehicle = null;
			while(rs.next()){
				vehicle = new Vehicle();
				vehicle.setvId(rs.getInt("vehicleId"));
				vehicle.setMake(rs.getString("make"));
				vehicle.setModel(rs.getString("model"));
				vehicle.setEngineInCc(rs.getInt("engineInCC"));
				vehicle.setFuelCapacity(rs.getInt("fuelCapacity"));
				vehicle.setMilage(rs.getInt("milage"));
				vehicle.setRoadTax(rs.getInt("roadTax"));
				vehicle.setPrice(rs.getInt("price"));
				vehicle.setOnRoadPrice(rs.getInt("onRoadPrice"));
				vehicle.setImage(rs.getString("image"));
				vehicleList.add(vehicle);
			}
			return vehicleList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
		
		
	}
	
	protected void updateVehicle(Vehicle vehicle , Connection connection) throws CarSystemException {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(UPDATE_VEHICLE_QUERY);
			preparedStatement.setString(1,vehicle.getMake());
			preparedStatement.setString(2,vehicle.getModel());
			preparedStatement.setInt(3,vehicle.getEngineInCc());
			preparedStatement.setInt(4,vehicle.getFuelCapacity());
			preparedStatement.setInt(5,vehicle.getMilage());
			preparedStatement.setInt(6,vehicle.getPrice());
			preparedStatement.setInt(7,vehicle.getRoadTax());
			preparedStatement.setInt(8,vehicle.getOnRoadPrice());
			preparedStatement.setInt(9,vehicle.getvId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new CarSystemException("Could not update Vehicle, [" + e.getMessage() + "]");
		} finally {
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					System.out.println("Could not close prepared statement, [" + e.getMessage() + "]");
				}
			}
		}
		
	}
	
public String search(String  car, String budget){
	String query = "";
	if(car!=null && budget!=null){
		
		query =  "select * from vehicle where "+budget+" and "+"make="+"'"+car+"' "+";";
		
	}else if(car==null & budget!=null){
		
		query =  "select * from vehicle where "+budget+";";
		
	}else if(budget==null && car!=null){

		query =  "select * from vehicle where "+"make="+"'"+car+"' "+";";
		
	}
	else{
		query =  "select * from vehicle ;";
		
	}
	return query;
	
}
}

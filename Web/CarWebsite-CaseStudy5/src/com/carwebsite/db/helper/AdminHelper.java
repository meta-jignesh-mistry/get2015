
	package com.carwebsite.db.helper;

	
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.carwebsite.exception.CarSystemException;
import com.carwebsite.model.Admin;

	public class AdminHelper {
		
		private static String Valid_Admin = "select id from admin where username=? and password=?";
		

		//checking the valid admin
		public boolean isValidAdmin(Connection connection,Admin admin) throws CarSystemException {
		
			boolean flag=false;
			if(connection != null) {
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				try {
					preparedStatement = connection.prepareStatement(Valid_Admin);
					preparedStatement.setString(1,admin.getName());
					preparedStatement.setString(2,admin.getPassword());
					resultSet = preparedStatement.executeQuery();
					while(resultSet.next()) {
						flag=true;
					}
				} catch(SQLException e) {
					throw new CarSystemException("Could not find Admin , [" + e.getMessage() + "]");
				}
			}
			return flag;
		}
		

	}
	
	
	
	


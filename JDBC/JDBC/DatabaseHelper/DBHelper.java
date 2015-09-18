package DatabaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBHelper {

	
	public static ResultSet  executeQuery(String query,Connection con,String searchBy){
	
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			
			
			ps = con.prepareStatement(query);
			ps.setString(1,searchBy);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return rs;	
		
	}
	
	
	public static int  executeUpdate(String query,Connection con){
		
		PreparedStatement ps = null;
		int effectedRow=0;
		
		try {
			
			
			ps = con.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		try {
			effectedRow = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return effectedRow;	
		
	}
	
	
	
	
}

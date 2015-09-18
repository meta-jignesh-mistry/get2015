package Business;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.ConnectionUtil;
import DatabaseHelper.DBHelper;

public class TitleQuery {

	//return true if title present other wise will return false
	
		public static boolean isTitlePresent(String titleName){
			
			
			Boolean isTitlePresent=false;
			ResultSet rs = null;
			Connection con = null;
			
			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			
			String query="Select titleName from Title where titleName=?";
			
			try {
				rs=DBHelper.executeQuery(query, con,titleName);
			
				isTitlePresent= rs.next();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
			
				try {
					if (con != null) {
						con.close();
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			return isTitlePresent;
		}
	
	
	
}

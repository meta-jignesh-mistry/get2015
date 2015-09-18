package Business;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.ConnectionUtil;
import DatabaseHelper.DBHelper;

public class MemberQuery {
	
	//return true if member already present otherwise return false
		public static Boolean isMemberPresent(int memberId){
			
			boolean  isMemberPresent=false;
			ResultSet rs = null;
			Connection con = null;
			
			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			
			String query="Select memberId from Member where MemberId=?";
			
			try {
				
				rs=DBHelper.executeQuery(query, con,String.valueOf(memberId));
				isMemberPresent=rs.next();

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
			
			return isMemberPresent;
			
			
			
			
		}

	

}

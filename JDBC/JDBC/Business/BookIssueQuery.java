package Business;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import Connection.ConnectionUtil;

public class BookIssueQuery {
	
	
	//method will return flag=0 if books is not issued other wise it will return flag=1
	public static int getStatusOfBookIssue(String bookName,int memberId){
		
		int flag=0;
		
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		
		
		String query = "INSERT INTO Books_Issue (accessionNo,memberId) VALUES((SELECT accessionNo FROM Books B,Title T Where B.titleId=T.titleId AND T.titleName=? Limit 0,1 ),(Select memberId from Member Where memberId=?))";
		
		
		
		
		if(TitleQuery.isTitlePresent(bookName)==true && MemberQuery.isMemberPresent(memberId)==true){	
		

		try {
			ps = con.prepareStatement(query);
			//setting the parameter to query string
			ps.setString(1,bookName);
			ps.setInt(2,memberId);
		
			flag=ps.executeUpdate();

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return flag;
	}
		
		else{
			System.out.println("wrong member Id or Title Name");
			return 0;
		}
	}
	
	
	
	
	
	
}

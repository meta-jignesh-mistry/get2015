package Business;

import java.sql.Connection;

import java.sql.SQLException;

import Connection.ConnectionUtil;
import DatabaseHelper.DBHelper;

public class BookQuery {
	
	
	// method return no. of books deleted which were not issued in last one year
	public static int toDeleteBooksNotIssuedInLastOneYear() {
		String query = "DELETE FROM B Using Books AS B WHERE(PERIOD_DIFF(DATE_FORMAT(CURDATE(), '%Y%m'),DATE_FORMAT((SELECT BI.issueDate FROM Books_Issue BI WHERE BI.accessionNo=B.accessionNo "
				+ "ORDER BY BI.issueDate DESC LIMIT 0,1), '%Y%m'))>12 OR (PERIOD_DIFF(DATE_FORMAT(CURDATE(), '%Y%m'),DATE_FORMAT(B.purchaseDate, '%Y%m') )>12 AND "
				+ " NOT EXISTS(SELECT BI.issueDate FROM Books_Issue BI WHERE BI.accessionNo=B.accessionNo ORDER BY BI.issueDate DESC LIMIT 0,1) ))";
		Connection connection = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		connection = connectionUtil.getConnection();
		
		int totalBooksDeleted = 0;
		try {
		
			
			
			/* set variable in prepared statement */
			totalBooksDeleted = DBHelper.executeUpdate(query, connection);
		} finally {
			/* close connection */
			try {
				if (connection != null) {
					connection.close();
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return totalBooksDeleted;
	}
	

}

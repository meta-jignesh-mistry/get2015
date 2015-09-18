package Business;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connection.ConnectionUtil;
import DatabaseHelper.DBHelper;
import Model.Book;


public class AuthorQuery {
	
	
	//method return the list of the title objects which are published by given author
		public static ArrayList<Book>  getBookPublishedByAuthor(String authorName){
			ArrayList<Book> titleList=new ArrayList<Book>();
			
			Connection con = null;
			ConnectionUtil conUtil = new ConnectionUtil();
			con = conUtil.getConnection();
			String query = "select T.titleId,T.titleName from Title T JOIN Title_Author TA ON T.titleId=TA.titleId JOIN Authors A ON A.authorId=TA.authorId WHERE authorName=?";
			
			Book title=null;
			ResultSet rs=null;
			String searchBy=authorName;
			rs=DBHelper.executeQuery(query,con,searchBy);
			
			try {
			
				while (rs.next()) {
					
					title=new Book();
					title.setTitleId(rs.getInt(1));
					title.setTitleName(rs.getString(2));
					
					//adding the title object to list
					titleList.add(title);
				
				}
				
				
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
			return titleList;
			
		}
}

package com.carwebsite.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carwebsite.db.ConnectionFactory;
import com.carwebsite.db.helper.AdminHelper;
import com.carwebsite.exception.CarSystemException;
import com.carwebsite.model.Admin;

/**
 * Servlet implementation class AdminValidation
 */
@WebServlet("/AdminValidation")
public class AdminValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AdminValidation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String forwardUrl = "index.jsp";
		System.out.println("i am on servlet");
		boolean flag=false;
		Admin admin=createAdmin(request);
		AdminHelper adminHelper=new AdminHelper();
		
		Connection connection=null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			flag=adminHelper.isValidAdmin(connection, admin);
		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionFactory.closeConnection(connection);
		if(flag){
			System.out.println("u r admin");
			HttpSession session = request.getSession();
			session.setAttribute("id", "id");
			forwardUrl+="?admin=admin";
		}
		else{
			System.out.println("not admin");
			forwardUrl="login.jsp";
			request.setAttribute("message","Invalid User name or Password");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
		
	}

	private Admin createAdmin(HttpServletRequest request) {

		Admin admin = new Admin();
		admin.setName(request.getParameter("username"));
		admin.setPassword(request.getParameter("pwd"));
		return admin;

	}

}

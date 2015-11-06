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
@WebServlet("/DoLogIn")
public class DoLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DoLogIn() {
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
		String name = request.getParameter("username");
		String password = request.getParameter("pwd");
		String forwardUrl = "index.jsp";

		boolean flag = false;

		Admin admin = new Admin(name, password);

		AdminHelper adminHelper = new AdminHelper();

		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			//method to check valid admin
			flag = adminHelper.isValidAdmin(connection, admin);
		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionFactory.closeConnection(connection);
		if (flag) {

			HttpSession session = request.getSession();
			session.setAttribute("id", "id");

		} else {
			if (request.getAttribute("invalid") != null) {
				request.removeAttribute("invalid");
				forwardUrl = "index.jsp";
			} else {

				request.setAttribute("invalid", "true");

				forwardUrl = "index.jsp";

			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);

	}

}

package com.carwebsite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carwebsite.Service;
import com.carwebsite.db.helper.CarHelper;
import com.carwebsite.exception.CarSystemException;
import com.carwebsite.model.Car;

/**
 * Servlet implementation class ViewSpecification
 */
@WebServlet("/ViewSpecification")
public class ViewSpecification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewSpecification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		

		Car car = null;
		Service service = new Service();
		//getting the car object based on car id
		car = service.getCar(Integer.parseInt(request.getParameter("id")));

		request.setAttribute("car", car);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("viewspecification.jsp");
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

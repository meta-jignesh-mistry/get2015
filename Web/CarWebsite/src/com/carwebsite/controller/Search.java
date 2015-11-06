package com.carwebsite.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carwebsite.Service;
import com.carwebsite.db.helper.VehicleHelper;
import com.carwebsite.exception.CarSystemException;
import com.carwebsite.model.Vehicle;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Search() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String car = request.getParameter("car");
		String budget = request.getParameter("budget");

		ArrayList<Vehicle> vehicleList = null;

		Service service = new Service();

		// search the car based on budget and car name
		vehicleList = service.search(car, budget);

		request.setAttribute("listOfCar", vehicleList);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("searchResult.jsp");
		requestDispatcher.forward(request, response);

	}

}

package com.carwebsite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carwebsite.Service;
import com.carwebsite.exception.CarSystemException;
import com.carwebsite.model.Car;

/**
 * Servlet implementation class Create
 */
@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Create() {
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
		String company = request.getParameter("company");
		String model = request.getParameter("model");
		int engine = Integer.parseInt(request.getParameter("engine"));
		int fuel = Integer.parseInt(request.getParameter("fuel"));
		int milage = Integer.parseInt(request.getParameter("milage"));
		int price = Integer.parseInt(request.getParameter("showroomprice"));
		int roadtax = Integer.parseInt(request.getParameter("roadtax"));
		int roadprice = Integer.parseInt(request.getParameter("roadprice"));
		String ac = request.getParameter("ac");
		String accessorieskit = request.getParameter("accessorieskit");
		String powersteering = request.getParameter("powersteering");
		String image = request.getParameter("image");

		// setting the values in object using parametrised constructor
		Car car = new Car(company, model, engine, fuel, milage, price, roadtax,
				roadprice, ac, accessorieskit, powersteering, image);

		Service service = new Service();
		// calling the create method of service
		try {
			service.create(car);
			request.setAttribute("message", "Car Successfully Added !");
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);

		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			request.setAttribute("message", e.getMessage());
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("create.jsp");
			requestDispatcher.forward(request, response);

		}

	}

}

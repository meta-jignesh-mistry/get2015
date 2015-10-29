package com.carwebsite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carwebsite.Service;

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
		Car car = create(request);

		
		Service service = new Service();
		//calling the create method of service
		boolean flag = service.create(car);
		
		request.setAttribute("message", "Car Successfully Added !");
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);

	}

	
	// setting the car attributes in Car object
	private Car create(HttpServletRequest request) {

		Car car = new Car();
		car.setMake(request.getParameter("company"));
		car.setModel(request.getParameter("model"));
		car.setEngineInCc(Integer.parseInt(request.getParameter("engine")));
		car.setFuelCapacity(Integer.parseInt(request.getParameter("fuel")));
		car.setMilage(Integer.parseInt(request.getParameter("milage")));
		car.setPrice(Integer.parseInt(request.getParameter("showroomprice")));
		car.setRoadTax(Integer.parseInt(request.getParameter("roadtax")));
		car.setOnRoadPrice(Integer.parseInt(request.getParameter("roadprice")));
		car.setAc(request.getParameter("ac"));
		car.setAccessoriesKit(request.getParameter("accessorieskit"));
		car.setPowerSteering(request.getParameter("powersteering"));
		car.setImage(request.getParameter("image"));
		return car;

	}

}

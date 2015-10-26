package com.carwebsite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableServer.ForwardRequestHelper;

import com.carwebsite.db.helper.CarHelper;
import com.carwebsite.exception.CarSystemException;
import com.carwebsite.model.Car;

/**
 * Servlet implementation class DoEdit
 */
@WebServlet("/DoEdit")
public class DoEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Car car =createCar(request);
		System.out.println("car id is "+car.getvId());
		CarHelper carHelper = new CarHelper();
		
		try {
		carHelper.updateCar(car);
		} catch (CarSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String forwardUrl = "ViewSpecification?id="+car.getvId();
		response.sendRedirect(forwardUrl);
		
		
		
	}
	
	private Car createCar(HttpServletRequest request){
		
		Car car = new Car();
		
		car.setMake(request.getParameter("company"));
		car.setModel(request.getParameter("model"));
		car.setEngineInCc(Integer.parseInt(request.getParameter("engine")));
		car.setFuelCapacity(Integer.parseInt(request.getParameter("fuel")));
		car.setMilage(Integer.parseInt(request.getParameter("milage")));
		car.setAc(request.getParameter("ac"));
		car.setPowerSteering(request.getParameter("powersteering"));
		car.setAccessoriesKit(request.getParameter("accessoryKit"));
		car.setPrice(Integer.parseInt(request.getParameter("showroomprice")));
		car.setRoadTax(Integer.parseInt(request.getParameter("roadtax")));
		car.setOnRoadPrice(Integer.parseInt(request.getParameter("roadprice")));
		car.setvId(Integer.parseInt(request.getParameter("id")));
		return car;
	}
	

}

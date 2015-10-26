package com.carwebsite.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
      System.out.println("vehicle id is="+request.getParameter("id"));
      CarHelper carHelper = new CarHelper();
      Car car=null;
      try {
		car=carHelper.getCar(Integer.parseInt(request.getParameter("id")));
		System.out.println("Ac = "+car.getAc()+" model= "+car.getModel());
		request.setAttribute("car",car);
		RequestDispatcher requestDispatcher =
			    request.getRequestDispatcher("viewspecification.jsp");
		requestDispatcher.forward(request, response);
	} catch (NumberFormatException | CarSystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("can not view full specification");
	}
      
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

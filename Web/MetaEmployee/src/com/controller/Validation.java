
package com.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.Introspection;

import com.helper.EmployeeMain;
import com.models.Employee;

/**
 * Servlet implementation class Validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validation() {
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
		String stringId = request.getParameter("id");
		int id = Integer.parseInt(stringId);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String stringAge = request.getParameter("age");
		int age = Integer.valueOf(stringAge);
		String registrationDate = request.getParameter("date");
		
		String idRegex = "[0-9]+";
		String nameRegex = "[a-zA-Z]+";
		String message = "";
		
		int flag;
		if (!stringId.matches(idRegex)) {
			flag = 0;
			message = "invalid ID,it should be an integer";
		}

		else if (!name.matches(nameRegex)) {
			flag = 0;
			message = "invalid  name";
		} 

		else {
			flag = 1;
			message = "Registration Successful";
		}
	
       String stringEmployeeId=request.getParameter("employeeId");
       int employeeId=Integer.parseInt(stringEmployeeId);
		if (flag == 0) {
			
	       request.setAttribute("newUserId", employeeId);
	       request.setAttribute("message", message);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("RegistrationPage.jsp");
			
			requestDispatcher.forward(request, response);
			
				
		} else {
           
			Map<Integer, Employee> employeeCache = new ConcurrentHashMap<Integer, Employee>();
			employeeCache = EmployeeMain.getAllEmployees();
          
			EmployeeMain.employeesCache.put(id, new Employee(name, email, age,
					id, registrationDate));
			
			response.sendRedirect("EmployeeListPageController");
			
			

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

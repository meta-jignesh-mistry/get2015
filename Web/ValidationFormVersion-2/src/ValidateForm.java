import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateForm
 */
@WebServlet("/ValidateForm")
public class ValidateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidateForm() {
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

		
		//getting all name field values from request
		
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		String confirmPassword = request.getParameter("cpwd");
		
		int flag = 0;
		
		String message = "";
		//check for empty name field
		if (name.length() == 0) {
			flag = 1;
			message = "Username field Empty";
		} 
		//check for empty password field
		 else if (password.length() == 0) {
			flag = 1;
			message = "Password field Empty";
		} 
		 //check for empty confirm password field
		 else if (confirmPassword.length() == 0) {
			flag = 1;
			message = "Confirm Password field Empty";
		} 
		 // check for equality of password and confirm password
		 else if (!password.equals(confirmPassword)) {
			flag = 1;
			message = "Password doesn't match";
		}
		
		if (flag == 1) {
			request.setAttribute("result", message);
			//dispatching the request to another servlet
			request.getRequestDispatcher("RedirectedValidate").forward(request,
					response);
		} else {
			response.sendRedirect("home.jsp");
		}

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

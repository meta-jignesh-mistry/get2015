<%@page import="java.util.Map"%>
<%@page import="java.util.concurrent.ConcurrentHashMap"%>
<%@page import="com.models.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>

<body>

	<%
    Employee employee = (Employee)request.getAttribute("employee");
    
	%>
	<table align="center">
	
	
	
	<% 
	
	
	out.println("<tr><td>Name :</td><td>"+employee.getName()+"</td></tr>");
    out.println("<tr><td>Email :</td><td>"+employee.getEmail()+"</td></tr>");
    out.println("<tr><td>Employee Id :</td><td>"+employee.getEmployeeID()+"</td></tr>");
    out.println("<tr><td>Age :</td><td>"+employee.getAge()+"</td></tr>");
     out.println("<tr><td>Registration Date :</td><td>"+employee.getDateOfRegistration()+"</td></tr>");
     
     out.println("<tr><td><a style='float: left;margin-left:20px;' href='/MVC_Session-1/LandingPage.jsp'>Home</a></td><td><a style='float: left;margin-left:20px;' href='/MVC_Session-1/RegistrationPageController'>Registration</a></td></tr>");
    

%>
</table>
</body>

</html>
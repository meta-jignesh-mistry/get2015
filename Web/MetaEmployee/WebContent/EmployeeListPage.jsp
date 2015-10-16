<%@page import="java.util.Map"%>
<%@page import="java.util.concurrent.ConcurrentHashMap"%>
<%@page import="com.models.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="styleSheet" type="text/css" href="css/LandingPageStyle.css"></link>
<script type="text/javascript" src="javascript/Script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registered Employees List</title>
</head>

<body>
<div id="wrapper">
<header>
			<img src="images/metacubeLogo.jpg" id="metacubeLogo"> <img
				id="imageSlider" src="images/homeBanner01.png" />
</header>
<h1 align="center">Employees List</h1>
<table class="tablestyle" align="center">
	<%
	
String id=request.getParameter("id");
Map<Integer, Employee> employeesList  = (Map<Integer, Employee>)request.getAttribute("employeesList");

for(int i=1;i<=employeesList.size();i++){
			Employee employee=employeesList.get(i);
   
       out.println("<tr><td>"+employee.getRegisteredEmployees()+"</td>");
  out.write("<td><a class='stylenone' href='/MVC_Session-1/ViewDetailsController?id="+employee.getEmployeeID()+"'> View Details </a></td>");
   
  out.write("<td><a class='stylenone' href='/MVC_Session-1/EditEmployeeDetailsController?id="+employee.getEmployeeID()+"'>Edit </a><br></td>");
  out.write("</tr>");
}

%>
</table>
<p align="center"><a href="LandingPage.jsp">Home </a></p>
</div>
</body>

</html>
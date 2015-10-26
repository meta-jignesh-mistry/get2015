<%@page import="com.carwebsite.model.Vehicle"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" />
<title>CarDekho.com</title>
<script type="text/javascript" src="js/javascript.js"></script>
</head>
<body>
<h1>i am on Search Result page</h1>
<% ArrayList<Vehicle> listOfCar =(ArrayList<Vehicle>)request.getAttribute("listOfCar"); 
String result="";
if(listOfCar==null){
	result="No Car Found";
}
else{
	
	%>
	<%String url="";
			if(request.getParameter("admin")==null){
				url="";
			}
			else{
				url="admin=admin";
			}
				%>
				
	<h1 class="white" ><%=result%></h1>
	<table  align="center" class="tableStyle  white" >
	<tr><th></th><th>Company</th><th>Model</th><th>Milage</th><th>Price</th></tr>
	<% 
	for(Vehicle vehicle:listOfCar){
		%>
		<tr><td><img src='image/<%=vehicle.getImage()%>' width="200px" height="150px" alt="<%=vehicle.getImage()%>"/></td><td><%=vehicle.getMake() %></td><td><%=vehicle.getModel() %></td><td><%=vehicle.getMilage() %></td><td><%=vehicle.getPrice() %></td><td><a href='ViewSpecification?id=<%=vehicle.getvId()%>&<%=url%>'>View Full Specification</a></td>
		
		<%if(request.getParameter("admin")!=null){ %>
		<td><a href='ShowEdit?id=<%=vehicle.getvId()%>'>Edit</a></td>
		<%} %>
		
		
		</tr>
		
		<% 	
	}
}
%>
</table>
</body>
</html>
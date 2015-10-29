<%@ page session="false" %>
<%@page import="com.carwebsite.model.Vehicle"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<title>CarDekho.com</title>
<script type="text/javascript" src="js/javascript.js"></script>
</head>
<body>
<%HttpSession session =request.getSession(false); %>
<header>
			<div id="head">
			
	
			
				<nav>
					<ul>
					<li><a href="index.jsp" ><button type="button" class="btn btn-info btn-lg"
								data-toggle="modal">Home</button></a></li>
					</ul>

				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>


<% ArrayList<Vehicle> listOfCar =(ArrayList<Vehicle>)request.getAttribute("listOfCar"); 
String result="";

if(listOfCar.isEmpty()){
	result="Sorry ! No Car Found";
	%>
	<h1 style="color:black;" align="center" ><%=result%></h1>
	<div align="center"><img src="image/" alt="no car found" width="400px" height="500px" /></div>
	<% 
	
}
else{
	
	%>
	
	<div class="allcar">	
 <table class="table table-hover">
    <thead>
      <tr>
        <th></th>
        <th>Company</th>
        <th>Model</th>
          <th>Milage</th>
            <th>Price</th>
            <th></th>
            <th></th>
      </tr>
    </thead>
    
    <tbody>
    <% 
	for(Vehicle vehicle:listOfCar){
		%>
      <tr>
       <td><img src='image/<%=vehicle.getImage()%>' width="200px" height="150px" alt="<%=vehicle.getImage()%>"/></td>
       <td><%=vehicle.getMake() %></td>
       <td><%=vehicle.getModel() %></td>
       <td><%=vehicle.getMilage() %></td>
        <td><%=vehicle.getPrice() %></td>
        <td><a href="ViewSpecification?id=<%=vehicle.getvId()%>" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-zoom-in"></span>View
        </a></td>
       <%if(session!=null){ %>
		<td><a href="ShowEdit?id=<%=vehicle.getvId()%>" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-wrench"></span> Edit
        </a></td>
		<%} %>
      </tr>
 
 		<% 	
	}
}
%>
 
    </tbody>
  </table>
</div>		

</body>
</html>
<%@page import="com.carwebsite.model.Car"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Maruti Swift</title>
<link href="css/style.css" rel="stylesheet" />

<script type="text/javascript" src="js/javascript.js"></script>
</head>
<body >
	<div id="wrapper">

		<header>
			<div id="head">
			
			<% String url="";
			if(request.getParameter("admin")!=null){
			url="admin=admin";
			
			}
			else{
				url="";
			}
				%>
			
				<nav>
					<ul>
					<li><a href="index.jsp?<%=url%>" >Home</a></li>
					</ul>

				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>

		<div style="color:white">
<% Car car = (Car)request.getAttribute("car"); %>
			<p >company name = <%=car.getMake()%></p>
			<p >model  = <%=car.getModel()%></p>
			<p>engineIncc=<%=car.getEngineInCc()%></p>
			<p>fuelCapacity=<%=car.getFuelCapacity() %></p>
			
			<p>Milage=<%=car.getMilage() %></p>
			<p>On Road Price <%=car.getOnRoadPrice() %></p>
			
			<p>PowerSteering=<%=car.getPowerSteering()%></p>
			<p>Ac=<%=car.getAc() %></p>
			<p>Accessory Kit= <%=car.getAccessoriesKit() %></p>
			
		</div>
	
	</div>

</body>
</html>
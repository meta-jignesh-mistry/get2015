<%@ page session="false"%>
<%@page import="com.carwebsite.model.Car"%>
<!DOCTYPE html>
<html>
<head>
<script>
function goBack() {
    window.history.back();
}
</script>
<meta charset="ISO-8859-1">
<title>Maruti Swift</title>
<link href="css/style.css" rel="stylesheet" />
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="js/javascript.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>
<%HttpSession session =request.getSession(false); %>
<body>
	<div id="wrapper">

		<header>
			<div id="head">


				<nav>
					<ul>
						<li><button type="button" class="btn btn-info btn-lg"
								data-toggle="modal" onclick="goBack()">Back</button></li>
						<li><a href="index.jsp"><button type="button"
									class="btn btn-info btn-lg" data-toggle="modal">Home</button></a></li>
					</ul>

				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>


		<%
			Car car = (Car) request.getAttribute("car");
		%>

		<div class="carimage">
			<img src="image/<%=car.getImage()%>" width="480px" height="420px" />
			<p align="center">
				<span class="bold">On Road Price : </span> <span class="size">&nbsp;
					<%=car.getOnRoadPrice()%></span>
			</p>
		</div>

		<div class="specification">
			<table class="table table-hover">
				<tbody>
					<tr>
						<td class="success">Company</td>
						<td class="active"><%=car.getMake()%></td>
					</tr>
					<tr>
						<td class="danger">Model</td>
						<td class="active"><%=car.getModel()%></td>
					</tr>
					<tr>
						<td class="info">EngineInCC</td>
						<td class="active"><%=car.getEngineInCc()%></td>
					</tr>
					<tr>
						<td class="warning">Fuel Capacity</td>
						<td class="active"><%=car.getFuelCapacity()%></td>
					</tr>
					<tr>
						<td class="success">Milage</td>
						<td class="active"><%=car.getMilage()%></td>
					</tr>
					<tr>
						<td class="danger">Power Steering</td>
						<td class="active"><%=car.getPowerSteering()%></td>
					</tr>
					<tr>
						<td class="info">AC</td>
						<td class="active"><%=car.getAc()%></td>
					</tr>
					<tr>
						<td class="warning">Accessory Kit</td>
						<td class="active"><%=car.getAccessoriesKit()%></td>
					</tr>

				</tbody>
			</table>
		</div>
	</div>
</body>
</html>

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
<title>Edit</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" />
<script type="text/javascript" src="js/javascript.js"></script>

</head>
<body >
<%@page errorPage="error.jsp" %>


<% Car car = (Car)request.getAttribute("car"); %>
	<div id="wrapper">

		<header>
			<div id="head">
				<nav>
					<ul>
					<li><button type="button"
									class="btn btn-info btn-lg" data-toggle="modal" onclick="goBack()">Back</button></li>
						<li><a href="create.jsp"><button type="button" class="btn btn-info btn-lg"
								 >Create</button></a></li>
						<li><a href="index.jsp"><button type="button" class="btn btn-info btn-lg"
								 >Home</button></a></li>
						<li id="logout"><a href="DoLogOut"><button type="button" class="btn btn-info btn-lg"
								 >Log Out</button></a></li>

					</ul>

				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>
		<div id="fulldetail" >
			<br>
			<form action="DoEdit" method="post" >
				<table align="center" class="aligncenter">
				<tr>
						
						<td colspan="2"><img src='image/<%=car.getImage()%>' width="200px" height="100px"/></td>
					</tr>
					
					<tr>
						<td><h3>Company :</h3></td>
						<td><input type="text" id="company" name="company"
							value="<%=car.getMake() %>" id="email" required></td>
					</tr>
					<tr>
						<td><h3>Model :</h3></td>
						<td><input type="text" id="model" name="model" value="<%=car.getModel() %>" required></td>
					</tr>
					<tr>
						<td><h3>EngineInCC :</h3></td>
						<td><input type="number" id="engine" name="engine"
							value="<%=car.getEngineInCc() %>" required></td>
					</tr>
					<tr>
						<td><h3>FuelCapacity :</h3></td>
						<td><input type="number" id="fuel" name="fuel" value="<%=car.getFuelCapacity() %>" required></td>
					</tr>
					<tr>
						<td><h3>Milage :</h3></td>
						<td><input type="number" id="milage" name="milage" value="<%=car.getMilage() %>" required></td>
					</tr>
					<tr>
						<td><h3>AC :</h3></td>
						<td><input type="text" id="ac" name="ac"
							value="<%=car.getAc()%>" required></td>
					</tr>
			<tr>
						<td><h3>Power Steering :</h3></td>
						<td><input type="text" id="powersteering" name="powersteering"
							value="<%=car.getPowerSteering()%>" required></td>
					</tr>
			<tr>
						<td><h3>Accessory Kit :</h3></td>
						<td><input type="text" id="accessoryKit" name="accessoryKit"
							value="<%=car.getAccessoriesKit()%>" required></td>
					</tr>
			
					<tr>
						<td><h3>Ex-showroomPrice :</h3></td>
						<td><input type="number" id="showroomprice"
							name="showroomprice" value="<%=car.getPrice() %>" required></td>
					</tr>
					<tr>
						<td><h3>RoadTax :</h3></td>
						<td><input type="number" id="roadtax" name="roadtax"
							onclick=" setroadTax()" value="<%=car.getRoadTax() %>" required></td>
					</tr>
					<tr>
						<td><h3>OnRoadPrice :</h3></td>
						<td><input type="number" id="roadprice" name="roadprice"
							value="<%=car.getOnRoadPrice()%>" required></td>
					</tr>
		

				</table>
					<input type="hidden" name="id" value="<%=car.getvId()%>" />
				<button class="btnStyle " type="submit" value="Submit" >Submit
				</button>
			</form>


		</div>



	</div>

</body>
</html>
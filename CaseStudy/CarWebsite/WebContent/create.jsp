<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" />

<script type="text/javascript" src="js/javascript.js"></script>
</head>
<body>
	<%
		HttpSession session1 = request.getSession();
		if(session1.getAttribute("id") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<div id="wrapper">

		<header>
			<div id="head">
				<nav>
					<ul>

						<li><a href="index.jsp?admin=admin">Home</a></li>

					</ul>

				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>
		<div id="detail">
			<br>
			<form action="Create" method="post">
				<table class="aligncenter" align="center">
					<tr>
						<td><h3>Company :</h3></td>
						<td><input type="text" id="company" name="company" required></td>
					</tr>
					<tr>
						<td><h3>Model :</h3></td>
						<td><input type="text" id="model" name="model" required></td>
					</tr>
					<tr>
						<td><h3>Upload Image:</h3></td>
						<td><input type="file" name="image" id="image"></td>
					</tr>
					<tr>
						<td><h3>EngineInCC :</h3></td>
						<td><input type="number" id="engine" name="engine" required></td>
					</tr>
					<tr>
						<td><h3>FuelCapacity :</h3></td>
						<td><input type="number" id="fuel" name="fuel" required></td>
					</tr>
					<tr>
						<td><h3>Milage :</h3></td>
						<td><input type="number" id="milage" name="milage" required></td>
					</tr>
					<tr>
						<td><h3>AC :</h3></td>
						<td>Yes<input type="radio" id="ac" name="ac" value="yes"
							checked>No<input type="radio" id="ac" name="ac"
							value="no"></td>
					</tr>
					<tr>
						<td><h3>PowerSteering :</h3></td>
						<td>Yes<input type="radio" id="powersteering"
							name="powersteering" value="yes" checked>No<input
							type="radio" id="powersteering" name="powersteering" value="no"></td>
					</tr>
					<tr>
						<td><h3>AccessoryKit :</h3></td>
						<td><input type="text" id="akit" name="accessorieskit"
							required="required"></td>
					</tr>
					<tr>
						<td><h3>Ex-showroomPrice :</h3></td>
						<td><input type="number" id="showroomprice"
							name="showroomprice" required></td>
					</tr>
					<tr>
						<td><h3>RoadTax :</h3></td>
						<td><input type="number" id="roadtax" name="roadtax" required></td>
					</tr>
					<tr>
						<td><h3>OnRoadPrice :</h3></td>
						<td><input type="number" id="roadprice" name="roadprice"
							required></td>
					</tr>

				</table>

				<button class="btnStyle " type="submit" value="Submit">Submit</button>
			</form>



		</div>



	</div>

</body>
</html>
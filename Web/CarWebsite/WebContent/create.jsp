<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create car</title>

<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" />
<script type="text/javascript" src="js/javascript.js"></script>

</head>
<body>

	<div id="wrapper">

		<header>
			<div id="head">
				<nav>
					<ul>
						<li><a href="index.jsp"><button type="button"
									class="btn btn-info btn-lg" data-toggle="modal">Home</button></a></li>


					</ul>

				</nav>

			</div>
			<img src="image/car.png" id="image" class="img-responsive img-circle" />
		</header>
		<p align="center" style="color: red; font-weight: bold">${message}</p>
		<div id="detail">
			<br>
			<form action="Create" method="post">
				<table class="aligncenter" align="center">
					<tr>
						<td>Company :</td>
						<td><input type="text" id="company" name="company" required></td>
					</tr>
					<tr>
						<td>Model :</td>
						<td><input type="text" id="model" name="model" required></td>
					</tr>
					<tr>
						<td>Upload Image:</td>
						<td><input type="file" name="image" id="image" required></td>
					</tr>
					<tr>
						<td>EngineInCC :</td>
						<td><input type="number" id="engine" name="engine" required></td>
					</tr>
					<tr>
						<td>FuelCapacity :</td>
						<td><input type="number" id="fuel" name="fuel" required></td>
					</tr>
					<tr>
						<td>Milage :</td>
						<td><input type="number" id="milage" name="milage" required></td>
					</tr>
					<tr>
						<td>AC :</td>
						<td>Yes<input type="radio" id="ac" name="ac" value="yes"
							checked>&nbsp;&nbsp;No<input type="radio" id="ac"
							name="ac" value="no"></td>
					</tr>
					<tr>
						<td>PowerSteering :</td>
						<td>Yes<input type="radio" id="powersteering"
							name="powersteering" value="yes" checked>&nbsp;&nbsp;No<input
							type="radio" id="powersteering" name="powersteering" value="no"></td>
					</tr>
					<tr>
						<td>AccessoryKit :</td>
						<td><input type="text" id="akit" name="accessorieskit"
							required="required"></td>
					</tr>
					<tr>
						<td>Ex-showroomPrice :</td>
						<td><input type="number" id="showroomprice"
							name="showroomprice" required></td>
					</tr>
					<tr>
						<td>RoadTax :</td>
						<td><input type="number" id="roadtax" name="roadtax" required></td>
					</tr>
					<tr>
						<td>OnRoadPrice :</td>
						<td><input type="number" id="roadprice" name="roadprice"
							required></td>
					</tr>

				</table>
				<br> <br>
				<button type="submit" class="btn btn-info btn-lg"
					data-toggle="modal">Create</button>
			</form>



		</div>



	</div>

</body>
</html>
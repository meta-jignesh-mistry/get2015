
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" />
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<title>CarDekho.com</title>
<script type="text/javascript" src="js/javascript.js"></script>
<%
	String message = "";
	if (request.getAttribute("message") != null) {
		message = "Car Successfully Added";
	}

	if (request.getAttribute("invalid") == null) {
		System.out.println("before set");
	} else if (request.getAttribute("invalid").equals("true")) {
		System.out.println("After set");
%>
<script>
	$(document).ready(function() {
		$("#invalid").modal('show');
	});
</script>
<%
	}
%>

</head>
<body>
	<%
		HttpSession session = request.getSession(false);
	%>
	<%@page errorPage="error.jsp"%>
	<div id="wrapper">

		<header>
			<div id="head">
				<nav>

					<%
						if (session == null) {
					%>


					<ul>

						<li><button type="button" class="btn btn-info btn-lg"
								data-toggle="modal" data-target="#myModal">Log In</button></li>

						<%
							}

							if (session != null) {
						%>
						<ul>
							<li id="login"><a href="DoLogOut"><button type="button"
										class="btn btn-info btn-lg" data-target="DoLogOut">Log
										Out</button></a></li>

							<li id="login"><a href="create.jsp"><button
										type="button" class="btn btn-info btn-lg">Create</button></a></li>


							<%
								}
							%>
						</ul>
				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>
		<h3 align="center"><%=message%></h3>
		<div class="modal fade" id="invalid" role="dialog">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Access Denied</h4>
					</div>
					<div class="modal-body red">
						<p>Invalid User name or Password</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="addcar" role="dialog">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Success</h4>
					</div>
					<div class="modal-body red">
						<p>Car Added Successfully</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
		<section>
			<h1 align="center">Search</h1>
			<hr>
			<form action="Search" method="post">
				<h3 align="center" class="search">Company name</h3>
				<h3 align="center" class="search">
					<select class="searchBox" name="car">
						<option selected disabled value="">-Select-</option>
						<option value="maruti">Maruti</option>
						<option value="honda">Honda</option>
						<option value="hyundai">Hyundai</option>
						<option value="tata">Tata</option>
						<option value="ford">Ford</option>

					</select>
				</h3>
				<h3 align="center" class="search">Your Budget</h3>
				<h3 align="center" class="search">
					<select class="searchBox" name="budget">
						<option selected disabled value="">-Select-</option>
						<option value="onRoadPrice<300000">less than 3 lac</option>
						<option value="onRoadPrice BETWEEN 300000 AND 700000">between
							3 lac to 7 lac</option>
						<option value="onRoadPrice BETWEEN 700000 AND 2000000">between
							7 lac to 20 lac</option>
						<option value="onRoadPrice>2000000">more than 20 lac</option>

					</select>
				</h3>
				<br>
				<h3 align="center">
					<button type="submit" class="btn btn-info btn-lg"
						data-toggle="modal" data-target="#myModal">Search</button>
				</h3>
			</form>

		</section>
		<aside>

			<img width="700px" height="400px" id="imageslider"
				src="image/carback.jpg" />

		</aside>


	</div>
	<footer>
		<p align="center">@copyright2015</p>
	</footer>
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Log In</h4>
				</div>
				<div class="modal-body">
					<form role="form" action="AdminValidation" method="post">
						<div class="form-group">
							<label for="text">User Name :</label> <input type="text"
								class="form-control" id="username" name="username">
						</div>
						<div class="form-group">
							<label for="pwd">Password:</label> <input type="password"
								class="form-control" id="pwd" name="pwd">
						</div>
						<button type="submit" class="btn btn-default">Log In</button>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>

	</div>


</body>

</html>
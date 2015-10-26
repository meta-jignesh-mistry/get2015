

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" />
<title>CarDekho.com</title>
<script type="text/javascript" src="js/javascript.js"></script>
</head>
<body>

<%@page errorPage="error.jsp" %>
	<div id="wrapper">

		<header>
			<div id="head">
				<nav>
				<%=5/0 %>	
			<%String url="";
			if(request.getParameter("admin")==null){
				url="Search";%>
					<ul><li id="login"><a href="login.jsp">Log in</a></li>
				<%} %>
					<%
					//out.print(request.getAttribute("admin"));
					if(request.getParameter("admin")!=null){
						 url="Search?admin=admin";%>
					
					<li id="login"><a href="DoLogOut" >Log Out</a></li>
					
					<li id="login"><a href="create.jsp" >Create</a></li></ul>
			
			
			<%} %>

				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>
		<section>
			<h1 align="center">Search</h1>
			<hr>
			<form action='<%=url%>' method="post">
				<h3 align="center">Company name</h3>
				<h3 align="center">
					<select  class="searchBox" name="car">
						<option selected disabled value="">-Select-</option>
						<option value="maruti">Maruti</option>
						<option value="honda">Honda</option>
						<option value="hyundai">Hyundai</option>
						<option value="tata">Tata</option>
						<option value="ford">Ford</option>

					</select>
				</h3>
				<h3 align="center">Your Budget</h3>
				<h3 align="center">
					<select class="searchBox" name="budget">
						<option selected disabled value="">-Select-</option>
						<option value="onRoadPrice<300000">less than 3 lac</option>
						<option value="onRoadPrice BETWEEN 300000 AND 700000">between 3 lac to 7 lac</option>
						<option value="onRoadPrice BETWEEN 700000 AND 2000000">between 7 lac to 20 lac</option>
						<option value="onRoadPrice>2000000">more than 20 lac</option>

					</select>
				</h3>
				<br>
				<h3 align="center">
					<button class="btnStyle " type="submit" value="Submit" >Search
					</button>
				</h3>
			</form>

		</section>
		<aside>

			<img width="700px" height="400px" id="imageslider"
				src="image/car1.png" />

		</aside>


	</div>

</body>

</html>
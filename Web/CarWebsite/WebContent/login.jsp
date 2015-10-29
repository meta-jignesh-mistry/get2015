<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/style.css" rel="stylesheet" />
<title>Admin log in</title>
<script type="text/javascript" src="js/javascript.js">	
</script>
</head>
<body>
	<div id="wrapper">

		<header>
			<div id="head">
				<nav>
					<ul>
						<li id="home"><a href="index.jsp">Home</a></li>


					</ul>

				</nav>

			</div>
			<img src="image/car.png" id="image" />
		</header>

		<div id="loginBoxForAdmin">
			<form action="AdminValidation" method="post">
				<h2 align="center">
				<% String result=null;
				if(request.getAttribute("message")==null){
					result="";
				}else{
					result=(String)request.getAttribute("message");
				}
					%>
				<h3><%=result %></h3>
					<u>Admin Log In</u>
				</h2>
				<div>
					<h3 align="center">User Name :</h3>
					<p align="center">
						<input type="text" name="username" id="username" />
					</p>
				</div>
				<div>
					<h3 align="center">Password :</h3>
					<p align="center">
						<input type="password" name="pwd" id="pwd" />
					</p>
				</div>
				<p align="center">
					<input type="submit" name="submit" id="submit" value="Log-in"
						class="btnStyle" onclick="return isValidAdmin()" />
				</p>
			</form>
		</div>
		


	</div>

</body>
</html>


<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>XSS</title>
</head>

<body>
	<form action="CrossSideScriptHandler">

		<textarea rows="2" cols="6" name="input"
			style="border: 1px solid black;"></textarea>
		<input type="submit" value="submit" />
	</form>
	<label>Output =<%=request.getParameter("output") %></label>
</body>
</html>

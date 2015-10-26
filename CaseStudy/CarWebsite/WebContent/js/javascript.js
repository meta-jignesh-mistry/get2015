/**
 * 
 */
	function isValidAdmin() {
		var username = document.getElementById("username").value;
		var password = document.getElementById("pwd").value;
		if (username == "") {
			alert("Username Empty");
			return false;
		} else if (password == "") {
			alert("Password Empty");
			return false;
		}
		return true;
	}

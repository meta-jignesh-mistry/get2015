function selectCity() {

	var stateObject = document.getElementById("state");
	var cityObject = document.getElementById("city");

	switch (stateObject.value) {

	case "rajasthan":
		cityObject.innerHTML = "<option>Jaipur</option><option>Ajmer</option><option>Jodhpur</option><option>Jalore</option><option>Other</option>";
		break;
	case "mp":
		cityObject.innerHTML = "<option>Indor</option><option>Mandsor</option><option>Bhopal</option><option>Other</option>";
		break;
	case "up":
		cityObject.innerHTML = "<option>Aagra</option><option>Kanpur</option><option>Varanasi</option><option>Lucknow</option><option>Other</option>";
		break;
	case "maharashtra":
		cityObject.innerHTML = "<option>Mumbai</option><option>Pune</option><option>Nagpur</option><option>Thane</option><option>Other</option>";
		break;

	}

}

function activateSubmit() {
	if (document.getElementById("check").checked == true) {
		document.getElementById("submit").disabled = false;
	} else {
		document.getElementById("submit").disabled = true;
	}
}

function validateForm() {

	if (document.getElementById("firstname").value == "") {
		alert("First Name Required !");
		return false;
	} else if (!document.getElementById("firstname").value.match("[a-zA-Z]+")) {

		alert("First Name can't have number or special characters !");
		return false;
	} else if (document.getElementById("lastname").value == "") {
		alert("Last Name Required !");
		return false;
	}

	else if (!document.getElementById("lastname").value.match("[a-zA-Z]+")) {

		alert("Last Name can't have number or special characters !");
		return false;
	} else if (document.getElementById("pwd").value == "") {
		alert("Password Required");
		return false;
	} else if (document.getElementById("cpwd").value == "") {
		alert("Confirm Password Required !");
		return false;
	} else if (document.getElementById("pwd").value != document
			.getElementById("cpwd").value) {

		alert("Password didn't match with Confirm password ");
		return false;
	} else if (document.getElementById("age").value == "") {

		alert("Age Required ! ");
		return false;
	} else if (document.getElementById("age").value < 1
			|| document.getElementById("age").value > 100) {

		alert("Age field can't have age less than 1 or grater than 100 ");
		return false;
	} else if (document.getElementById("state").value == "select") {

		alert("State name Required !");
		return false;
	} else if (document.getElementById("city").value == "select") {

		alert("City name Required !");
		return false;
	} else if (document.getElementById("address").value == "") {

		alert("Address Required !");
		return false;
	} else {

		return true;

	}

}
function showMessage() {

	alert("Form Successfully Submitted");

}

/**
 * 
 */
var step = 0;
var image = new Array();

image[0] = "../image/car1.jpg";

image[1] = "../image/car2.png";

image[2] = "../image/car3.jpg";

function visiblityOfCreate() {
	if (localStorage.getItem("userType") == "user") {
		var create = document.getElementById("create");
		create.innerHTML = "";
		var logout = document.getElementById("logout");
		logout.innerHTML = "";
		var dashboard = document.getElementById("dashboard");
		dashboard.innerHTML = "";
	} else if (localStorage.getItem("userType") == "admin") {
		var userhome = document.getElementById("userhome");
		userhome.innerHTML = "";
	}

}
function onCreate() {
	alert('Car Created successfully !');
}
function onEdit() {
	alert('Car Edited  successfully !');
}
function setUser() {

	localStorage.userType = "user";

}
function visiblityOfEdit() {
	if (localStorage.getItem("userType") == "user") {

		var edit1 = document.getElementById("edit1");
		edit1.innerHTML = "";
		var edit2 = document.getElementById("edit2");
		edit2.innerHTML = "";
		var edit3 = document.getElementById("edit3");
		edit3.innerHTML = "";
		var edit4 = document.getElementById("edit4");
		edit4.innerHTML = "";
		var edit5 = document.getElementById("edit5");
		edit5.innerHTML = "";
	} else if (localStorage.getItem("userType") == "admin") {
		var a1 = document.getElementById("edit1");
		a1.innerHTML = "Edit";
		var a2 = document.getElementById("edit2");
		a2.innerHTML = "Edit";
		var a3 = document.getElementById("edit3");
		a3.innerHTML = "Edit";
		var a4 = document.getElementById("edit4");
		a4.innerHTML = "Edit";
		var a5 = document.getElementById("edit5");
		a5.innerHTML = "Edit";
	}

}

function imageSlider() {
	if (step < 2) {
		step++;

	} else {
		step = 0;

	}
	document.getElementById("imageslider").src = image[step];
	setTimeout("imageSlider()", 1500);
}

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

		var li1 = document.getElementById("create");
		li1.innerHTML = "";
		var li2 = document.getElementById("logout");
		li2.innerHTML = "";

	}

}
function visiblityOfEdit() {
	if (localStorage.getItem("userType") == "user") {

		var a1 = document.getElementById("edit1");
		a1.innerHTML = "";
		var a2 = document.getElementById("edit2");
		a2.innerHTML = "";
		var a3 = document.getElementById("edit3");
		a3.innerHTML = "";
		var a4 = document.getElementById("edit4");
		a4.innerHTML = "";
		var a5 = document.getElementById("edit5");
		a5.innerHTML = "";
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

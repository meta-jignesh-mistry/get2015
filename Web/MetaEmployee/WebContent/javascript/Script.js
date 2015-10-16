var step = 0;
var image = new Array();

image[0] = "images/homeBanner01.png";

image[1] = "images/homeBanner02.png";

image[2] = "images/homeBanner03.png";

function imageSlider() {

	if (step < 2) {
		step++;

	} else {
		step = 0;

	}
	document.getElementById("imageSlider").src = image[step];
	setTimeout("imageSlider()", 2000);
}
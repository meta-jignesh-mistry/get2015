//call the function when document get loaded
$(document).ready(function() {

	// function to hide the content
	$("#hide").click(function() {

		$("#content").hide();
		$("#visible").show();
		$("#hidden").hide();

	});

	// function to show the content
	$("#show").click(function() {

		$("#content").show();
		$("#visible").hide();
		$("#hidden").show();
	});

	$("#visible").hide();
	$("#hidden").css("color", "blue");

	// function to hide and show the content

	$("#showandhide").click(function() {
		$("#visible").toggle().css("color", "red");
		$("#hidden").toggle().css("color", "blue");
		$("#content").toggle();

	});
});

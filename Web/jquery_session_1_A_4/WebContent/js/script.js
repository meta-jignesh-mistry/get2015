// to display alternate backgroud color of the row of the table
$(document).ready(function() {

	$("tr:odd").css("background-color", "red");
	$("tr:even").css("background-color", "yellow");

	$("#change").click(function() {
		$("tr:odd").css("background-color", "yellow");
		$("tr:even").css("background-color", "red");

	});

});

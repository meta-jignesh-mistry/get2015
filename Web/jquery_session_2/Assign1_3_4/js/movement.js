$(document).ready(function() {
	$("#start").click(function() {
		$("#moveit").stop();
		$("#moveit").animate({
			marginLeft : '1300px'

		}, 8000);
	});
	$("#stop").click(function() {
		$("#moveit").stop();
	});

	$("#back").click(function() {
		$("#moveit").stop();
		$("#moveit").animate({
			marginLeft : '0px'

		}, 8000);
	});

	$("#left").click(function() {
		$("#moveit").stop();
		$("#moveit").animate({
			marginLeft : '-=50px'

		}, 2000);
	});

	$("#right").click(function() {
		$("#moveit").stop();
		$("#moveit").animate({
			marginLeft : '+=50px'

		}, 2000);
	});

	$("#top").click(function() {
		$("#moveit").stop();
		$("#moveit").animate({
			marginTop : '-=50px'

		}, 2000);
	});

	$("#bottom").click(function() {
		$("#moveit").stop();
		$("#moveit").animate({
			marginTop : '+=50px'

		}, 2000);
	});

});

var statusOfVisible = document.getElementById("visible");
statusOfVisible.style.display = 'none';

// function to toggle the content

function toggleContent() {
	var status = document.getElementById("content");
	toggleButtonContent();
	if (status.style.display == 'none') {
		status.style.display = '';
	} else {
		status.style.display = 'none';

	}

}

// function to toggle the value of button
function toggleButtonContent() {
	var statusOfVisible = document.getElementById("visible");
	var statusOfHidden = document.getElementById("hidden");
	if (statusOfVisible.style.display == 'none') {
		statusOfVisible.style.display = '';
	} else {
		statusOfVisible.style.display = 'none';

	}
	if (statusOfHidden.style.display == 'none') {
		statusOfHidden.style.display = '';
	} else {
		statusOfHidden.style.display = 'none';

	}

}

// function to show the content
function show() {
	var status = document.getElementById("content");
	var statusOfVisible = document.getElementById("visible");
	var statusOfHidden = document.getElementById("hidden");
	status.style.display = '';
	statusOfHidden.style.display = '';
	statusOfVisible.style.display = 'none';
}

// function to hide the content
function hide() {
	var status = document.getElementById("content");
	var statusOfVisible = document.getElementById("visible");
	var statusOfHidden = document.getElementById("hidden");
	status.style.display = 'none';
	statusOfHidden.style.display = 'none';
	statusOfVisible.style.display = '';
}

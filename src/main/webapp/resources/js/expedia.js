function isVaildForm() {

	var isValid = true;

	var maxTripStartDate = document.forms["mainForm"]["maxTripStartDate"].value;
	var minTripStartDate = document.forms["mainForm"]["minTripStartDate"].value;

	var maxStarRating = document.forms["mainForm"]["maxStarRating"].value;
	var minStarRating = document.forms["mainForm"]["minStarRating"].value;
	var maxTotalRate = document.forms["mainForm"]["maxTotalRate"].value;
	var minTotalRate = document.forms["mainForm"]["minTotalRate"].value;
	var maxGuestRating = document.forms["mainForm"]["maxGuestRating"].value;
	var minGuestRating = document.forms["mainForm"]["minGuestRating"].value;

	if (maxTripStartDate != ""
			&& !moment(maxTripStartDate, 'YYYY-M-D', true).isValid()) {
		isValid = false;
	}
	if (minTripStartDate != ""
			&& !moment(minTripStartDate, 'YYYY-M-D', true).isValid()) {
		isValid = false;
	}

	if (maxStarRating != "" && isNaN(maxStarRating)) {
		isValid = false;
	}
	if (minStarRating != "" && isNaN(minStarRating)) {
		isValid = false;
	}
	if (maxTotalRate != "" && isNaN(maxTotalRate)) {
		isValid = false;
	}
	if (minTotalRate != "" && isNaN(minTotalRate)) {
		isValid = false;
	}
	if (maxGuestRating != "" && isNaN(maxGuestRating)) {
		isValid = false;
	}
	if (minGuestRating != "" && isNaN(minGuestRating)) {
		isValid = false;
	}
	if (!isValid) {
		alert('Form is not valid');
	}
	return isValid;
}

function oooo() {
	alert('aaaa');
}
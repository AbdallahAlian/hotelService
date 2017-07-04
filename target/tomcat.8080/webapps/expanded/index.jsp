<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.expedia.JsonObjects.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">

<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/css/jquery-ui.min.css">
<script type="text/javascript" src="./resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="./resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./resources/js/jquery-ui.min.js"></script>

<title>Expedia Assignment Home Page</title>
</head>

<body>
	<div class="container">

		<br />
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10 well well-md">
				<h2>Hotel Service</h2>
				<form name="mainForm" action="index" method="get">
					<input type="hidden" name="cmd" value="Search">
					<div class="form-group col-md-12">
						<label>Destination Name</label>
						<input class="form-control" type="text" name="destinationName">
					</div>
					<div class="form-group col-md-5">
						<label> Minimum Trip Start Date </label>
						<input class="form-control datepicker" type="text" id="minTripStartDate" name="minTripStartDate">
					</div>
					<div class="form-group col-md-2"></div>
					<div class="form-group col-md-5">
						<label> Maximum Trip Start Date</label>
						<input class="form-control datepicker" type="text" id="maxTripStartDate" name="maxTripStartDate">
					</div>
					<div class="form-group col-md-12">
						<label> Length Of Stay</label>
						<input class="form-control" type="number" name="lengthOfStay">
					</div>
					<div class="form-group col-md-5">
						<label> Minimum Star Rating </label>
						<input class="form-control" step="0.5" type="number" name="minStarRating">
					</div>
					<div class="col-md-2"></div>
					<div class="form-group col-md-5">
						<label> Maximum Star Rating</label>
						<input class="form-control" step="0.5" type="number" name="maxStarRating">
					</div>
					<div class="form-group col-md-5">
						<label> Minimum Total Rate</label>
						<input class="form-control" step="0.5" type="number" name="minTotalRate">
					</div>
					<div class="col-md-2"></div>
					<div class="form-group col-md-5">
						<label> Maximum Total Rate </label>
						<input class="form-control" step="0.5" type="number" name="maxTotalRate">
					</div>
					<div class="form-group col-md-5">
						<label> Minimum Guest Rating</label>
						<input class="form-control" step="0.5" type="number" name="minGuestRating">
					</div>
					<div class="col-md-2"></div>
					<div class="form-group col-md-5">
						<label> Maximum Guest Rating</label>
						<input class="form-control" step="0.5" type="number" name="maxGuestRating">
					</div>
					<div class="form-group">
						<input onclick="return validateForm();" class="btn btn-info" style="width: 100%;" type="submit" value="Search">
					</div>
				</form>

			</div>
			<div class="col-md-1"></div>
		</div>
		<div class="row">

			<c:if test="${requestScope['MSG'] != null}">
				<h3 class="text-center">${requestScope['MSG']}</h3>
			</c:if>

			<c:forEach var="hotel" items="${requestScope['RESULT'].offers.getHotel()}">
				<div class="col-xs-12 col-sm-6 col-md-6 col-lg-4">
					<div style="background-color: rgb(245, 245, 245); padding: 5px; height: 170px;">
						<div class="row">
							<div class="col-md-4">
								<img src="${hotel.hotelInfo.hotelImageUrl}" alt="${hotel.hotelInfo.hotelName}">
							</div>

							<div class="col-md-8 text-right">
								<h4 class="text-warning">Star Rating ${hotel.hotelInfo.hotelStarRating} / 5.0</h4>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<h4>
									<a class="text-primary" href="${hotel.hotelUrls.hotelInfositeUrl}">${hotel.hotelInfo.hotelName}</a>
								</h4>
							</div>
						</div>
						<div class="row">
							<div class="col-md-5">
								<p class="text-muted">${hotel.hotelInfo.hotelCity}
									<a href="https://maps.google.com/?q=${hotel.hotelInfo.hotelLatitude},${hotel.hotelInfo.hotelLongitude}"> <span class="glyphicon glyphicon-map-marker"></span>
									</a>
								</p>
							</div>
							<div class="col-md-7 text-right">
								<p class="text-success">price/night ${hotel.hotelPricingInfo.originalPricePerNight} ${hotel.hotelPricingInfo.currency}</p>
							</div>
						</div>
					</div>
					<br />
				</div>
			</c:forEach>


		</div>


	</div>

	<script>
		$(".datepicker").datepicker({
			dateFormat : 'yy-mm-dd',
			minDate : new Date()
		});
		$("#minTripStartDate").on(
				"change",
				function() {
					$("#maxTripStartDate").datepicker("option", "minDate",
							$(this).val());

				});
		$("#maxTripStartDate").on(
				"change",
				function() {
					$("#minTripStartDate").datepicker("option", "maxDate",
							$(this).val());
				});

		function validateForm() {
			$("input").blur(function() {
				if ($(this).is(":invalid")) {
					return false;
				}
 			});
			return true;
		}
	</script>
</body>
</html>
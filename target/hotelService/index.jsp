<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.expedia.JsonObjects.*"%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<script src="http://momentjs.com/downloads/moment.min.js"></script>
<script src="./resources/js/expedia.js" language="javascript"></script>
<link rel="stylesheet" type="text/css"
	href="./resources/style/expediaStyle.css" />
<title>Expedia Assignment Home Page</title>
</head>
<body>
<body>
	<form name="mainForm" action="index" method="get"
		onsubmit="return isVaildForm()">
		<table>
			<tr>
				<td>Destination Name</td>
				<td><input type="text" name="destinationName"></td>
			</tr>
			<tr>
				<td>Minimum Trip Start Date</td>
				<td><input type="text" name="minTripStartDate"></td>
			</tr>
			<tr>
				<td>Maximum Trip Start Date</td>
				<td><input type="text" name="maxTripStartDate"></td>
			</tr>
			<tr>
				<td>Length Of Stay</td>
				<td><input type="number" name="lengthOfStay"></td>
			</tr>
			<tr>
				<td>Minimum Star Rating</td>
				<td><input type="text" name="minStarRating"></td>
			</tr>
			<tr>
				<td>Maximum Star Rating</td>
				<td><input type="text" name="maxStarRating"></td>
			</tr>
			<tr>
				<td>Minimum Total Rate</td>
				<td><input type="text" name="minTotalRate"></td>
			</tr>
			<tr>
				<td>Maximum Total Rate</td>
				<td><input type="text" name="maxTotalRate"></td>
			</tr>
			<tr>
				<td>Minimum Guest Rating</td>
				<td><input type="text" name="minGuestRating"></td>
			</tr>
			<tr>
				<td>Maximum Guest Rating</td>
				<td><input type="text" name="maxGuestRating"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Search" name="cmd"></td>
			</tr>
		</table>
	</form>

	<div>
		<c:forEach var="hotel"
			items="${requestScope['RESULT'].offers.getHotel()}">
			<h1>${hotel.hotelInfo.hotelName}</h1>
			<img src="${hotel.hotelInfo.hotelImageUrl}">
			<p>${hotel.hotelInfo.hotelStarRating}</p>
			<p>${hotel.hotelInfo.hotelLocation}</p>
			<p>${hotel.hotelInfo.hotelCity}</p>
			<p>${hotel.hotelPricingInfo.hotelTotalTaxesAndFees}</p>
			<p>${hotel.hotelPricingInfo.currency}</p>
			<a href="${hotel.hotelUrls.hotelInfositeUrl}">Link</a>
		</c:forEach>
	</div>
</body>
</html>
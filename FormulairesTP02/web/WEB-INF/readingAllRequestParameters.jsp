<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Reading All Request Parameters</title>
	<style type="text/css">
		/*td,th{padding: 5px;}*/
		th{background-color: #ef8429}
		/*table{border-collapse:collapse;}*/
	</style>
</head>
<body>
	<h1>Reading All Request Parameters</h1>
	<table border="1" >
		<tr>
			<th background="Gray">Parameter Name</th>
			<th>Parameter Value(s)</th>
		</tr>
		<tr>
			<td>Item Number</td>
			<td>${ itemNumber }</td>
		</tr>
		<tr>
			<td>Description</td>
			<td>${ description }</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${ priceEach }</td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>${ firstName }</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${ lastName }</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${ shippingAddress }</td>
		</tr>
		<tr>
			<td>Card Type</td>
			<td>${ creditCard }</td>
		</tr>
		<tr>
			<td>Card Number</td>
			<td><ul><li>${ (creditCardNumber1 == creditCardNumber2) ? creditCardNumber1 : "Vous avez fait une erreur de confirmation" }</li><li>${ (creditCardNumber1 == creditCardNumber2) ? creditCardNumber2 : "Vous avez fait une erreur de confirmation" }</li></ul></td>
		</tr>
	</table>
</body>
</html>
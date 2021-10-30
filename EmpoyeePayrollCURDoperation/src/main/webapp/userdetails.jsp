<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center">
		<h1 style="text-align: center">Employee Pay Roll Details</h1>
		
		<form method="POST" action = "addDataIntoDb" modelAttribute="userFormData">
			<table style="text-align: center">
				<tr>
					<th>Employee ID</th>
					<th><input type="number" name="employeeId" /></th>
				</tr>
				<tr>
					<th>Employee Name</th>
					<th><input type="text" name="employeeName" /></th>
				</tr>
				<tr>
					<th>Employee Salary</th>
					<th><input type="number" name="employeeSalary" /></th>
				</tr>
				<tr>
					<th>Employee Address</th>
					<th><input type="text" name="employeeAddress" /></th>
				</tr>
				<tr>
					<th>Employee Age</th>
					<th><input type="number" name="employeeAge" /></th>
				</tr>
			</table>
			<button type="submit">Submit Details</button>
		</form>
		<div>
</body>
</html>
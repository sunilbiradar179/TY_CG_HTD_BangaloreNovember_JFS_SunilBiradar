<%@page import="com.capgmini.mywebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


 <%@page session="false" %>
 <%EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) request.getAttribute("employeeInfoBean"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
	<legend>Search Employee</legend>
	<form action="./searchEmployee3" method="get">
	Employee ID:<input type="number" name="empid" required><br>
	<input type="submit" value="search">
	
	
	</form>
	</fieldset>
		<%if(employeeInfoBean==null) { %>
		<h3> Employee Id Not Found</h3>
		<%} else { %>
		<h3> Details For EmployeeId<%=employeeInfoBean.getEmpId() %></h3>
		<br>
		Employee Name=<%= employeeInfoBean.getName() %><br>
		Employee Salary=<%= employeeInfoBean.getSalary() %><br>
		Employee Age=<%= employeeInfoBean.getAge() %><br>
		Employee Designation=<%= employeeInfoBean.getDesignation() %><br>
		<%} %>
</body>
</html>
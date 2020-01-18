<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./register" method="post">
		<fieldset>
			<legend>Employee Information</legend>


			<table>
				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Email :</td>
					<td><input type="Email" name="email"></td>
				</tr>

				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>



			</table>


		</fieldset>


		<fieldset>
			<legend>Employee Permanent Address</legend>


			<table>
				<tr>
					<td>Add Type :</td>
					<td><select name="addressBeans[0].addtype">
							<option >------select-----</option>
							<option value="P" >Permanent</option>
							<option value="T">Temporary</option>
					</select></td>
				</tr>

				<tr>
					<td>Address 1 :</td>
					<td><input type="text" name="addressBeans[0].add1"></td>
				</tr>

				<tr>
					<td>Address 2 :</td>
					<td><input type="text" name="addressBeans[0].add2"></td>
				</tr>

			</table>


		</fieldset>

		<fieldset>
			<legend>Employee Temporary Address</legend>


			<table>
				<tr>
					<td>Add Type :</td>
					<td><select name="addressBeans[1].addtype" size="1">
							<option >------select-----</option>
							<option value="P" >Permanent</option>
							<option value="T">Temporary</option>
					</select></td>
				</tr>

				<tr>
					<td>Address 1 :</td>
					<td><input type="text" name="addressBeans[1].add1"></td>
				</tr>

				<tr>
					<td>Address 2 :</td>
					<td><input type="text" name="addressBeans[1].add2"></td>
				</tr>

				<tr>
					<td><input type="submit" name="login"></td>
				</tr>

			</table>


		</fieldset>
	</form>

</body>
</html>
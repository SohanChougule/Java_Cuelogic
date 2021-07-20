<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addEmployee">
<h2>Add Employees</h2> 
Id = <input type = "number" name="eid"><br><br>
Name = <input type ="text" name="ename"><br><br>
Department = <input type ="text" name="department"><br><br>
<input type ="submit">
</form>

<hr>
<form action="getEmployee">
<h2>Get Employees By Id</h2>
Id = <input type = "number" name="eid"><br><br>
<input type ="submit">
</form>
<hr>
<form action="getEmpdept">
<h2>Get Employees By Department</h2>
Department = <input type = "text" name="department"><br><br>
<input type ="submit">
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register-page</title>
</head>
<body>

<h5>Student-Registration-Page</h5>
		
		<form action="studentRegister" method="get">
		   
		   <label>STUDENT-ID:</label><br>
		   <input type="number" placeholder="enter student id" name="id"><br>
		   <label>STUDENT-NAME:</label><br>
		   <input type="text" placeholder="enter student name" name="name"><br>
		   <label>STUDENT-EMAIL:</label><br>
		   <input type="email" placeholder="enter student email" name="email"><br>
		   <label>STUDENT-PASSWORD:</label><br>
		   <input type="password" placeholder="enter student password" name="password"><br>
		   <label>STUDENT-DOB:</label><br>
		   <input type="date"  name="dob"><br>
		   <label>STUDENT-PHONE:</label><br>
		   <input type="number" placeholder="enter student phone" name="phone"><br>
		   <label>STUDENT-ADDRESS:</label><br>
		   <input type="text" placeholder="enter student address" name="address"><br>
		   
		   <input type="submit" value="register">
		
		
		</form>
</body>
</html>



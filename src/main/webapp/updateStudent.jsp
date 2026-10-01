<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
			Integer.parseInt(request.getParameter("id"));
			
%>
<h5>Update form</h5>
<form action="updateStudent" method="post">


		 <label>STUDENT-ID:</label><br>
		   <input type="number" name="id"><br>
		   <label>STUDENT-NAME:</label><br>
		   <input type="text"name="name"><br>
		   <label>STUDENT-EMAIL:</label><br>
		   <input type="email" name="email"><br>
		   <label>STUDENT-PASSWORD:</label><br>
		   <input type="password"name="password"><br>
		   <label>STUDENT-DOB:</label><br>
		   <input type="date"  name="dob"><br>
		   <label>STUDENT-PHONE:</label><br>
		   <input type="number" name="phone"><br>
		   <label>STUDENT-ADDRESS:</label><br>
		   <input type="text" name="address"><br>
		   
		   <input type="submit" value="update">

</form>
</body>
</html>
<%@page import="com.qspider.jdbc_servlet_crud_operation.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.qspider.jdbc_servlet_crud_operation.dao.Studentdao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentHome</title>
</head>
<body>

<h4>Student login successfully</h4>
<%
		
		List<Student> list=new Studentdao().getAllStudent();
%>

<table border="2">

			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>DOB</th>
			<th>Phone</th>
			<th>Address</th>
			<th colspan="2">Action</th>
			</tr>
			 
			 <%for(Student student:list){ %> 
			 
			 <tr>
			 <td><%=student.getId() %></td>
			 <td><%=student.getName() %></td>
			 <td><%=student.getEmail() %></td>
			 <td><%=student.getPassword() %></td>
			 <td><%=student.getDob() %></td>
			 <td><%=student.getphoneNumber() %></td>
			 <td><%=student.getAddress() %></td>
			 <td><a href="delete?id=<%=student.getId()%>">Delete</a></td>
			 <td><a href="updateStudent.jsp?id=<%=student.getId()%>">Edit</a></td>
			 </tr>
			 
			<% }%>
</table>
</body>
</html>
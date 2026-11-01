<%@page import="java.io.PrintWriter"%>
<%@page import="com.qspider.jdbc_servlet_crud_operation.dao.Studentdao"%>
<%@page import="com.qspider.jdbc_servlet_crud_operation.dto.Student"%>
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
			int id=Integer.parseInt(request.getParameter("id"));
Student student=new Studentdao().getStudentsByIdDao(id);
HttpSession httpSession=request.getSession();
		Object object=httpSession.getAttribute("userSession");
		PrintWriter printWriter=response.getWriter();
%>


<% if(object!=null)
{
%>
<h5>Update form</h5>
<form action="updateStudent" method="post">


		 <label>STUDENT-ID:</label><br>
		   <input type="number" name="id" value="<%=student.getId()%>" readonly="readonly"><br>
		   <label>STUDENT-NAME:</label><br>
		   <input type="text"name="name" value="<%=student.getName()%>"><br>
		   <label>STUDENT-EMAIL:</label><br>
		   <input type="email" name="email" value="<%=student.getEmail()%>"><br>
		   <label>STUDENT-PASSWORD:</label><br>
		   <input type="password"name="password" value="<%=student.getPassword()%>"><br>
		   <label>STUDENT-DOB:</label><br>
		   <input type="date"  name="dob" value="<%=student.getDob()%>"><br>
		   <label>STUDENT-PHONE:</label><br>
		   <input type="number" name="phone" value="<%=student.getphoneNumber()%>"><br>
		   <label>STUDENT-ADDRESS:</label><br>
		   <input type="text" name="address" value="<%=student.getAddress()%>"><br>
		   
		   <input type="submit" value="update">

</form>

<%}else{
	printWriter.write("please login first");
	request.getRequestDispatcher("studentLogin.jsp").include(request, response);

	%>
		
<%} %>
</body>
</html>
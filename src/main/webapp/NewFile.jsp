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
			 int a=420;
			 for(int i=1;i<a;i++)
			 {%>
					
					 <h4 style="color:red;"> <%if(i%2==0)out.println(i);
					 %></h4>
					 <h4 style="color:blue:"><% if(i%2!=0) out.println(i); %></h4>
					 	<% }%>	 
			 
			
</body>
</html>
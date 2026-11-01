package com.qspider.jdbc_servlet_crud_operation.client.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.qspider.jdbc_servlet_crud_operation.dao.Studentdao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;


@WebServlet(value = "/studentLogin")
public class loginStudentController  extends HttpServlet{
	
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession httpSession=req.getSession();
	
	resp.setContentType("text/html");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	boolean b=new Studentdao().loginStudentDao(email,password);
	PrintWriter printWriter=resp.getWriter();
	
	if(b)
	{
		httpSession.setAttribute("userSession",email);
		req.getRequestDispatcher("studentHome.jsp").forward(req, resp);
	}
	else
	{
		printWriter.write("wrong credentials");
		req.getRequestDispatcher("studentLogin.jsp").include(req, resp);
		
	}
}
}

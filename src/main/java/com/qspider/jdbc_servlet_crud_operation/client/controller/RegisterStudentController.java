package com.qspider.jdbc_servlet_crud_operation.client.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.qspider.jdbc_servlet_crud_operation.dao.Studentdao;
import com.qspider.jdbc_servlet_crud_operation.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(value = "/studentRegister")
public class RegisterStudentController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		int  id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		LocalDate dob =LocalDate.parse(req.getParameter("dob"));
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		
		
		Studentdao studentdao=new Studentdao();
		Student stu=new Student();
		stu.setId(id);
		stu.setName(name);
		stu.setEmail(email);
		stu.setDob(dob);
		stu.setPassword(password);
		stu.setphoneNumber(phone);
		stu.setAddress(address);
		
		studentdao.registerStudentDao(stu);
		
		PrintWriter pr=resp.getWriter();
		pr.write("Student Registered Successfully...");
		RequestDispatcher dp=req.getRequestDispatcher("studentLogin.jsp");
		dp.include(req, resp);
		
		
		System.out.println("Hogyaa Bhaiyaa jii.....");
	}

}

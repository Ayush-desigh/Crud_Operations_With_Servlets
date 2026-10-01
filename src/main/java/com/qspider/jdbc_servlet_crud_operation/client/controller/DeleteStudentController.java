package com.qspider.jdbc_servlet_crud_operation.client.controller;

import java.io.IOException;

import com.qspider.jdbc_servlet_crud_operation.dao.Studentdao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(value = "/delete")
public class DeleteStudentController  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		
		boolean b=new Studentdao().deleteStudentById(id);
		if(b)
		{
			System.out.println("Deleted");
			req.getRequestDispatcher("studentHome.jsp").forward(req, resp);;
		}
		
		
		
	}

}

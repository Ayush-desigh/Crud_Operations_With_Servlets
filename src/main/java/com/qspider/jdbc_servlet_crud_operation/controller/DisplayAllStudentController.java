package com.qspider.jdbc_servlet_crud_operation.controller;

import java.util.List;

import com.qspider.jdbc_servlet_crud_operation.dao.Studentdao;
import com.qspider.jdbc_servlet_crud_operation.dto.Student;

public class DisplayAllStudentController {
	
	public static void main(String[] args) {
		
		Studentdao dao=new Studentdao();
		List<Student> student=dao.getAllStudent();
		System.out.println(student);
	}
	
	
	
	

}

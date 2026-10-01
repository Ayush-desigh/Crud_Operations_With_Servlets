package com.qspider.jdbc_servlet_crud_operation.controller;

import java.time.LocalDate;

import com.qspider.jdbc_servlet_crud_operation.dao.Studentdao;
import com.qspider.jdbc_servlet_crud_operation.dto.Student;

public class InsertStudentController {
	
public static void main(String[] args) {
		
		Studentdao dao=new Studentdao();
		
		
		Student student = new Student();
		
		student.setId(90);
		student.setName("akhilh");
		student.setEmail("akhilesh00@gmail.com");
		student.setPassword("Akhil@123#@");
		student.setDob(LocalDate.parse("1997-09-13"));
		student.setAddress("noida-up-201301");
		student.setphoneNumber(99887766);
		
//	int a =	dao.registerStudentDao(student);
	//	boolean b=dao.updateStudentById(student);
	//	dao.getAllStudent();
	
	//String ans=(b==false)?"Somthing Went Wrong":"Successfull";
	//System.out.println(ans);
	}

}

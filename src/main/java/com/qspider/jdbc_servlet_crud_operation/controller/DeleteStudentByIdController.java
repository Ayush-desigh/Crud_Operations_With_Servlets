package com.qspider.jdbc_servlet_crud_operation.controller;

import java.util.Scanner;

import com.qspider.jdbc_servlet_crud_operation.dao.Studentdao;

public class DeleteStudentByIdController {
	
	public static void main(String[] args) {
		
		Studentdao dao=new Studentdao();
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter student id to delete: ");
	        int id = sc.nextInt();

	        if (dao.deleteStudentById(id)) {
	            System.out.println("Student deleted successfully");
	        } else {
	            System.out.println("Student not deleted (id not found or error occurred)");
	        }
		
	}

}

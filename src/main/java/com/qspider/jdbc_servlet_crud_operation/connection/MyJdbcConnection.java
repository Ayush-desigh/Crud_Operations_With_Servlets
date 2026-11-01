package com.qspider.jdbc_servlet_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class MyJdbcConnection {
	
	public static Connection getMyJdbcConnection() throws SQLException
	{
		Driver driver=new Driver();
		
		DriverManager.registerDriver(driver);
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/data_baseName", "root",passeord);
	}

}

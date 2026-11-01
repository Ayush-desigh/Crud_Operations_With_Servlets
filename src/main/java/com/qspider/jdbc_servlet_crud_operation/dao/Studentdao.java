//package com.qspider.jdbc_servlet_crud_operation.dao;
//	
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//	import java.sql.ResultSet;
//	import java.sql.SQLException;
//import java.time.LocalDate;
//
//import com.qspider.jdbc_servlet_crud_operation.connection.MyJdbcConnection;
//	import com.qspider.jdbc_servlet_crud_operation.dto.Student;
//	
//	public class Studentdao {
//		
//		private final String INSERT_STUDENT_QUERY = 
//				"insert into student(id,name,email,password,dob,phoneNumber,address) values(?,?,?,?,?,?,?)";
//		
//		private final String Display_student_By_Id_Query="select * from student where id=?";
//		
//		private final String Update_Student_By_Id="update student set name=?, email=?, password=?, dob=?, phoneNumber=?, address=? where id=?";
//		private final String display_all_student_Query="select * from student";
//		
//		public int registerStudentDao(Student student) {
//			
//			if(!isExistStudentsById(student.getId()))
//			{
//				
//				try (Connection connection = MyJdbcConnection.getMyJdbcConnection();
//						
//						PreparedStatement ps = connection.prepareStatement(INSERT_STUDENT_QUERY);
//	
//					) {
//						
//					
//					  ps.setString(1, student.getName());
//			            ps.setString(2, student.getEmail());
//			            ps.setString(3, student.getPassword());
//			            ps.setObject(4, student.getDob());
//			            ps.setLong(5, student.getphoneNumber());
//			            ps.setString(6, student.getAddress());
//			            ps.setInt(7, student.getId()); 
//					return 	ps.executeUpdate();
//	
//					} catch (SQLException e) {
//						e.printStackTrace();
//						return 0;
//					}
//	
//			}
//			else
//			{
//				 System.out.println("Student already exists with id: " + student.getId());
//			        return 0;
//			}
//		
//	//		try (Connection connection = MyJdbcConnection.getMyJdbcConnection();
//	//				
//	//			PreparedStatement ps = connection.prepareStatement(INSERT_STUDENT_QUERY);
//	//
//	//		) {
//	//			
//	//			ps.setInt(1, student.getId());
//	//			ps.setString(2, student.getName());
//	//			ps.setString(3, student.getEmail());
//	//			ps.setString(4, student.getPassword());
//	//			ps.setObject(5, student.getDob());
//	//			ps.setLong(6,student.getphoneNumber());
//	//			ps.setString(7, student.getAddress());
//	//		return 	ps.executeUpdate();
//	//
//	//		} catch (SQLException e) {
//	//			e.printStackTrace();
//	//			return 0;
//	//		}
//		}
//		
//		public   boolean isExistStudentsById(int studentId)
//		{
//			try(
//					Connection con=MyJdbcConnection.getMyJdbcConnection();
//					PreparedStatement ps=con.prepareStatement(Display_student_By_Id_Query);
//					)
//			{
//				ps.setInt(1, studentId);
//				ResultSet re=ps.executeQuery();
//				if(re.next())
//				{
//					return true;
//				}
//				return false;
//				
//				
//			}
//			catch(SQLException e)
//			{
//				e.printStackTrace();
//				return false;
//			}
//		}
//		
//		
//		public boolean updateStudentById(Student student) {
//
//		    if (isExistStudentsById(student.getId())) {
//
//		        try (
//		            Connection con = MyJdbcConnection.getMyJdbcConnection();
//		            PreparedStatement ps = con.prepareStatement(Update_Student_By_Id)
//		        ) {
//		            ps.setString(1, student.getName());
//		            ps.setString(2, student.getEmail());
//		            ps.setString(3, student.getPassword());
//		            ps.setObject(4, student.getDob());
//		            ps.setLong(5, student.getphoneNumber());
//		            ps.setString(6, student.getAddress());
//		            ps.setInt(7, student.getId());   // WHERE id=?
//
//		            ps.executeUpdate();
//		            return true;
//
//		        } catch (SQLException e) {
//		            e.printStackTrace();
//		            return false;
//		        }
//
//		    } else {
//		        System.out.println("Student does not exist with id: " + student.getId());
//		        return false;
//		    }
//		}
//		
		package com.qspider.jdbc_servlet_crud_operation.dao;
		
		import java.io.PrintWriter;
import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
	import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qspider.jdbc_servlet_crud_operation.connection.MyJdbcConnection;
	import com.qspider.jdbc_servlet_crud_operation.dto.Student;
		
		public class Studentdao {
			
			private final String INSERT_STUDENT_QUERY = 
					"insert into student(id,name,email,password,dob,phoneNumber,address) values(?,?,?,?,?,?,?)";
			
			private final String Display_student_By_Id_Query=
										"select * from student where id=?";
			
			private final String Update_Student_By_Id=
								"update student set name=?, email=?, password=?, dob=?, phoneNumber=?, address=? where id=?";
			private final String display_all_student_Query=	
								"select * from student";
	
			private final String Delete_student_By_Id="delete from student where id=?";
			
			private  final String studentogin_query="select email,password from student where email=? and password=?";
			private final String Update_Query="update student set name=?,email=?,password=? ,dob=?,phoneNumber=?,address=? where id=?";
			
//==================================================================================//
					
//					public int updateStudentDao(Student student)
//					{
//				
//					}
			public int registerStudentDao(Student student) {
				
				if(!isExistStudentsById(student.getId()))
				{
					
					try (Connection connection = MyJdbcConnection.getMyJdbcConnection();
							
							PreparedStatement ps = connection.prepareStatement(INSERT_STUDENT_QUERY);
		
						) {
							
						
						ps.setInt(1, student.getId()); 
						  ps.setString(2, student.getName());
				            ps.setString(3, student.getEmail());
				            ps.setString(4, student.getPassword());
				            ps.setObject(5, student.getDob());
				            ps.setLong(6, student.getphoneNumber());
				            ps.setString(7, student.getAddress());
				            
						return 	ps.executeUpdate();
		
						} catch (SQLException e) {
							e.printStackTrace();
							return 0;
						}
		
				}
				else
				{
					 System.out.println("Student already exists with id: " + student.getId());
				        return 0;
				}
			
	//=========================================================================================
			}
			
			public   boolean isExistStudentsById(int studentId)
			{
				try(
						Connection con=MyJdbcConnection.getMyJdbcConnection();
						PreparedStatement ps=con.prepareStatement(Display_student_By_Id_Query);
						)
				{
					ps.setInt(1, studentId);
					ResultSet re=ps.executeQuery();
					if(re.next())
					{
						return true;
					}
					return false;
					
					
				}
				catch(SQLException e)
				{
					e.printStackTrace();
					return false;
				}
			}
			
			
			public   Student getStudentsByIdDao(int studentId)
			{
				try(
						Connection con=MyJdbcConnection.getMyJdbcConnection();
						PreparedStatement ps=con.prepareStatement(Display_student_By_Id_Query);
						)
				{
					ps.setInt(1, studentId);
					ResultSet re=ps.executeQuery();
					if(re.next())
					{
						Student student=new Student();
						student.setId(re.getInt("id"));
						student.setName(re.getString("name"));
						student.setEmail(re.getString("email"));
						student.setPassword(re.getString("password"));
						student.setDob(re.getDate("dob").toLocalDate());
						student.setAddress(re.getString("address"));
						student.setphoneNumber(re.getLong("phoneNumber"));
						
						return student;
						
					}
					return null;
					
					
				}
				catch(SQLException e)
				{
					e.printStackTrace();
					return null;
				}
			}
			
	//====================================================================================//	
			public boolean updateStudentById(Student student) {

			    

			        try (
			            Connection con = MyJdbcConnection.getMyJdbcConnection();
			            PreparedStatement ps = con.prepareStatement(Update_Student_By_Id)
			        ) {
			            ps.setString(1, student.getName());
			            ps.setString(2, student.getEmail());
			            ps.setString(3, student.getPassword());
			            ps.setObject(4, student.getDob());
			            ps.setLong(5, student.getphoneNumber());
			            ps.setString(6, student.getAddress());
			            ps.setInt(7, student.getId());   // WHERE id=?

			            ps.executeUpdate();
			            return true;

			        } catch (SQLException e) {
			            e.printStackTrace();
			            return false;
			        }

			    } 
			
	//======================================================================================//		
			public List<Student> getAllStudent()
			{
								try(
						Connection con=MyJdbcConnection.getMyJdbcConnection();
						PreparedStatement ps=con.prepareStatement(display_all_student_Query);
						)
				{
									
									
									List<Student> list=new ArrayList<Student>();

					
					ResultSet rs= ps.executeQuery();
					while(rs.next())
					{
						//System.out.println("Student Id :\t"+student.);
						
						int id=rs.getInt("id");
						String name=rs.getString("name");
						String email=rs.getString("email");
						String password=rs.getString("password");
						String address=rs.getString("address");
						LocalDate dob=rs.getDate("dob").toLocalDate();
						long phone=rs.getLong("phoneNumber");
						//System.out.println("Id is "+id+"name is "+name+"Email is "+email+"Address is "+address+"Phone Number is "+phone);
						
						Student stu=new Student();
						stu.setId(id);
						stu.setAddress(address);
						stu.setDob(dob);
						stu.setEmail(email);
						stu.setPassword(password);
						stu.setphoneNumber(phone);
						stu.setName(name);
					list.add(stu);
						
					}
					return list;
					
				}
				catch(SQLException e)
				{
					e.printStackTrace();
					return new ArrayList<Student>();
				}
				
			}
			
			
			
			public  boolean deleteStudentById(int id) {
				
				
				if(isExistStudentsById(id))
				{
				try(Connection con=MyJdbcConnection.getMyJdbcConnection();
						PreparedStatement ps=con.prepareStatement(Delete_student_By_Id);)
				{
					
					ps.setInt(1, id);
					return ps.executeUpdate()>0;
					
					
					
				}
				
				catch (SQLException e)
				{
					e.printStackTrace();
					return false;
				}
				} 
				else {
			        System.out.println("Student does not exist with id: " + id);
			        return false;
			    }
				
			}
//		
//			
			public boolean loginStudentDao(String email,String password) {
				{
					try(
						Connection con=MyJdbcConnection.getMyJdbcConnection();
							PreparedStatement ps=con.prepareStatement(studentogin_query))
					{
						
						ps.setString(1, email);
						ps.setString(2, password);
						
						ResultSet rs=ps.executeQuery();
						if(rs.next())
							return true;
						
							return false;
						
					}
					catch(SQLException e)
					{
						e.printStackTrace();
						return false;
					}
				}
				
			}
		}
	
	

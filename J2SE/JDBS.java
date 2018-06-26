//JAVA DATABASE Connectivity 


//Open Database Connect  

//driver ... for JAVA .  


package com.shiyanlou;
import java.sql.*;

public class JdbcTest{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "javba";

	static final String USER ="root";
	
	static final String PASS ="";
	
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName("com.musql.jdbc.Driver");
			System.out.println("Connecting to database..");
			conn = DriverManager.getConnection(DB_URL, USER,PASS);
			
			System.out.println("creating statement..");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, name, age FROM Students";
			ResultSet rs = stmt.executeQuery(Sql);


			while(rs.next()){
			
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");
			

				System.out.print("ID" + id);
				System.out.print("Age" + age);
				System.out.print("..Name" + name);
				System.out.println();
			}

			rs.close();
			stmt.close();
			conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				try{
					if (stmt !+ null)
						stmt.close();
				}catch(SQLException se2){
				}
				try{
					if (conn! = null){
						conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
			System.out.println("Goodbye!");
		}

	

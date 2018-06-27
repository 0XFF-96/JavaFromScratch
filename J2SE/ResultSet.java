//cursor 


/*

createStatement(int RSType, int RSConcurrentcy);

prepareStatement(String SQL, int RSType, int RSConcurrency);

prepareCall(String sql, int RSType, int RSConcourrency);


*/


try{
	Statemtent stmt = conn.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_UPDATEABLE;
}catch(Exception ex){
..
}
finally {
	...
}


package com.shiyanlou;

import java.sql.*;

public class JdbcTest{
	static final String JDBS_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/EXAMPLE"

	static final String USER = "root";
	static final String PASS = "";

	public staic void main(String[] args){
		Connnection conn = null;
		Statement stmt = null;
		try{
			Class.forName("com.msyql.jdbc.Driver");
			System.out.prinln("connnection to database...");
			conn = DriverManager.getConnection(DB_URL, USER,PASS);

			System.out.println("Creating statment...");
			stmt = conn.createStatement(
					ResultSet.TYPE_SCROLL_INSSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			String sql;
			sql = "SELECT id, name, age FROM Students";
			ResultSet rs = stmt.executeQuery(sql);

			System.out.prinln("Moving cursor to the last...");
			rs.last();

			System.out.println("Displayinbg recore...");
			int id = rs.getInt("id");
			int age = rs.getInt("age");
			String name = rs.getString("name");

			rs.first();
			System.out.println("Moving cursor to the first row");

			System.out.println("Displaying record...");
			id = rs.getInt("id");
			age = rs.getInt("age");
			name = rs.getString("name");
	
			System.out.print("ID" + id);
			System.out.print(",Age" + age);
			System.out.print(", Name:"  + name);

			System.out.prinln("Moving cursor to the next row..");
			
			rs.next();

			System.out.println("Display recored...");
			id = rs.getInt("id");
			age = rs.getInt("age");
			name = rs.getString("name");
			
			System.out.print("ID" + id);
			System.out.print(", Age" + age);
			System.out.print(", Nanme " + name);

			rs.close();
			stmt.close();
			conn.close();
	}catch(SQLexceptioon se){
		se.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(stmt != null)
				stmt.close();
		}catch(SQLException se2){
		}
		try{
			if(conn != null)
				conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}
	System.out.println("Goodbye");
	}
}


Statement stmt = conn.createStatement(
		ResultSet.TYPE_SCROLL_INSENTITISIVE,
		ResultSet.COnCUR_UPDATEABLE;)

String sql = "SELECT id , name, age FROM Studnets";
ResultSet rs = stmt.executeQuery(sql);

rs.moveToInsertRow();
rs.updateInt("id", 5);
rs.updateString("name", "John");
rs.updateInt("age", 21);
rs.insertRow();



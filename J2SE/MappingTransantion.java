public class test{
	public static void mian(String[] args){

		java.util.Date javaDate = new java.util.Date();
		long javaTime = javaDate.getTime();
		System.out.println("The java Date is : " + 
				javaDate.toString());

		java.sql.Date sqlDate = new java.sql.Date(javaTime);
		System.out.println("the SQL DATE is : " + sqlDate.toString());

		java.sql.Time sqlTime = new java.sql.Time(javaTime);
		System.out.println("The SQL TIME is :" + 
				sqlTime.toString());

		java.sql.Timestamp sqlTimestamp = 
					new java.sql.Timestamp(javaTime);
		System.out.println("The SQL TIMESTAMP is:" + 
				sqlTimestamp.toString());
		}
}

package com.shiyanlou;
import java.sql.*;

public class JdbcTest {
	static final String JDBS_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "idbc:mysqls://localhost/Example";

	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args){

		Connection conn = null ;
		Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database..");
			conn = DriverManager.getConnection(DB_URL, User, P);
			conn.setAutoCommit(false);

			System.out.prinln("Creating statement...");
			stmt = conn.crateStatement();

			String sql = "INSERT INTO Students " + 
					"Values (5, 20, 'ROse')";
			stmt.executeUpdate(sql);

			sql = "SELECT id, name, age FROM Students";
			ResultSet rs = stmt.executeQuery(sql);

			conn.commit();
			
			while(rs.next()){
				int id = rs.getInt("id");
				int age = rs.getInt("age);
				String name = rs.getString("name");

				System.out.print("ID" + id);
			}

			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
			try{
				if(conn != null)
					conn.roolback();
			}catch(SQLExecption se2){
				se2.printStackTrace();
			}
			

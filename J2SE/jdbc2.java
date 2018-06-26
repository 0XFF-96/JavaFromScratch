
Statement stmt = null;

try{
	stmt = conn.createStatement();
	...
}
catch (SQLException e){
	...
}
finally {
	...
}

Statement stmt = null;
try{
	stmt = conn.createStatement();
	...
}
catch(SQLException e){
	...
}
finally {
	stmt.close();
}

select column from table where colun = 1;

PreparedStatement pstmt = null;
try{
	String SQL = "Update Students SET age = ? WHERE id = ?";
	pstmt = conn.prepareStatement(SQL):
	... 
}

catch(SQLExeption e){
	... 
}
finally {
	pstmt.close();
}


package com.shiyanlou;
import java.sql.*;

PUBLIC CLASS JdbcTest{
	static finall Stirng JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/example";

	static final String USer = "root";
	static final String PASS = "";

	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("COnnection to datebase>..");
			conn = DriverManager.getConnection(DB_URL, USer,PASS);

			System.out.println("Creating statement...");
			String sqwl = "UPDATE Students set age=? WHERE id=?";

			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 22);
			
			int rows = stmt.exeuteUpdate();
			System.out.println("being infulence " + rows);
	
			sql = "SELECT id, name, age FROM Students";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()){

				int id  = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");

				System.out.print("ID" + id);
				System.out.print(", age:" + age);
				System.out.print(", Name" + name);
				System.out.println();
			}

			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStacTrace();
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
			}catch(SQLExecpptin se){
				se.printStackTrace();
			}
		}
	}
		System.out.println("Goodbye");
	}
}

CallabelStatement cstmt = null;
try{
	String SQL = "{call getExampleName (?, ?)}}";
	cstmt = conn.prepareClass (SQL);
	...
}
catch (SQLException e){
	... 
}
finally {
	cstmt.close();
}



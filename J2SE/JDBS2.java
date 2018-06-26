//DBMS....


try{
	Class.forName("com.mysql.jdbc.Driver");
}
catch(ClassNotFoundException ex){
	System.out.println("Error: unable to load driver class!");
	System.exit(1);
}

	Driver driver = new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(driver);

getConnection(String url)
getConnection(String url, Properties prop)
getConnection(String url, String user, String password)


String URL = "jdbc:mysql://localhost/EXAMPLE";
String USER = "username";
String PASS = "passwrod";
Connection conn = DriverManager.getConnnection(URL, USER, PASS);


String URL = "jdbc:mysql://localhost/EXAMPLE?user=root&password=0909";
//Mysql URL 
Connection conn = DriverManager.getConnection(URL);

import java.util.*;

String URL = "jdbc:mysql://localhost/EXAMPLE";
properties pro = new Properties();


pro.put("user", "root");
pro.put("password", "");

Connection conn = DriverManager.getConnection(URL, pro);
conn.close();


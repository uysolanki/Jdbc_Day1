package day33.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
public static Connection getConnection() throws Exception
{
	String mySqlUrl="jdbc:mysql://localhost:3306/";
	String databasename="exemorndb";
	String username="root";
	String password="";
	
	String drivername="com.mysql.jdbc.Driver";

	Class.forName(drivername); 
	
	Connection con=DriverManager.getConnection(mySqlUrl+databasename,username,password);
	return con;
}
}

package day33.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLQueryDemo {
	
	public static void main(String[] args) throws Exception{
		Connection con;
		Statement st;
		String query;
		
		Class.forName("com.mysql.jdbc.Driver"); //Load And Register the JDBC Driver for MySQL
		
		//Establish connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exemorndb","root","");
		st=con.createStatement();
		//Create sql query
		query="create table jdbcemp(\r\n"
				+ "eno int(5) primary key auto_increment,\r\n"
				+ "ename varchar(10),\r\n"
				+ "gender varchar(2),\r\n"
				+ "sal int(8),\r\n"
				+ "city varchar(10),\r\n"
				+ "workmode varchar(10)\r\n"
				+ ")";
		//execute the query
		st.execute(query);
		System.out.println("Table Created");
		
		//close the statement and connection
		st.close();
		con.close();
	}

}

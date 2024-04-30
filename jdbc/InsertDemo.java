package day33.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		Connection con;
		Statement st;
		String query;
		String mySqlUrl="jdbc:mysql://localhost:3306/";
		String databasename="exemorndb";
		String drivername="com.mysql.jdbc.Driver";
		String username="root";
		String password="";
		
		Class.forName(drivername); 
		
		con=DriverManager.getConnection(mySqlUrl+databasename,username,password);
		st=con.createStatement();
		query="insert into jdbcemp(ename,gender,sal,city,workmode) values('Alice','f',800,'Pune','wfh')";
		int n=st.executeUpdate(query);
		if(n>0)
		{
			System.out.println(n + "Records Inserted");
		}
		else
		{
			System.out.println("No Record Inserted");
		}

		st.close();
		con.close();
	}

}

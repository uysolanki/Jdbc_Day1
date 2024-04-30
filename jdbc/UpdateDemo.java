package day33.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		String query="update jdbcemp set sal=5000 where ename like 'Alice'";
		int n=st.executeUpdate(query);
		if(n>0)
		{
			System.out.println(n + "Records Updated");
		}
		else
		{
			System.out.println("No Record Updated");
		}
	}

}

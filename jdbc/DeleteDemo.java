package day33.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception{
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		
		String query="delete from jdbcemp where gender like 'f'";
		int rows=st.executeUpdate(query);
		if(rows>0)
				System.out.println(rows+ "Records Deleted");
		else
				System.out.println("No Records Deleted");
	}

}

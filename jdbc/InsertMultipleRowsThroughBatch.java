package day33.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class InsertMultipleRowsThroughBatch {
public static void main(String[] args) throws Exception {
	Connection con=DbConnection.getConnection();
	Statement st=con.createStatement();
	
	st.addBatch("insert into jdbcemp(ename,gender,sal,city,workmode) values('Frank','m',900,'Pune','wfh')");  
	st.addBatch("insert into jdbcemp(ename,gender,sal,city,workmode) values('George','m',1000,'Delhi','wfo')");  
	
	int a[]=st.executeBatch();
	if(a.length>0)
	{
		System.out.println(a[1]);
	}
	else
	{
		System.out.println("No Record Inserted");
	}

}
}

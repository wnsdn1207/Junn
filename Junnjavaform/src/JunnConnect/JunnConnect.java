package JunnConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class JunnConnect {

	public Connection connect(){
		Connection conn = null;
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; // DB URL
		
		// Driver Found
		try{
			Class.forName("oracle.jdbc.OracleDriver"); // JDBC DRIVER
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		
		// DriverManager getConnection
		try{

			conn = DriverManager.getConnection(dbUrl, "wnsdn1207", "sla0531"); // database connection
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		return conn;
	}
}

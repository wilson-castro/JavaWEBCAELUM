package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
	      try {
	    	  Class.forName("com.mysql.jdbc.Driver");
			  return DriverManager.getConnection(
				  "jdbc:mysql://localhost/fj21", "root", "root");
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
	    	  throw new RuntimeException(e);
		}
	  }
}

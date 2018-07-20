/**
 * 
 */
package jdbcINSERT_DATA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author 		Konstantin Frolov
 * Student No.	R00144177
 * email		konstantin.frolov@mycit.ie
 */
public class Driver {

	/**
	 * In this Class we'll:
	 * 
	 * 1. Get Connection
	 * 2. Create a statement
	 * 3. Execute SQL query
	 * 
	 */
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/demo1?autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "root";
		
		try {
			// 1. Get a Connection
			Connection myConn = DriverManager.getConnection(url, user, password);
			
			// 2. Create a statement
			Statement myStatement = myConn.createStatement();
			
			// 3. Execute SQL query
			String sql =  "INSERT INTO employees "
						+ "(FirstName,LastName,Email) "
						+ "VALUES "
						+ "('David','Brown','david.brown@foo.com')";
			
			myStatement.execute(sql);
			System.out.println("Insert complete.");
			
		}catch(Exception exc){
			exc.printStackTrace();
			System.out.println(exc.getMessage());
		}
		
	}

}

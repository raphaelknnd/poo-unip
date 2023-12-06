import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    public static Connection connectionWithDatabase(){
        Connection connection = null;

	    try {
           	connection = DriverManager.getConnection(ConnectionParameters.getJdbcURL(), ConnectionParameters.getUser(), ConnectionParameters.getPassword());
           	System.out.println("OK!");
        } catch (Exception e) {
               e.printStackTrace();
            }

		return connection;
    }
}
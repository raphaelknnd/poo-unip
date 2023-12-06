import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection(){
        Connection connection = null;
		try {
        	connection = DriverManager.getConnection(ConnectionParameters.getJdbcURL(), ConnectionParameters.getUser(), ConnectionParameters.getPassword());
        	System.out.println("Conexão estabelecida com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

        return connection;
    }
}

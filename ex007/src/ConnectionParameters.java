public class ConnectionParameters {
    private static final String URL = "jdbc:mysql://localhost:3306/mercado";
    private static final String USER = "root";
    private static final String PASSWORD = "Batatadoce00**";

    public static String getJdbcURL() {
		return URL;
	}
	public static String getUser() {
		return USER;
	}
	public static String getPassword() {
		return PASSWORD;
	}
}

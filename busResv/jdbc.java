package busResv;
import java.sql.*;
public class jdbc {
	
	private static final String url="jdbc:mysql://localhost:3306/busresv";
	private static final String username="root";
	private static final String pwd="12345";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,username,pwd);
	}

}

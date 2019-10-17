import java.sql.*;

public class MainOfDB {
	
	public static void main(String [] args) throws SQLException, ClassNotFoundException {

		//Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(
							"jdbc:postgresql://localhost:5432/students",
							"postgres",
							"postgres"						
						);
		
		Statement stmnt = conn.createStatement();
		ResultSet rs = stmnt.executeQuery("select * from students");
		while (rs.next()) {
			System.out.println(rs.getString("name"));
		}
	
	}
}
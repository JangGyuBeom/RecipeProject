import java.sql.*;

public class Jdbc {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		try {
			Connection conn = null;

			conn = DriverManager.getConnection("jdbc:mysql://localhost:9000/recipe?useSSL=false",
					"hoonju", "19950905"); // Xshell
			/*conn = DriverManager.getConnection("jdbc:mysql://165.229.88.102:3306/recipe?useSSL=false",
					"hoonju", "19950905");  // ÇÐ±³
*/
			java.sql.Statement st = null;
			ResultSet rset = null;
			st = conn.createStatement();
			rset = st.executeQuery("select del_name from delivery where del_price>50000;");

			if (st.execute("select del_name from delivery where del_price>50000;")) {
				rset = st.getResultSet();
			}

			while (rset.next()) {
				//String str = rset.getNString(1);
				System.out.println("del_name :" + rset.getString("del_name"));
			}
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}
	}
}
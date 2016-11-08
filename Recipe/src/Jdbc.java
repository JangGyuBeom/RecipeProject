import java.sql.*;

public class Jdbc {
	public Jdbc(){}
	
	void readSQL(String sql){
		try {

			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		try {
			Connection conn = null;

			/*conn = DriverManager.getConnection("jdbc:mysql://localhost:9000/recipe?useSSL=false",
					"hoonju", "19950905");*/ // Xshell
			conn = DriverManager.getConnection("jdbc:mysql://165.229.88.102:3306/recipe?useSSL=false",
					"hoonju", "19950905");  // 학교
			
			
			System.out.println(sql);
			java.sql.Statement st = null;
			ResultSet rset = null;
			st = conn.createStatement();
			
			rset = st.executeQuery(sql);

			/*if (st.execute("select del_name from delivery where del_price>50000;")) {
				rset = st.getResultSet();
			}*/

			while (rset.next()) {
				//String str = rset.getNString(1);
				System.out.println("NUM : "+rset.getInt(1));
			}
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}
	}
	void insertSQL(String sql){
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		try {
			Connection conn = null;

			/*conn = DriverManager.getConnection("jdbc:mysql://localhost:9000/recipe?useSSL=false",
					"hoonju", "19950905");*/ // Xshell
			conn = DriverManager.getConnection("jdbc:mysql://165.229.88.102:3306/recipe?useSSL=false",
					"hoonju", "19950905");  // 학교
			
			
			System.out.println(sql);
			java.sql.Statement st = null;
			ResultSet rset = null;
			st = conn.createStatement();
			
			st.executeUpdate(sql);

		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}
	}
	int returnSQL(String sql){
		int i = 0;
		try {

			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException : " + e.getMessage());
		}
		try {
			Connection conn = null;

			/*conn = DriverManager.getConnection("jdbc:mysql://localhost:9000/recipe?useSSL=false",
					"hoonju", "19950905");*/ // Xshell
			conn = DriverManager.getConnection("jdbc:mysql://165.229.88.102:3306/recipe?useSSL=false",
					"hoonju", "19950905");  // 학교
			
			
			System.out.println(sql);
			java.sql.Statement st = null;
			ResultSet rset = null;
			st = conn.createStatement();
			
			rset = st.executeQuery(sql);

			/*if (st.execute("select del_name from delivery where del_price>50000;")) {
				rset = st.getResultSet();
			}*/

			while (rset.next()) {
				//String str = rset.getNString(1);
				i = rset.getInt(1);
			}
		} catch (SQLException sqex) {
			System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
		}
		return i;
	}
}
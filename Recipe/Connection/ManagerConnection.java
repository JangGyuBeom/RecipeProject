import java.sql.*;

public class ManagerConnection {
	Jdbc jdbc = new Jdbc();
	public void makeSQL(String sql){
		jdbc.updateSQL(sql);
	}
	public String makePW_SQL(String sql){
		ResultSet rset;
		String pw = null;
		rset = jdbc.readSQL(sql);
		try {
			while(rset.next()){
				pw = rset.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pw;
	}
}

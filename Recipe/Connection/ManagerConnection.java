import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerConnection {
	Jdbc jdbc = new Jdbc();

	public String makePW_SQL(String sql){ 
		ResultSet rset;
		String str = null;
		rset = jdbc.readSQL(sql);
		try {
			while(rset.next()){
				str = rset.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return str;
	}
	public void makeSQL(String sql){
		jdbc.updateSQL(sql);
	}
	public ResultSet mSQL(String sql){
		ResultSet rset;
		rset = jdbc.readSQL(sql);
		return rset;
	}
}

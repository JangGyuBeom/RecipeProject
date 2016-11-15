import java.sql.*;
import java.util.*;

public class CookConnection {
	Vector makeD_SQL(String sql){
		Vector vec = new Vector();
		Jdbc jdbc = new Jdbc();
		ResultSet rset = jdbc.readSQL(sql);
		try {
			while(rset.next()){
				vec.addElement(rset.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vec;
	}
}

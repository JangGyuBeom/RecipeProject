import java.sql.*;
import java.util.*;

public class CookConnection {
	Jdbc jdbc = new Jdbc();
	ResultSet rset;
	Vector makeD_SQL(String sql){
		Vector vec = new Vector();
		rset = jdbc.readSQL(sql);
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
	ResultSet makeDR_SQL(String sql){
		rset = jdbc.readSQL(sql);
		return rset;
	}
}

import java.sql.*;
import java.util.*;

public class CookConnection {
	Jdbc jdbc = new Jdbc();
	ResultSet rset;
	Vector<String> makeD_SQL(String sql){
		Vector<String> vec = new Vector<String>();
		rset = jdbc.readSQL(sql);
		try {
			while(rset.next()){
				vec.addElement(rset.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vec;
	}
	
	ResultSet makeDR_SQL(String sql){
		rset = jdbc.readSQL(sql);
		return rset;
	}
}

import java.sql.*;
import java.util.*;

public class CookConnection {
	Jdbc jdbc = new Jdbc();
	ResultSet rset;
	String sql;
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
	int sumMaterial_SQL(String sql){
		int price;
		price = jdbc.returnSQL(sql);
		return price;
	}
	int sumMaterial_SQL(String fname,String material){
		int price;
		sql = "select mat_price from material where exists (select mat_name from comat where f_name = '"+fname+"' and mat_name = '"+material+"');";
		price = jdbc.returnSQL(sql);
		return price;
	}
}


import java.awt.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;

public class DeliveryResultButtonHandler{
	CookConnection cc = new CookConnection();
	String sql;
	ResultSet rset;
	public void DeliveryResultHandler(String name, JTextField 전화번호, JTextArea 배달가능, Integer price, JTextArea 전체메뉴, JTextArea 배달가능가격, JTextArea 전체메뉴가격) {
		배달가능.setText("");
		전체메뉴.setText("");
		배달가능가격.setText("");
		전체메뉴가격.setText("");
		sql = "select d_food, d_price from delivery where d_name = '"+name+"' and d_price <= "+price+";";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				배달가능.append(rset.getString(1)+"\n");
				배달가능가격.append(rset.getInt(2)+"\n");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sql = "select d_food, d_price from delivery where d_name = '"+name+"';";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				전체메뉴.append(rset.getString(1)+"\n");
				전체메뉴가격.append(rset.getInt(2)+"\n");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "select distinct d_tel from delivery where d_name = '"+name+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				전화번호.setText(rset.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

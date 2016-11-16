
import java.awt.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;

public class DeliveryResultButtonHandler{
	CookConnection cc = new CookConnection();
	String sql;
	ResultSet rset;
	public void DeliveryResultHandler(String str, JTextField textField, JTextArea textArea, Integer price) {
		textArea.setText("");
		sql = "select d_food, d_price from delivery where d_name = '"+str+"' and d_price <= "+price+";";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				textArea.append(rset.getString(1)+"\t"+rset.getInt(2)+"\n");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textArea.append("------------------------\n");
		sql = "select d_food, d_price from delivery where d_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				textArea.append(rset.getString(1)+"\t"+rset.getInt(2)+"\n");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "select distinct d_tel from delivery where d_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				textField.setText(rset.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


import java.awt.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;

public class DeliveryResultButtonHandler{
	CookConnection cc = new CookConnection();
	String sql;
	ResultSet rset;
	public void DeliveryResultHandler(String str, JTextField textField, JTextArea textArea, Integer price, JTextArea textArea_1, JTextArea textArea_2, JTextArea textArea_3) {
		textArea.setText("");
		textArea_1.setText("");
		textArea_2.setText("");
		textArea_3.setText("");
		sql = "select d_food, d_price from delivery where d_name = '"+str+"' and d_price <= "+price+";";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				textArea.append(rset.getString(1)+"\n");
				textArea_2.append(rset.getInt(2)+"\n");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sql = "select d_food, d_price from delivery where d_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				textArea_1.append(rset.getString(1)+"\n");
				textArea_3.append(rset.getInt(2)+"\n");
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

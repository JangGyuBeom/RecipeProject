
import java.awt.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;

public class DeliveryResultButtonHandler{
	CookConnection cc = new CookConnection();
	String sql;
	ResultSet rset;
	public void DeliveryResultHandler(String name, JTextField ��ȭ��ȣ, JTextArea ��ް���, Integer price, JTextArea ��ü�޴�, JTextArea ��ް��ɰ���, JTextArea ��ü�޴�����) {
		��ް���.setText("");
		��ü�޴�.setText("");
		��ް��ɰ���.setText("");
		��ü�޴�����.setText("");
		sql = "select d_food, d_price from delivery where d_name = '"+name+"' and d_price <= "+price+";";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				��ް���.append(rset.getString(1)+"\n");
				��ް��ɰ���.append(rset.getInt(2)+"\n");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sql = "select d_food, d_price from delivery where d_name = '"+name+"';";
		rset = cc.makeDR_SQL(sql);
		try{
			while(rset.next()){
				��ü�޴�.append(rset.getString(1)+"\n");
				��ü�޴�����.append(rset.getInt(2)+"\n");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "select distinct d_tel from delivery where d_name = '"+name+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				��ȭ��ȣ.setText(rset.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

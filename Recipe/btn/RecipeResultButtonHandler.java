import java.sql.*;

import javax.swing.*;

public class RecipeResultButtonHandler {
	CookConnection cc = new CookConnection();
	ResultSet rset;
	String sql;
	
	public void RecipeResultHandler(String str, JTextArea textArea_1, JTextArea textArea, JTextField textField){
		textArea.setText("");
		textArea_1.setText("");
		sql = "select mat_name from comat where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				textArea_1.append(rset.getString(1)+"   ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "select f_recipe from cook where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				textArea.append(rset.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "select f_time from cook where f_name = '"+str+"';";
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

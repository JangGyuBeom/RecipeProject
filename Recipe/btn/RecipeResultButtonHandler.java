import java.sql.*;
import java.util.*;

import javax.swing.*;

public class RecipeResultButtonHandler extends Material {
	CookConnection cc = new CookConnection();
	ResultSet rset;
	String sql;
	
	public void RecipeResultHandler(String str, JTextArea textArea_1, JTextArea textArea, JTextField textField, JTextField textField_1){
		int cookprice = 0;
		int sumprice = 0;
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
		sql = "select f_price from cook where f_name = '"+str+"';";
		cookprice = cc.sumMaterial_SQL(sql);
		for (int j = 0; j < Material.size(); j++) {
			sumprice += cc.sumMaterial_SQL(str, Material.get(j));
		}
		int P = cookprice - sumprice;
		String SP = Integer.toString(P);
		textField_1.setText(SP);
	}
	public void RecipeCompareMaterialHandler(String rName, JTextArea textArea, JTextArea textArea_1, JTextArea textArea_2, JTextArea textArea_3){
		sql = "select mat_name from comat where f_name = '"+rName+"';";
		rset = cc.makeDR_SQL(sql);
		ArrayList<String> mn = new ArrayList<String>();
		textArea.setText("");
		textArea_1.setText("");
		textArea_2.setText("");
		textArea_3.setText("");
		try {
			while(rset.next()){
				textArea.append(rset.getString(1)+"\n");
				mn.add(rset.getString(1));
//				sql = "select big, home, poce from mprice where mat_name = '"+rset.getString(1)+"';";     <- 원래 이렇게 하고 싶었는데 오류뜸 .. ㅠㅠ
//				mP = cc.makeDR_SQL(sql);
//				while(mP.next()){
//					textArea_1.append(mP.getString(1));
//					textArea_2.append(mP.getString(2));
//					textArea_3.append(mP.getString(3));
//				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < mn.size(); i++){
			sql = "select big, home, poce from mprice where mat_name = '"+mn.get(i)+"';";
			rset = cc.makeDR_SQL(sql);
			try {
				while(rset.next()){
					textArea_1.append(rset.getString(1)+"\n");
					textArea_2.append(rset.getString(2)+"\n");
					textArea_3.append(rset.getString(3)+"\n");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

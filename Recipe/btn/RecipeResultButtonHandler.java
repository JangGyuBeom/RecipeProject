import java.sql.*;
import java.util.*;

import javax.swing.*;

public class RecipeResultButtonHandler extends Material {
	CookConnection cc = new CookConnection();
	ResultSet rset;
	String sql;
	
	public void RecipeResultHandler(String str, JTextArea 필요재료, JTextArea 레시피, JTextField 예상시간, JTextField 추가비용){
		int cookprice = 0;
		int sumprice = 0;
		레시피.setText("");
		필요재료.setText("");
		sql = "select mat_name from comat where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				필요재료.append(rset.getString(1)+"   ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "select f_recipe from cook where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				레시피.append(rset.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "select f_time from cook where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				예상시간.setText(rset.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "select f_price from cook where f_name = '"+str+"';";
		cookprice = cc.sumMaterial_SQL(sql);
		for (int j = 0; j < Material.size(); j++) {
			sumprice += cc.sumMaterial_SQL(str, Material.get(j));
		}
		int P = cookprice - sumprice;
		String SP = Integer.toString(P);
		추가비용.setText(SP);
	}
	public void RecipeCompareMaterialHandler(String rName, JTextArea 재료, JTextArea 빅마트, JTextArea 홈마트, JTextArea 포스마트){
		sql = "select mat_name from comat where f_name = '"+rName+"';";
		rset = cc.makeDR_SQL(sql);
		ArrayList<String> mn = new ArrayList<String>();
		재료.setText("");
		빅마트.setText("");
		홈마트.setText("");
		포스마트.setText("");
		try {
			while(rset.next()){
				재료.append(rset.getString(1)+"\n");
				mn.add(rset.getString(1));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < mn.size(); i++){
			sql = "select big, home, poce from mprice where mat_name = '"+mn.get(i)+"';";
			rset = cc.makeDR_SQL(sql);
			try {
				while(rset.next()){
					빅마트.append(rset.getString(1)+"\n");
					홈마트.append(rset.getString(2)+"\n");
					포스마트.append(rset.getString(3)+"\n");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

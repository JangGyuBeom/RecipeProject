import java.sql.*;
import java.util.*;

import javax.swing.*;

public class RecipeResultButtonHandler extends Material {
	CookConnection cc = new CookConnection();
	ResultSet rset;
	String sql;
	
	public void RecipeResultHandler(String str, JTextArea �ʿ����, JTextArea ������, JTextField ����ð�, JTextField �߰����){
		int cookprice = 0;
		int sumprice = 0;
		������.setText("");
		�ʿ����.setText("");
		sql = "select mat_name from comat where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				�ʿ����.append(rset.getString(1)+"   ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "select f_recipe from cook where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				������.append(rset.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "select f_time from cook where f_name = '"+str+"';";
		rset = cc.makeDR_SQL(sql);
		try {
			while(rset.next()){
				����ð�.setText(rset.getString(1));
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
		�߰����.setText(SP);
	}
	public void RecipeCompareMaterialHandler(String rName, JTextArea ���, JTextArea ��Ʈ, JTextArea Ȩ��Ʈ, JTextArea ������Ʈ){
		sql = "select mat_name from comat where f_name = '"+rName+"';";
		rset = cc.makeDR_SQL(sql);
		ArrayList<String> mn = new ArrayList<String>();
		���.setText("");
		��Ʈ.setText("");
		Ȩ��Ʈ.setText("");
		������Ʈ.setText("");
		try {
			while(rset.next()){
				���.append(rset.getString(1)+"\n");
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
					��Ʈ.append(rset.getString(1)+"\n");
					Ȩ��Ʈ.append(rset.getString(2)+"\n");
					������Ʈ.append(rset.getString(3)+"\n");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

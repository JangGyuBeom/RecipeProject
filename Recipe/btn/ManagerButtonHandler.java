import java.awt.EventQueue;
import java.sql.*;
import java.util.*;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ManagerButtonHandler {
	String sql;
	ManagerConnection mc = new ManagerConnection();
	

	public void noticehandler(JComboBox 공지사항, JTextField 공지번호, JTextArea 공지내용) {
		try {
			String str = (String) 공지사항.getSelectedItem();
			Integer num = new Integer(공지번호.getText());
			String text = new String(공지내용.getText());
			if (str == "등록") {
				str = "insert into";
				sql = str + " notice(notice_num,notice_text) values(" + num + ",'" + text + "');";
				JOptionPane.showMessageDialog(null, "입력 완료");
			} else if (str == "수정") {
				str = "update";
				sql = str + " notice set notice_text = '" + text + "' where notice_num = " + num + ";";
				JOptionPane.showMessageDialog(null, "수정 완료");
			} else {
				str = "delete";
				sql = str + " from notice where notice_num = " + num + ";";
				JOptionPane.showMessageDialog(null, "삭제 완료");
			}
			mc.makeSQL(sql);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
		}

	}

	public void recipehandler(String str, String foodname, Integer price, String cooking, String time,
			ArrayList<String> mat, ArrayList<Integer> matprice, ArrayList<String> cat) {
		ArrayList<String> matname = new ArrayList <String>();
		String rmSQL = null; // 레시피-재료 테이블 sql 문
		String mSQL; // 재료 테이블 sql문
		String martSQL;
		ResultSet rset; //아 오류 발생 원인 알았어요
		int cp; //재료 이름 중복 제어
		if (str == "등록") {	
			str = "insert into";
			sql = str + " cook(f_name,f_price,f_recipe,f_time) values('" + foodname + "'," + price + ",'" + cooking
					+ "','" + time + "');"; //레시피 테이블 등록 sql
			for (int i = 0; i < mat.size(); i++){
				rmSQL = str + " comat(f_name,mat_name) values('" + foodname + "','" + mat.get(i) + "');";  //레시피 - 재료 테이블 등록 sql
				mc.makeSQL(rmSQL);
			} 
			mSQL = "select mat_name from material;";
			rset = mc.mSQL(mSQL);
			try {
				while(rset.next()){
					matname.add(rset.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (int i = 0; i < mat.size(); i++) {
				cp = 0;
				for(int j = 0; j < matname.size(); j++){
					
						if(matname.get(j).compareTo(mat.get(i)) == 0)
							cp++;	
				}
				if(cp == 0){
					mSQL = str+" material(mat_name,mat_price,mat_group) values('"+mat.get(i)+"',"+matprice.get(i)+",'"+cat.get(i)+"');";//재료 등록 sql
					martSQL = str+" mprice(mat_name,big,home,poce) values('"+mat.get(i)+"',"+0+","+0+","+0+");";
					mc.makeSQL(mSQL);
					mc.makeSQL(martSQL);
				}
			}
			JOptionPane.showMessageDialog(null, "입력 완료");
		} else if (str == "수정") {
			str = "update";
			String dSQL = null;
			String updateSQL;
			dSQL = "delete from comat where f_name = '"+ foodname +"';";
			mc.makeSQL(dSQL);
			sql = str + " cook set f_price = " + price + ", f_recipe = '" + cooking + "', f_time = '" + time + "' where f_name = '" + foodname + "';";
			for (int i = 0; i < mat.size(); i++){
				updateSQL = "insert into comat(f_name,mat_name) values('" + foodname + "','" + mat.get(i) + "');";  //레시피 - 재료 테이블 등록 sql << 
				mc.makeSQL(updateSQL);
			}
			mSQL = "select mat_name from mprice;";
			rset = mc.mSQL(mSQL);
			try {
				while(rset.next()){
					matname.add(rset.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < mat.size(); i++) {
				cp = 0;
				for(int j = 0; j < matname.size(); j++){
					
						if(matname.get(j).compareTo(mat.get(i)) == 0)
							cp++;	
				}
				if(cp == 0){
					mSQL = "insert into material(mat_name,mat_price,mat_group) values('"+mat.get(i)+"',"+matprice.get(i)+",'"+cat.get(i)+"');";//재료 등록 sql
					martSQL = "insert into mprice(mat_name,big,home,poce) values('"+mat.get(i)+"',"+0+","+0+","+0+");";
					mc.makeSQL(mSQL);
					mc.makeSQL(martSQL);
				}
			}
			
			JOptionPane.showMessageDialog(null, "수정 완료");
		}
		mc.makeSQL(sql);
	}

	public void recipehandler(String foodname) {
		String dSQL = null;
		String str = "delete";
		dSQL = str + " from comat where f_name = '"+ foodname +"';";
		sql = str + " from cook where f_name = '" + foodname + "';";
		mc.makeSQL(sql);
		mc.makeSQL(dSQL);
		JOptionPane.showMessageDialog(null, "삭제 완료");
	}

	public void deliveryhandler(JComboBox 배달음식, JTextField 가게이름, JTextField 음식이름,
			JTextField 가격, JTextField 전화번호, JTextField 카테고리) {
		try {
			String sql;
			ManagerConnection mc = new ManagerConnection();
			String str = (String) 배달음식.getSelectedItem();
			String name = new String(가게이름.getText());
			String food = new String(음식이름.getText());
			Integer price = new Integer(가격.getText());
			String tel = new String(전화번호.getText());
			String group = new String(카테고리.getText());
			if (str == "등록") {
				str = "insert into";
				sql = str + " delivery(d_name,d_food,d_price,d_tel,d_group) values('" + name + "','" + food + "',"
						+ price + ",'" + tel + "','" + group + "');";
				JOptionPane.showMessageDialog(null, "입력 완료");
			} else if (str == "수정") {
				str = "update";
				sql = str + " delivery set d_price = " + price + " and d_tel = '" + tel + "' and d_group = '" + group
						+ "' where d_name = '" + name + "' and d_food = '" + food + "';";
				JOptionPane.showMessageDialog(null, "수정 완료");
			} else {
				str = "delete";
				sql = str + " from delivery where d_name = '" + name + "' and d_food = '" + food + "';";
				JOptionPane.showMessageDialog(null, "삭제 완료");
			}
			mc.makeSQL(sql);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "빈공간이 있습니다.");
		}
	}

	public void inquireshandler() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeShowinquires frame = new RecipeShowinquires();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void PassWordHandler() {

	}
}

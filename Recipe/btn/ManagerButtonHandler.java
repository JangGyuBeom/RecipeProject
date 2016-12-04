import java.awt.EventQueue;
import java.awt.image.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;

public class ManagerButtonHandler {
	String sql;
	ManagerConnection mc = new ManagerConnection();

	public void noticehandler(JComboBox 공지사항, JTextField 공지번호, JTextArea 공지내용) {
		try {
			ResultSet rset;
			String str = (String) 공지사항.getSelectedItem();
			Integer num = new Integer(공지번호.getText());
			String text = new String(공지내용.getText());
			sql = "select notice_num from notice";
			rset = mc.mSQL(sql);
			int cp = 0;
			while (rset.next()) {
				if (num == rset.getInt(1)) {
					cp++;
				}
			}
			if (str == "등록") {
				str = "insert into";
				if (text.isEmpty()) {
					JOptionPane.showMessageDialog(null, "공지 내용이 없습니다.");
				} else {
					if (cp == 0) {
						sql = str + " notice(notice_num,notice_text) values(" + num + ",'" + text + "');";
						mc.makeSQL(sql);
					} else
						JOptionPane.showMessageDialog(null, "공지 번호가 이미 있습니다.");
				}
			} else if (str == "수정") {
				str = "update";
				if (text.isEmpty()) {
					JOptionPane.showMessageDialog(null, "수정 내용이 없습니다.");
				} else {
					if (cp == 0) {
						sql = str + " notice set notice_text = '" + text + "' where notice_num = " + num + ";";
						mc.makeSQL(sql);
					} else
						JOptionPane.showMessageDialog(null, "공지 번호가 이미 있습니다.");
				}
			} else {
				if (cp == 0)
					JOptionPane.showMessageDialog(null, "공지 번호가 이미 있습니다.");
				else {
					str = "delete";
					sql = str + " from notice where notice_num = " + num + ";";
					mc.makeSQL(sql);
					JOptionPane.showMessageDialog(null, "삭제 완료.");
				}
			}

		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
		}
	}

	public void recipehandler(String str, String foodname, Integer price, String cooking, String time,
			ArrayList<String> mat, ArrayList<Integer> matprice, ArrayList<String> cat) {
		ArrayList<String> matname = new ArrayList<String>();
		ArrayList<String> mName = new ArrayList<String>();
		String rmSQL = null;
		String mSQL;
		String martSQL;
		ResultSet rset, cset;
		int cp, rp = 0;

		sql = "select f_name from cook";
		cset = mc.mSQL(sql);
		try {
			while (cset.next()) {
				if (foodname.compareTo(cset.getString(1)) == 0)
					rp++;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		if (str == "등록") {
			if (rp == 0) {

				str = "insert into";
				sql = str + " cook(f_name,f_price,f_recipe,f_time) values('" + foodname + "'," + price + ",'" + cooking
						+ "','" + time + "');";
				for (int i = 0; i < mat.size(); i++) {
					rmSQL = str + " comat(f_name,mat_name) values('" + foodname + "','" + mat.get(i) + "');";
					mc.makeSQL(rmSQL);
				}
				mSQL = "select mat_name from material;";
				rset = mc.mSQL(mSQL);
				try {
					while (rset.next()) {
						matname.add(rset.getString(1));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

				for (int i = 0; i < mat.size(); i++) {
					cp = 0;
					for (int j = 0; j < matname.size(); j++) {

						if (matname.get(j).compareTo(mat.get(i)) == 0)
							cp++;
					}
					if (cp == 0) {
						mSQL = str + " material(mat_name,mat_price,mat_group) values('" + mat.get(i) + "',"
								+ matprice.get(i) + ",'" + cat.get(i) + "');";
						martSQL = str + " mprice(mat_name,big,home,poce) values('" + mat.get(i) + "'," + 0 + "," + 0
								+ "," + 0 + ");";
						JOptionPane.showMessageDialog(null, mat.get(i)+"가(이) 재료로 등록 되었습니다.");
						mc.makeSQL(mSQL);
						mc.makeSQL(martSQL);
					} else {
						mName.add(mat.get(i));
					}
				}
				if (mName != null)
					JOptionPane.showMessageDialog(null, mName + "은 이미 있는재료 입니다.\n이미 있는 재료는 본래의 가격으로 측정됩니다.");
			} else
				JOptionPane.showMessageDialog(null, "레시피가 이미 있습니다.");
		} else if (str == "수정") {
			if (rp == 1) {
				str = "update";
				String dSQL = null;
				String updateSQL;
				dSQL = "delete from comat where f_name = '" + foodname + "';";
				mc.makeSQL(dSQL);
				sql = str + " cook set f_price = " + price + ", f_recipe = '" + cooking + "', f_time = '" + time
						+ "' where f_name = '" + foodname + "';";
				for (int i = 0; i < mat.size(); i++) {
					updateSQL = "insert into comat(f_name,mat_name) values('" + foodname + "','" + mat.get(i) + "');";
					mc.makeSQL(updateSQL);
				}
				mSQL = "select mat_name from mprice;";
				rset = mc.mSQL(mSQL);
				try {
					while (rset.next()) {
						matname.add(rset.getString(1));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < mat.size(); i++) {
					cp = 0;
					for (int j = 0; j < matname.size(); j++) {

						if (matname.get(j).compareTo(mat.get(i)) == 0)
							cp++;
					}
					if (cp == 0) {
						mSQL = "insert into material(mat_name,mat_price,mat_group) values('" + mat.get(i) + "',"
								+ matprice.get(i) + ",'" + cat.get(i) + "');";
						martSQL = "insert into mprice(mat_name,big,home,poce) values('" + mat.get(i) + "'," + 0 + ","
								+ 0 + "," + 0 + ");";
						JOptionPane.showMessageDialog(null, mat.get(i)+"가(이) 재료로 등록 되었습니다.");
						mc.makeSQL(mSQL);
						mc.makeSQL(martSQL);
					} else {
						mName.add(mat.get(i));
					}
				}
				if (mName != null)
					JOptionPane.showMessageDialog(null, mName + "은 이미 있는재료 입니다.\n이미 있는 재료는 본래의 가격으로 측정됩니다.");
			}
		}

		mc.makeSQL(sql);
	}

	public void recipehandler(String foodname) {
		ResultSet rset;
		String dSQL = null;
		String str = "delete";
		int cp = 0;
		sql = "select f_name from cook;";
		rset = mc.mSQL(sql);
		try {
			while (rset.next()) {
				if (foodname.compareTo(rset.getString(1)) == 0)
					cp++;
			}
			if (cp == 0)
				JOptionPane.showMessageDialog(null, foodname + "이 목록에 없습니다..");
			else {
				dSQL = str + " from comat where f_name = '" + foodname + "';";
				sql = str + " from cook where f_name = '" + foodname + "';";
				mc.makeSQL(sql);
				mc.makeSQL(dSQL);
				JOptionPane.showMessageDialog(null, "삭제 완료.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deliveryhandler(JComboBox 배달음식, JTextField 가게이름, JTextField 음식이름, JTextField 가격, JTextField 전화번호,
			JTextField 카테고리) {
		try {
			String sql = null;
			ManagerConnection mc = new ManagerConnection();
			String str = (String) 배달음식.getSelectedItem();
			String name = new String(가게이름.getText());
			String food = new String(음식이름.getText());
			Integer price = new Integer(가격.getText());
			String tel = new String(전화번호.getText());
			String group = new String(카테고리.getText());

			if (str == "등록") {
				if (name.isEmpty() || food.isEmpty() || tel.isEmpty() || group.isEmpty()) {
					JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
				} else {
					str = "insert into";
					sql = str + " delivery(d_name,d_food,d_price,d_tel,d_group) values('" + name + "','" + food + "',"
							+ price + ",'" + tel + "','" + group + "');";
				}

			} else if (str == "수정") {
				if (name.isEmpty() || food.isEmpty() || tel.isEmpty() || group.isEmpty()) {

				} else {
					str = "update";
					sql = str + " delivery set d_price = " + price + " and d_tel = '" + tel + "' and d_group = '"
							+ group + "' where d_name = '" + name + "' and d_food = '" + food + "';";
				}

			}
			mc.makeSQL(sql);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
		}
	}

	public void deliveryhandler(JTextField 가게이름, JTextField 음식이름) {
		ResultSet rset;
		int cp = 0;
		String error;
		String name = new String(가게이름.getText());
		String food = new String(음식이름.getText());
		String str = "delete";
		sql = "select d_name, d_food from delivery;";
		if (name.isEmpty() || food.isEmpty()) {
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
		} else {
			rset = mc.mSQL(sql);
			try {
				while (rset.next()) {
					if (name.compareTo(rset.getString(1)) == 0) {
						cp++;
						if (food.compareTo(rset.getString(2)) == 0)
							cp++;
					}
				}
				if (cp == 0) {
					error = name;
					if (cp == 1)
						error += "의  " + food;
					JOptionPane.showMessageDialog(null, error + "가 없습니다.");
				} else {
					sql = str + " from delivery where d_name = '" + name + "' and d_food = '" + food + "';";
					mc.makeSQL(sql);
					JOptionPane.showMessageDialog(null, "삭제 완료.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
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

	public void PassWordHandler(JTextField tf_비밀번호) {
		ManagerConnection MC = new ManagerConnection();
		MC.makeSQL("update password set pw = '" + tf_비밀번호.getText() + "';");
		JOptionPane.showMessageDialog(null, "변경된 비밀번호는 = " + tf_비밀번호.getText() + "입니다.");
	}

	public void PlusMaterialHaler(DefaultListModel<String> model, ArrayList<String> mat, ArrayList<Integer> matprice,
			ArrayList<String> cat, JTextField tf_재료이름, JTextField tf_재료가격, JComboBox cb_카테고리, JList list_재료바구니) {
		model.clear();
		mat.add(tf_재료이름.getText());
		try {
			Integer mp = new Integer(tf_재료가격.getText());
			matprice.add(mp);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "가격에 정수를 입력해 주세요.");
		}
		cat.add((String) cb_카테고리.getSelectedItem());

		for (int i = 0; i < mat.size(); i++)
			model.addElement(mat.get(i) + "    " + matprice.get(i) + "    " + cat.get(i));
		list_재료바구니.setModel(model);
	}

	public void RemoveMaterialHandler(DefaultListModel<String> model, ArrayList<String> mat,
			ArrayList<Integer> matprice, ArrayList<String> cat, JList list_재료바구니) {
		int index = list_재료바구니.getSelectedIndex();
		model.remove(index);
		mat.remove(index);
		matprice.remove(index);
		cat.remove(index);

		list_재료바구니.setModel(model);
	}
}

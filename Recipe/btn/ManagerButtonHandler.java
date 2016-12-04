import java.awt.EventQueue;
import java.awt.image.*;
import java.sql.*;
import java.util.*;

import javax.swing.*;

public class ManagerButtonHandler {
	String sql;
	ManagerConnection mc = new ManagerConnection();

	public void noticehandler(JComboBox ��������, JTextField ������ȣ, JTextArea ��������) {
		try {
			ResultSet rset;
			String str = (String) ��������.getSelectedItem();
			Integer num = new Integer(������ȣ.getText());
			String text = new String(��������.getText());
			sql = "select notice_num from notice";
			rset = mc.mSQL(sql);
			int cp = 0;
			while (rset.next()) {
				if (num == rset.getInt(1)) {
					cp++;
				}
			}
			if (str == "���") {
				str = "insert into";
				if (text.isEmpty()) {
					JOptionPane.showMessageDialog(null, "���� ������ �����ϴ�.");
				} else {
					if (cp == 0) {
						sql = str + " notice(notice_num,notice_text) values(" + num + ",'" + text + "');";
						mc.makeSQL(sql);
					} else
						JOptionPane.showMessageDialog(null, "���� ��ȣ�� �̹� �ֽ��ϴ�.");
				}
			} else if (str == "����") {
				str = "update";
				if (text.isEmpty()) {
					JOptionPane.showMessageDialog(null, "���� ������ �����ϴ�.");
				} else {
					if (cp == 0) {
						sql = str + " notice set notice_text = '" + text + "' where notice_num = " + num + ";";
						mc.makeSQL(sql);
					} else
						JOptionPane.showMessageDialog(null, "���� ��ȣ�� �̹� �ֽ��ϴ�.");
				}
			} else {
				if (cp == 0)
					JOptionPane.showMessageDialog(null, "���� ��ȣ�� �̹� �ֽ��ϴ�.");
				else {
					str = "delete";
					sql = str + " from notice where notice_num = " + num + ";";
					mc.makeSQL(sql);
					JOptionPane.showMessageDialog(null, "���� �Ϸ�.");
				}
			}

		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "�߸��� �Է� �Դϴ�.");
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
		if (str == "���") {
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
						JOptionPane.showMessageDialog(null, mat.get(i)+"��(��) ���� ��� �Ǿ����ϴ�.");
						mc.makeSQL(mSQL);
						mc.makeSQL(martSQL);
					} else {
						mName.add(mat.get(i));
					}
				}
				if (mName != null)
					JOptionPane.showMessageDialog(null, mName + "�� �̹� �ִ���� �Դϴ�.\n�̹� �ִ� ���� ������ �������� �����˴ϴ�.");
			} else
				JOptionPane.showMessageDialog(null, "�����ǰ� �̹� �ֽ��ϴ�.");
		} else if (str == "����") {
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
						JOptionPane.showMessageDialog(null, mat.get(i)+"��(��) ���� ��� �Ǿ����ϴ�.");
						mc.makeSQL(mSQL);
						mc.makeSQL(martSQL);
					} else {
						mName.add(mat.get(i));
					}
				}
				if (mName != null)
					JOptionPane.showMessageDialog(null, mName + "�� �̹� �ִ���� �Դϴ�.\n�̹� �ִ� ���� ������ �������� �����˴ϴ�.");
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
				JOptionPane.showMessageDialog(null, foodname + "�� ��Ͽ� �����ϴ�..");
			else {
				dSQL = str + " from comat where f_name = '" + foodname + "';";
				sql = str + " from cook where f_name = '" + foodname + "';";
				mc.makeSQL(sql);
				mc.makeSQL(dSQL);
				JOptionPane.showMessageDialog(null, "���� �Ϸ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deliveryhandler(JComboBox �������, JTextField �����̸�, JTextField �����̸�, JTextField ����, JTextField ��ȭ��ȣ,
			JTextField ī�װ�) {
		try {
			String sql = null;
			ManagerConnection mc = new ManagerConnection();
			String str = (String) �������.getSelectedItem();
			String name = new String(�����̸�.getText());
			String food = new String(�����̸�.getText());
			Integer price = new Integer(����.getText());
			String tel = new String(��ȭ��ȣ.getText());
			String group = new String(ī�װ�.getText());

			if (str == "���") {
				if (name.isEmpty() || food.isEmpty() || tel.isEmpty() || group.isEmpty()) {
					JOptionPane.showMessageDialog(null, "�߸��� �Է� �Դϴ�.");
				} else {
					str = "insert into";
					sql = str + " delivery(d_name,d_food,d_price,d_tel,d_group) values('" + name + "','" + food + "',"
							+ price + ",'" + tel + "','" + group + "');";
				}

			} else if (str == "����") {
				if (name.isEmpty() || food.isEmpty() || tel.isEmpty() || group.isEmpty()) {

				} else {
					str = "update";
					sql = str + " delivery set d_price = " + price + " and d_tel = '" + tel + "' and d_group = '"
							+ group + "' where d_name = '" + name + "' and d_food = '" + food + "';";
				}

			}
			mc.makeSQL(sql);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "�߸��� �Է��Դϴ�.");
		}
	}

	public void deliveryhandler(JTextField �����̸�, JTextField �����̸�) {
		ResultSet rset;
		int cp = 0;
		String error;
		String name = new String(�����̸�.getText());
		String food = new String(�����̸�.getText());
		String str = "delete";
		sql = "select d_name, d_food from delivery;";
		if (name.isEmpty() || food.isEmpty()) {
			JOptionPane.showMessageDialog(null, "�߸��� �Է� �Դϴ�.");
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
						error += "��  " + food;
					JOptionPane.showMessageDialog(null, error + "�� �����ϴ�.");
				} else {
					sql = str + " from delivery where d_name = '" + name + "' and d_food = '" + food + "';";
					mc.makeSQL(sql);
					JOptionPane.showMessageDialog(null, "���� �Ϸ�.");
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

	public void PassWordHandler(JTextField tf_��й�ȣ) {
		ManagerConnection MC = new ManagerConnection();
		MC.makeSQL("update password set pw = '" + tf_��й�ȣ.getText() + "';");
		JOptionPane.showMessageDialog(null, "����� ��й�ȣ�� = " + tf_��й�ȣ.getText() + "�Դϴ�.");
	}

	public void PlusMaterialHaler(DefaultListModel<String> model, ArrayList<String> mat, ArrayList<Integer> matprice,
			ArrayList<String> cat, JTextField tf_����̸�, JTextField tf_��ᰡ��, JComboBox cb_ī�װ�, JList list_���ٱ���) {
		model.clear();
		mat.add(tf_����̸�.getText());
		try {
			Integer mp = new Integer(tf_��ᰡ��.getText());
			matprice.add(mp);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "���ݿ� ������ �Է��� �ּ���.");
		}
		cat.add((String) cb_ī�װ�.getSelectedItem());

		for (int i = 0; i < mat.size(); i++)
			model.addElement(mat.get(i) + "    " + matprice.get(i) + "    " + cat.get(i));
		list_���ٱ���.setModel(model);
	}

	public void RemoveMaterialHandler(DefaultListModel<String> model, ArrayList<String> mat,
			ArrayList<Integer> matprice, ArrayList<String> cat, JList list_���ٱ���) {
		int index = list_���ٱ���.getSelectedIndex();
		model.remove(index);
		mat.remove(index);
		matprice.remove(index);
		cat.remove(index);

		list_���ٱ���.setModel(model);
	}
}

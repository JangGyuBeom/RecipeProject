import java.awt.EventQueue;
import java.sql.*;
import java.util.*;

import javax.swing.*;

public class ManagerButtonHandler {
	String sql;
	ManagerConnection mc = new ManagerConnection();
	

	public void noticehandler(JComboBox ��������, JTextField ������ȣ, JTextArea ��������) {
		try {
			String str = (String) ��������.getSelectedItem();
			Integer num = new Integer(������ȣ.getText());
			String text = new String(��������.getText());
			if (str == "���") {
				str = "insert into";
				sql = str + " notice(notice_num,notice_text) values(" + num + ",'" + text + "');";
				JOptionPane.showMessageDialog(null, "�Է� �Ϸ�");
			} else if (str == "����") {
				str = "update";
				sql = str + " notice set notice_text = '" + text + "' where notice_num = " + num + ";";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			} else {
				str = "delete";
				sql = str + " from notice where notice_num = " + num + ";";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			}
			mc.makeSQL(sql);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "�߸��� �Է� �Դϴ�.");
		}

	}

	public void recipehandler(String str, String foodname, Integer price, String cooking, String time,
			ArrayList<String> mat, ArrayList<Integer> matprice, ArrayList<String> cat) {
		
		ArrayList<String> matname = new ArrayList <String>();
		String rmSQL = null; // ������-��� ���̺� sql ��
		String mSQL; // ��� ���̺� sql��
		String martSQL;
		ResultSet rset; 
		if(foodname!=null && price!=null && cooking!=null && time!=null && mat!=null && matprice !=null && cat!=null ){
		int cp; //��� �̸� �ߺ� ����
	
			if (str == "���") {	
		
			str = "insert into";
			sql = str + " cook(f_name,f_price,f_recipe,f_time) values('" + foodname + "'," + price + ",'" + cooking
					+ "','" + time + "');"; //������ ���̺� ��� sql
			for (int i = 0; i < mat.size(); i++){
				rmSQL = str + " comat(f_name,mat_name) values('" + foodname + "','" + mat.get(i) + "');";  //������ - ��� ���̺� ��� sql
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
					mSQL = str+" material(mat_name,mat_price,mat_group) values('"+mat.get(i)+"',"+matprice.get(i)+",'"+cat.get(i)+"');";//��� ��� sql
					martSQL = str+" mprice(mat_name,big,home,poce) values('"+mat.get(i)+"',"+0+","+0+","+0+");";
					mc.makeSQL(mSQL);
					mc.makeSQL(martSQL);
				}
			}
			JOptionPane.showMessageDialog(null, "�Է� �Ϸ�");
		} else if (str == "����") {
			str = "update";
			String dSQL = null;
			String updateSQL;
			dSQL = "delete from comat where f_name = '"+ foodname +"';";
			mc.makeSQL(dSQL);
			sql = str + " cook set f_price = " + price + ", f_recipe = '" + cooking + "', f_time = '" + time + "' where f_name = '" + foodname + "';";
			for (int i = 0; i < mat.size(); i++){
				updateSQL = "insert into comat(f_name,mat_name) values('" + foodname + "','" + mat.get(i) + "');";  //������ - ��� ���̺� ��� sql << 
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
					mSQL = "insert into material(mat_name,mat_price,mat_group) values('"+mat.get(i)+"',"+matprice.get(i)+",'"+cat.get(i)+"');";//��� ��� sql
					martSQL = "insert into mprice(mat_name,big,home,poce) values('"+mat.get(i)+"',"+0+","+0+","+0+");";
					mc.makeSQL(mSQL);
					mc.makeSQL(martSQL);
				}
			}
			
			
			JOptionPane.showMessageDialog(null, "���� �Ϸ�");
		}mc.makeSQL(sql);
		}
		else
			JOptionPane.showMessageDialog(null, "������� �����մϴ�.");
		
	}

	public void recipehandler(String foodname) {
		String dSQL = null;
		String str = "delete";
		dSQL = str + " from comat where f_name = '"+ foodname +"';";
		sql = str + " from cook where f_name = '" + foodname + "';";
		mc.makeSQL(sql);
		mc.makeSQL(dSQL);
		JOptionPane.showMessageDialog(null, "���� �Ϸ�");
	}

	public void deliveryhandler(JComboBox �������, JTextField �����̸�, JTextField �����̸�,
			JTextField ����, JTextField ��ȭ��ȣ, JTextField ī�װ�) {
		try {
			String sql;
			ManagerConnection mc = new ManagerConnection();
			String str = (String) �������.getSelectedItem();
			String name = new String(�����̸�.getText());
			String food = new String(�����̸�.getText());
			Integer price = new Integer(����.getText());
			String tel = new String(��ȭ��ȣ.getText());
			String group = new String(ī�װ�.getText());
			if (str == "���") {
				str = "insert into";
				sql = str + " delivery(d_name,d_food,d_price,d_tel,d_group) values('" + name + "','" + food + "',"
						+ price + ",'" + tel + "','" + group + "');";
				JOptionPane.showMessageDialog(null, "�Է� �Ϸ�");
			} else if (str == "����") {
				str = "update";
				sql = str + " delivery set d_price = " + price + " and d_tel = '" + tel + "' and d_group = '" + group
						+ "' where d_name = '" + name + "' and d_food = '" + food + "';";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			} else {
				str = "delete";
				sql = str + " from delivery where d_name = '" + name + "' and d_food = '" + food + "';";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			}
			mc.makeSQL(sql);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "������� �ֽ��ϴ�.");
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
		MC.makeSQL("update password set pw = '"+tf_��й�ȣ.getText()+"';");
		JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.\n ����� ��й�ȣ�� = "+tf_��й�ȣ.getText()+"�Դϴ�.");
	}
	public void PlusMaterialHaler(DefaultListModel<String> model, ArrayList<String> mat, ArrayList<Integer> matprice, ArrayList<String> cat, JTextField tf_����̸�, JTextField tf_��ᰡ��, JComboBox cb_ī�װ�, JList list_���ٱ���){
		model.clear();	//JList �� �ʱ�ȭ�� ���ؼ� ���⼭ clear() �� �ؾ���.
		mat.add(tf_����̸�.getText());
		try{
			Integer mp = new Integer(tf_��ᰡ��.getText());	//int ������ �ٲ��ֱ� ���ؼ� ����.
			matprice.add(mp);
		} catch (Exception k) {
			JOptionPane.showMessageDialog(null, "���ݿ� ������ �Է��� �ּ���.");
		}			
		cat.add((String)cb_ī�װ�.getSelectedItem());

		// ������ sql �� ������� �ϴ°� �Ʒ����� JList â�� ǥ�� �ҷ��� �ϴ°�
		
		for(int i = 0; i < mat.size(); i++)
			model.addElement(mat.get(i)+"    "+matprice.get(i)+"    "+cat.get(i));
		list_���ٱ���.setModel(model);
	}
	public void RemoveMaterialHandler(DefaultListModel<String> model, ArrayList<String> mat, ArrayList<Integer> matprice, ArrayList<String> cat, JList list_���ٱ���){
		int index = list_���ٱ���.getSelectedIndex();
		model.remove(index);
		mat.remove(index);
		matprice.remove(index);
		cat.remove(index);
		
		list_���ٱ���.setModel(model); //Jlist �� �ٽ� ���� �����ֱ� ���ؼ�
	}
}

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ManagerButtonHandler {
	String sql;
	ManagerConnection mc = new ManagerConnection();
	public void noticehandler(JComboBox comboBox, JTextField textField, JTextArea textArea) {
		try {
			String str = (String) comboBox.getSelectedItem();
			Integer num = new Integer(textField.getText());
			String text = new String(textArea.getText());
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

	public void recipehandler(String str, String foodname, Integer price, String cooking, String time) {
		try{	
			if (str == "���") {
				str = "insert into";
				sql = str + " cook(f_name,f_price,f_recipe,f_time) values('" + foodname + "'," + price + ",'"+cooking+"','"+time+"');";
				JOptionPane.showMessageDialog(null, "�Է� �Ϸ�");
			} else if (str == "����") {
				str = "update";
				sql = str + " cook set f_price = " + price + " and f_recipe = '"+cooking+"' and f_time = '"+time+"' where f_name = '" + foodname + "';";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			} else {
				str = "delete";
				sql = str + " from cook where f_name = '" + foodname + "';";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			}
			mc.makeSQL(sql);
		} catch(Exception k){
			JOptionPane.showMessageDialog(null, "�� ������ �ֽ��ϴ�.");
		}
	}
	public void recipehandler(String str, String foodname){
		try{
			str = "delete";
			sql = str + " from cook where f_name = '" + foodname + "';";
			mc.makeSQL(sql);
			JOptionPane.showMessageDialog(null, "���� �Ϸ�");
		}catch(Exception k){
			JOptionPane.showMessageDialog(null, "�������̸��� �Է����� �ʾҽ��ϴ�.\n�Է��� �ּ���.");
		}
	}
	
	public void deliveryhandler(JComboBox comboBox, JTextField textField_1, JTextField textField_2, JTextField textField_3, JTextField textField_4, JTextField textField_5) {
		try{
			String sql;
			ManagerConnection mc = new ManagerConnection();
			String str = (String)comboBox.getSelectedItem();
			String name = new String(textField_1.getText());
			String food = new String(textField_2.getText());
			Integer price = new Integer(textField_3.getText());
			String tel = new String(textField_4.getText());
			String group = new String(textField_5.getText());
			if (str == "���") {
				str = "insert into";
				sql = str + " delivery(d_name,d_food,d_price,d_tel,d_group) values('" + name + "','" + food + "',"+price+",'"+tel+"','"+group+"');";
				JOptionPane.showMessageDialog(null, "�Է� �Ϸ�");
			} else if (str == "����") {
				str = "update";
				sql = str + " delivery set d_price = " + price + " and d_tel = '"+tel+"' and d_group = '"+group+"' where d_name = '" + name + "' and d_food = '"+food+"';";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			} else {
				str = "delete";
				sql = str + " from delivery where d_name = '" + name + "' and d_food = '"+food+"';";
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			}
			mc.makeSQL(sql);
		} catch(Exception k){
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
	public void PassWordHandler(){
		
	}
}

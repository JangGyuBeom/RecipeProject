import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ManagerButtonHandler {

	public void noticehandler(JComboBox comboBox, JTextField textField, JTextArea textArea) {
		try {
			String sql;
			ManagerConnection mc = new ManagerConnection();
			String str = (String) comboBox.getSelectedItem();
			Integer num = new Integer(textField.getText());
			String text = new String(textArea.getText());
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

	public void recipehandler(JComboBox comboBox, JTextField textField_1, JTextField textField_2, JTextArea textArea, JTextField textField_3) {
		/*try{	
			String sql;
			ManagerConnection mc = new ManagerConnection();
			String str = (String)comboBox.getSelectedItem();
			String food = new String(textField_1.getText());
			Integer price = new Integer(textField_2.getText());
			String cooking = new String(textArea.getText());
			String time= new String(textField_3.getText());
			if (str == "등록") {
				str = "insert into";
				sql = str + " cook(f_name,f_price,f_recipe,f_time) values('" + food + "'," + price + ",'"+cooking+"','"+time+"');";
				JOptionPane.showMessageDialog(null, "입력 완료");
			} else if (str == "수정") {
				str = "update";
				sql = str + " cook set f_price = " + price + " and f_recipe = '"+cooking+"' and f_time = '"+time+"' where f_name = '" + food + "';";
				JOptionPane.showMessageDialog(null, "수정 완료");
			} else {
				str = "delete";
				sql = str + " from cook where f_name = '" + food + "';";
				JOptionPane.showMessageDialog(null, "삭제 완료");
			}
			mc.makeSQL(sql);
		} catch(Exception k){
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
		}*/
	}

	public void deliveryhandler(JComboBox comboBox, JTextField textField_1, JTextField textField_2, JTextField textField_3, JTextField textField_4, JTextField textField_5) {
		/*try{
			String sql;
			ManagerConnection mc = new ManagerConnection();
			String str = (String)comboBox.getSelectedItem();
			String name = new String(textField_1.getText());
			String food = new String(textField_2.getText());
			Integer price = new Integer(textField_3.getText());
			String tel = new String(textField_4.getText());
			String group = new String(textField_5.getText());
			if (str == "등록") {
				str = "insert into";
				sql = str + " delivery(d_name,d_food,d_price,d_tel,d_group) values('" + name + "','" + food + "',"+price+",'"+tel+"','"+group+"');";
				JOptionPane.showMessageDialog(null, "입력 완료");
			} else if (str == "수정") {
				str = "update";
				sql = str + " delivery set d_price = " + price + " and d_tel = '"+tel+"' and d_group = '"+group+"' where d_name = '" + name + "' and d_food = '"+food+"';";
				JOptionPane.showMessageDialog(null, "수정 완료");
			} else {
				str = "delete";
				sql = str + " from delivery where d_name = '" + name + "' and d_food = '"+food+"';";
				JOptionPane.showMessageDialog(null, "삭제 완료");
			}
			mc.makeSQL(sql);
		} catch(Exception k){
			JOptionPane.showMessageDialog(null, "잘못된 입력 입니다.");
		}*/
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
}

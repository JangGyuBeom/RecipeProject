import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ManagerButtonHandler {
	
	public void noticehandler(JComboBox comboBox,JTextField textField,JTextArea textArea){
		try{
			String str = (String)comboBox.getSelectedItem();
			Integer num = new Integer(textField.getText());
			String text = new String(textArea.getText());
			Jdbc notice = new Jdbc();
			if(str == "���")
			{
				str = "insert into";
				notice.insertSQL(str+" notice(notice_num,notice_text) values("+num+",'"+text+"');");
				JOptionPane.showMessageDialog(null,"�Է� �Ϸ�");
			}
			else if(str == "����")
			{
				str = "update";
				notice.insertSQL(str+" notice set notice_text = '"+text+"' where notice_num = "+num+";");
				JOptionPane.showMessageDialog(null,"���� �Ϸ�");
			}
			else
			{
				str = "delete";
				notice.insertSQL(str+" from notice where notice_num = "+num+";");
				JOptionPane.showMessageDialog(null,"���� �Ϸ�");
			}
			System.out.println(str);
			System.out.println(num);
			System.out.println(text);
			}
			catch(Exception k){
				JOptionPane.showMessageDialog(null,"�߸��� �Է� �Դϴ�.");
			}
		
	}
	public void recipehandler(){
		
	}
	public void deliveryhandler(){
		
	}
	public void inquireshandler(){
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


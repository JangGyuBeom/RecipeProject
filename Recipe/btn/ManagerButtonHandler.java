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
			if(str == "등록")
			{
				str = "insert into";
				notice.insertSQL(str+" notice(notice_num,notice_text) values("+num+",'"+text+"');");
				JOptionPane.showMessageDialog(null,"입력 완료");
			}
			else if(str == "수정")
			{
				str = "update";
				notice.insertSQL(str+" notice set notice_text = '"+text+"' where notice_num = "+num+";");
				JOptionPane.showMessageDialog(null,"수정 완료");
			}
			else
			{
				str = "delete";
				notice.insertSQL(str+" from notice where notice_num = "+num+";");
				JOptionPane.showMessageDialog(null,"삭제 완료");
			}
			System.out.println(str);
			System.out.println(num);
			System.out.println(text);
			}
			catch(Exception k){
				JOptionPane.showMessageDialog(null,"잘못된 입력 입니다.");
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


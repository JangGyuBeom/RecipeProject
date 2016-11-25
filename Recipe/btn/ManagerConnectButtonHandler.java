import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ManagerConnectButtonHandler  {
	
	public void lockhandler(JTextField tf_password){
		String sql;
		String password;
		ManagerConnection MC = new ManagerConnection();
		
		sql = "select pw from password;";
		
		password = MC.makePW_SQL(sql);
		
		String passwordcp = new String(tf_password.getText());
		if(password.compareTo(passwordcp) == 0)
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						RecipeManager frame = new RecipeManager();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		else
		{
			JOptionPane.showMessageDialog(null,"비밀번호를 다시 입력 해 주세요.");
		}
		
	}
	

}
